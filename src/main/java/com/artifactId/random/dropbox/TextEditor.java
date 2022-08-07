package com.artifactId.random.dropbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;


@Getter
public class TextEditor {

  List<String> lines = new ArrayList<>();
  String textState = "";
  int position = 0;
  Selection selection;
  String clipboard;
  Map<String, MyDoc> docs = new HashMap<>();
  List<EditorState> undos = new ArrayList<>();
  List<EditorState> redos = new ArrayList<>();


  String[] solution(String[][] queries) {
    Arrays.stream(queries)
      .map(this::toOperation)
      .forEach(this::apply);
    return lines.toArray(new String[0]);
  }

  private void apply(Operation operation) {
    System.out.println(operation.operationType + " " + operation.text);
    String operationType = operation.operationType;
    String text = operation.text;
    if (operationType.equals("APPEND")) {
      appendOperation(text);
    }

    if (operationType.equals("MOVE")) {
      moveOperation(text);
    }

    if (operationType.equals("BACKSPACE")) {
      backspaceOperation();
    }

    if (operationType.equals("SELECT")) {
      createSelectionOperation(operation);
    }

    if (operationType.equals("COPY")) {
      copyOperation();
    }

    if (operationType.equals("PASTE")) {
      pasteOperation();
    }

    if (operationType.equals("UNDO")) {
      undoOperation();
    }

    if (operationType.equals("REDO")) {
      redoOperation();
    }

    if (operationType.equals("CREATE")) {
      createOperation(operation);
    }

    addLine(operation);
  }

  private void createOperation(Operation operation) {
    if (docs.containsKey(operation.text)) {
      docs.put(operation.text, new MyDoc());
    }
  }

  private void addLine(Operation operation) {
    if (operation.operationType.equals("CREATE") || operation.operationType.equals("SWITCH")) {
      lines.add("");
      return;
    }

    lines.add(textState);
  }

  private void undoOperation() {
    redos.add(getCurrentEditorState());
    restoreEditorState(undos);
  }

  private void redoOperation() {
    if (!redos.isEmpty()) {
      undos.add(getCurrentEditorState());
    }
    restoreEditorState(redos);
  }

  private void restoreEditorState(List<EditorState> editorStateQueue) {
    if (editorStateQueue.isEmpty()) {
      return;
    }

    int index = editorStateQueue.size() - 1;
    EditorState editorState = editorStateQueue.get(index);
    applyState(editorState);
    editorStateQueue.remove(index);
  }

  private void applyState(EditorState editorState) {
    this.textState = editorState.textState;
    this.position = editorState.position;
    this.selection = editorState.selection;
  }

  private void pasteOperation() {
    if (clipboard == null) {
      return;
    }
    appendOperation(clipboard);
  }

  private void copyOperation() {
    if (selection == null) {
      return;
    }
    clipboard = textState.substring(selection.start, selection.end);
  }

  private void remove(int start, int end) {
    start = toBound(start);
    end = toBound(end);
    textState = getLeft(start) + getRight(end);
  }

  private void createSelectionOperation(Operation operation) {
    selection = new Selection(toBound(Integer.parseInt(operation.text)), toBound(Integer.parseInt(operation.text2)));
  }

  private void appendOperation(String text) {
    if (selection != null || !text.isEmpty()) {
      modificationPerformed();
    }
    if (selection != null) {
      removeActiveSelection();
    }
    append(text);

  }

  private void modificationPerformed() {
    undos.add(getCurrentEditorState());
    redos.clear();
  }

  private EditorState getCurrentEditorState() {
    return new EditorState(textState, position, selection);
  }

  private void removeActiveSelection() {
    remove(selection.start, selection.end);
    position = selection.start;
    selection = null;
  }

  private void append(String text) {
    textState = getLeft(position) + text + getRight(position);
    position += text.length();
  }

  private String getRight(int position) {
    if (position == textState.length()) {
      return "";
    }
    return textState.substring(position, textState.length());
  }

  private String getLeft(int position) {
    return textState.substring(0, Math.min(position, textState.length()));
  }

  private void moveOperation(String text) {
    position = toBound(Integer.parseInt(text));
    selection = null;
  }


  private void backspaceOperation() {
    if (selection != null) {
      modificationPerformed();
      removeActiveSelection();
      return;
    }

    if (position == 0) {
      return;
    }
    modificationPerformed();
    remove(position - 1, position);
    position= position -1;
  }


  private Operation toOperation(String[] x) {
    String operationText = x.length > 1 ? x[1] : "";
    String operationText2 = x.length > 2 ? x[2] : "";
    return new Operation(x[0], operationText, operationText2);
  }

  class Operation {

    String operationType;
    String text;
    String text2;

    public Operation(String operationType, String text, String text2) {
      this.operationType = operationType;
      this.text = text;
      this.text2 = text2;
    }
  }

  class Selection {

    int start;
    int end;

    public Selection(int start, int end) {
      this.start = start;
      this.end = end;
    }

  }

  int toBound(int i) {
    return Math.min(Math.max(0, i), textState.length());
  }

  class EditorState {

    String textState;
    int position;
    Selection selection;

    public EditorState(String textState, int position,
      Selection selection) {
      this.textState = textState;
      this.position = position;
      this.selection = selection;
    }
  }

  class MyDoc {

  }


}
