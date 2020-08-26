package com.artifactId.leetcode.minimumcostfortickets;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Cost For Tickets.
 * Memory Usage: 37.5 MB, less than 71.69% of Java online submissions for Minimum Cost For Tickets.
 */
public class Solution {

  int[] days;
  int[] costs;
  int[] valid;
  int[] lookUp;

  public int mincostTickets(int[] days, int[] costs) {
    return mincostTickets(days, costs, new int[]{1, 7, 30});
  }

  public int mincostTickets(int[] days, int[] costs, int[] valid) {
    this.days = days;
    this.costs = costs;
    this.valid = valid;
    this.lookUp = new int[days.length];

    return mincostTickets(0);
  }

  int mincostTickets(int index) {
    if (index  >= days.length) {
      return 0;
    }

    if (lookUp[index] != 0) {
      return lookUp[index];
    }

    int cost0 = getCost(index, 0);
    int cost1 = getCost(index, 1);
    int cost2 = getCost(index, 2);

    int min = Math.min(cost0, Math.min(cost1, cost2));
    lookUp[index] = min;
    return min;
  }

  private int getCost(int index, int costIndex) {
    int lastValidDay =  getLastValidDay(index, valid[costIndex]);
    return costs[costIndex] + mincostTickets(lastValidDay + 1);
  }

  private int getLastValidDay(int index, int validPeriod) {
    int nextIndex = index;
    while (days[nextIndex] - days[index] < validPeriod) {
      nextIndex++;
      if (nextIndex == days.length) {
        return days.length;
      }
    }

    return nextIndex - 1;
  }

}
