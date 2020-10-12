package com.artifactId.rocketchallenge.dynatrace;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Token {

  public static void main(String[] args) {
    solve();
  }


  public static int solve() {
    String LOG_FILE = "dynatrace.log";
    String data = "";

    String fileName = "C:\\Users\\Administrator\\Desktop\\dynatrace_example.log";

    String regex = "\\w{5}:\\w{3}:\\w{5}";

    int result = 0;
    try {
      File myObj = new File(fileName);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data2 = myReader.nextLine();
        boolean b = Pattern.compile(regex).matcher(data2).find();
        if (b) {
          result++;
        }
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    return result;
  }


}
