package com.artifactId.challengerocket.y2022.pzu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class InsuranceServiceGroupingTest {

  @Test
  public void test1() {
    String input = "SKIPwarszawa;oc;zdrowotne\n"
      + "bielsko-biała;na życie ;od powodzi\n"
      + "łódź;  od ognia;OD NIESZCZĘŚLIWYCH WYPADKÓW;ac\n\n"
      + "  ŁÓDŹ;domu;na wypadek straty pracy;Ac";
    Map<String, String[]> expectedOutput = new HashMap<>();

    expectedOutput.put("łódź", new String[]{"od ognia", "od nieszczęśliwych wypadków", "ac", "domu",
      "na wypadek straty pracy"});
    expectedOutput.put("bielsko-biała", new String[]{"na życie", "od powodzi"});

    InputStream inputStream = new java.io.ByteArrayInputStream(input.getBytes());
    InsuranceServiceGrouping grouping = new InsuranceServiceGrouping();
    Map<String, String[]> output = grouping.processFile(inputStream);

    assertEquals(output.size(), expectedOutput.size());
    assertTrue(output.entrySet().stream().allMatch(e -> {
      String[] expectedOutputArray = expectedOutput.get(e.getKey());
      if (expectedOutputArray == null) {
        return false;
      }
      String[] outputArray = e.getValue();
      java.util.Arrays.sort(outputArray);
      java.util.Arrays.sort(expectedOutputArray);
      return java.util.Arrays.equals(outputArray, expectedOutputArray);
    }));
  }


}