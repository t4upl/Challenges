package com.artifactId.leetcode.hard.freedomtrail514;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    private Map<Character, Integer[]> charToPostion = new HashMap<>();

    public int findRotateSteps(String ring, String key) {
        initCharToPosition(ring);
        int keyPosition = 0;
        List<State> states = List.of(new State(0, 0));
        while (keyPosition < key.length()) {
            states = findStates(key, states, keyPosition, ring.length());
            keyPosition++;
        }

        return states.stream().mapToInt(State::getNumberOfMoves).min().orElse(-1) + key.length();

    }

    private void initCharToPosition(String ring) {
        Map<Character, List<Integer>> charToPostion = new HashMap<>();
        IntStream.range(0, ring.length()).forEach(index -> {
            char c = ring.charAt(index);
            charToPostion.putIfAbsent(c, new ArrayList<>());
            charToPostion.get(c).add(index);
        });
        this.charToPostion = charToPostion.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, x1 -> x1.getValue().stream().sorted().toArray(Integer[]::new)));
    }

    private List<State> findStates(String key, List<State> states, int keyPosition, int ringLength) {
        System.out.println(states.stream().map(State::toString).collect(Collectors.joining(" | ")));
        char targetCharacter = key.charAt(keyPosition);
        Integer[] targetCharacterPosition = charToPostion.get(targetCharacter);
        Map<Integer, Integer> targetPositionToNumberOfMoves = new HashMap<>();
        states.forEach(state -> {
            int ringOffset = state.getRingOffset();
            int insertPosition = Arrays.binarySearch(targetCharacterPosition, ringOffset);
            insertPosition = insertPosition > -1 ? insertPosition : -insertPosition - 1;
            int right = cyclicGet(targetCharacterPosition, insertPosition);
            int left = cyclicGet(targetCharacterPosition, insertPosition - 1);

            int rightDistance = coutnDistance(ringOffset, right, ringLength);
            int leftDistance = coutnDistance(left, ringOffset, ringLength);

            update(targetPositionToNumberOfMoves, state, right, rightDistance);
            update(targetPositionToNumberOfMoves, state, left, leftDistance);
        });
        return targetPositionToNumberOfMoves.entrySet().stream()
                .map(entry -> new State(entry.getKey(), entry.getValue()))
                .toList();
    }

    private static void update(Map<Integer, Integer> targetPositionToNumberOfMoves, State state, int right, int rightDistance) {
        targetPositionToNumberOfMoves.putIfAbsent(right, state.getNumberOfMoves() + rightDistance);
        if (state.getNumberOfMoves() + rightDistance < targetPositionToNumberOfMoves.get(right) ) {
            targetPositionToNumberOfMoves.put(right, state.getNumberOfMoves() + rightDistance);
        }
    }

    private int coutnDistance(int start, int end, int length) {
        if (end >= start) {
            return end - start;
        }
        return length - start + end;
    }

    private int cyclicGet(Integer[] targetCharacterPosition, int insertPosition) {
        if (insertPosition < 0) {
            return targetCharacterPosition[targetCharacterPosition.length -1];
        }

        if (insertPosition == targetCharacterPosition.length) {
            return targetCharacterPosition[0];
        }
        return targetCharacterPosition[insertPosition];
    }


    private class State {
        int ringOffset;
        int numberOfMoves;

        public State(int ringOffset, int numberOfMoves) {
            this.ringOffset = ringOffset;
            this.numberOfMoves = numberOfMoves;
        }

        public int getNumberOfMoves() {
            return numberOfMoves;
        }

        public int getRingOffset() {
            return ringOffset;
        }

        @Override
        public String toString() {
            return "State{" +
                    "ringOffset=" + ringOffset +
                    ", numberOfMoves=" + numberOfMoves +
                    '}';
        }
    }

}
