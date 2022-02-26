package com.artifactId.random;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Josephus {

  int findJosephus(int n) {
    List<Integer> integers = IntStream.range(0, n).boxed().collect(Collectors.toList());
    int i = 1;
    while (integers.size() != 1) {
      integers.remove(i);
      i = (i + 1) % integers.size();
    }

    return integers.get(0);
  }

  int Josephus2(int n) {
    List<Boolean> active = IntStream.range(0, n).mapToObj(x -> true).collect(Collectors.toList());
    int warriorsLeft = active.size();
    int currentIndex = 0;
    while (warriorsLeft != 1) {
      int aliveWarrior = findAlliveWarriorBiggerThanIndex(currentIndex, active);
      active.set(aliveWarrior, false);
      warriorsLeft--;
      currentIndex = findAlliveWarriorBiggerThanIndex(aliveWarrior, active);
    }

    return findAlliveWarriorBiggerThanIndex(0, active);
  }

  private int findAlliveWarriorBiggerThanIndex(int currentIndex, List<Boolean> active) {
    OptionalInt first = IntStream.range(0, active.size()).filter(x -> x > currentIndex)
      .filter(active::get)
      .findFirst();
    if (first.isPresent())
      return first.getAsInt();

    return IntStream.range(0, active.size()).filter(active::get).findFirst().getAsInt();
  }


}
