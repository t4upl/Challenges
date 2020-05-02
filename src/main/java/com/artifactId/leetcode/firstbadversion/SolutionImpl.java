package com.artifactId.leetcode.firstbadversion;

/**
 * Runtime: 35 ms, faster than 5.35% of Java online submissions for First Bad Version.
 * Memory Usage: 38 MB, less than 5.63% of Java online submissions for First Bad Version.
 */
public class SolutionImpl implements Solution {

  IsBadVersion isBadVersion;

  public SolutionImpl(IsBadVersion isBadVersion) {
    this.isBadVersion = isBadVersion;
  }

  @Override
  public int firstBadVersion(int n) {
    if (n < 2) {
      return n;
    }

    Pair start = new Pair(0);
    Pair end = new Pair(n -1);
    start.setResult();
    end.setResult();

    if (start.result) {
       return start.getVersion();
    }

    if (!end.result) {
      return -1;
    }

    while (start.index + 1 != end.index && start.index != end.index) {
      int midIndex = getAverageOverflowSafe(start, end);
      if (midIndex < start.index || midIndex > end.index) {
        throw new RuntimeException(String.format("Something went terribly wrong: %s %s %s",start.index, midIndex, end.index));
      }
      Pair mid = new Pair(midIndex);
      mid.setResult();

      if (!mid.result) {
        start = mid;
      } else {
        end = mid;
      }
    }


    return start.result ? start.getVersion() : end.getVersion();
  }

  private int getAverageOverflowSafe(Pair start, Pair end) {
    int a = start.index;
    int b = end.index;
    return (a / 2) + (b / 2) + ((a % 2 + b % 2) / 2);
  }

  class Pair {
    int index;
    boolean result;

    public Pair(int index) {
      this.index = index;
    }

    int getVersion() {
      return index +1;
    }

    void setResult() {
      this.result = isBadVersion.isBadVersion(getVersion());
    }

  }

  public interface IsBadVersion {
    boolean isBadVersion(int version);
  }

}
