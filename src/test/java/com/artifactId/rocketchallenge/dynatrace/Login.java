package com.artifactId.rocketchallenge.dynatrace;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login {

  public static void main(String[] args) {
    solve();
  }


  public static List<String> solve() {
    String LOG_FILE = "dynatrace.log";
    String data = "";
    List<String> result = new ArrayList<String>();

    String fileName = "C:\\Users\\Administrator\\Desktop\\dynatrace_example.log";
    Map <String, Integer> map = new HashMap<>();
    map.put("57.48.9.100", 0);
    map.put("2.21.107.254", 0);
    map.put("130.25.179.252", 0);

    try {
      File myObj = new File(fileName);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data2 = myReader.nextLine();
        System.out.println(data2);
        if (data2.contains("Authorization")) {
          Pattern pattern = Pattern.compile("clientIp=(\\S+)");
          Matcher matcher = pattern.matcher(data2);
          matcher.find();
          String group = matcher.group(1);
          if (map.containsKey(group)) {
            map.put(group, map.get(group) + 1);
          }
        }
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    result.add(getEntry("57.48.9.100", map));
    result.add(getEntry("2.21.107.254", map));
    result.add(getEntry("130.25.179.252", map));

    return result;
  }

  static String getEntry (String key, Map<String, Integer> map) {
    return String.format("%s successful logins from that %s", map.get(key), key);
  }

}
