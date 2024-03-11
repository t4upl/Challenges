package com.artifactId.random.database;

import com.artifactId.random.database.command.Command;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.*;

public class Database {

    Transaction transaction = null;

    Map<String, Integer> keyToValue = new HashMap<>();

    Map<Integer, Integer> valueToFrequency = new HashMap<>();

    @Getter
    List<String> output = new ArrayList<>();

    void runCommands(List<Command> commands) {
        commands.forEach(command -> command.run(this));
    }

    private Optional<Transaction> getTransaction() {
        return Optional.ofNullable(transaction);
    }

    public void set(String key, Integer value) {
        Optional<Transaction> transaction = getTransaction();
        if (transaction.isEmpty()) {
            setInner(key, value);
            return;
        }

        transaction.get().getToBeAdded().put(key, value);
    }

    private void setInner(String key, Integer value) {
        keyToValue.put(key, value);
        valueToFrequency.put(value, valueToFrequency.getOrDefault(value, 0) + 1);
    }

    public Optional<String> get(String key) {
        return Optional.ofNullable(keyToValue.get(key)).map(Object::toString);
    }

    void rollBack() {

    }

    public void delete(String key) {
        Integer value = keyToValue.get(key);
        keyToValue.remove(key);
        valueToFrequency.put(value, valueToFrequency.getOrDefault(value, 0) - 1);
    }

    public Integer count(String value) {
        return valueToFrequency.getOrDefault(Integer.valueOf(value), 0);
    }

    public void commit() {
        transaction.getToBeAdded().forEach(this::setInner);
        transaction = null;
    }

    public void start() {
        transaction = new Transaction();
    }

    public void rollback() {
        transaction = null;
    }

    @NoArgsConstructor
    @Getter
    public class Transaction {
        Map<String, Integer> toBeAdded = new HashMap<>();

        List<Change> changes;
    }

    private abstract class Change {
        abstract Map<String, Integer> evaluate();
    }

    private class SimpleChange {

    }


//
//
//    private class Change {
//        int level;
//        List<Change>
//        Map<String, String> keyToValue = new HashMap<>();
//    }

}
