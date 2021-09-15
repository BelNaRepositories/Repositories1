package com.company;
import java.util.Arrays;

public class Number {
    public static int number1;
    public static int number2;

      public static void getNumber  () {

          try { Arrays.sort(Main.all1);
                Arrays.sort(Main.all2);
              if (Arrays.binarySearch(Main.all1, Main.numb1) >= 0 && Arrays.binarySearch(Main.all1, Main.numb2) >= 0) {
                  for (int i = 0; i < Main.all.length - 10; i++) {
                      String x = Main.all[i];
                      if (x.equals(Main.numb1)) {
                         Main.numb5 = x;
                          number1 = Integer.parseInt(Main.numb1);
                          for (int j = 0; j < Main.all.length - 10; j++) {
                              String y = Main.all[j];
                              if (y.equals(Main.numb2)) {
                                  Main.numb6 = y;
                                  number2 = Integer.parseInt(Main.numb2);
                                  }
                          }
                      }
                  }
              } else if (Arrays.binarySearch(Main.all2, Main.numb1) >= 0 && Arrays.binarySearch(Main.all2, Main.numb2) >= 0) {
                  for (int i = 10; i < Main.all.length; i++) {
                      String x = Main.all[i];
                      if (x.equals(Main.numb1)) {
                          Main.numb3 = x;
                          Main.numb1 = Main.all[i - 10];
                          number1 = Integer.parseInt(Main.numb1);
                          for (int j = 10; j < Main.all.length; j++) {
                              String y = Main.all[j];
                              if (y.equals(Main.numb2)) {
                                  Main.numb4 = y;
                                  Main.numb2 = Main.all[j - 10];
                                  number2 = Integer.parseInt(Main.numb2);
                                 }
                          }
                      }
                  }
              }

              if (Arrays.binarySearch(Main.all1, Main.numb1) < 0 && Arrays.binarySearch(Main.all2, Main.numb1) < 0
                      || Arrays.binarySearch(Main.all1, Main.numb2) < 0 && Arrays.binarySearch(Main.all2, Main.numb2) < 0
                      || Arrays.binarySearch(Main.all1, Main.numb1) >= 0 && Arrays.binarySearch(Main.all2, Main.numb2) >= 0
                      || Arrays.binarySearch(Main.all2, Main.numb1) >= 0 && Arrays.binarySearch(Main.all1, Main.numb2) >= 0)
                  throw new Exception();
          } catch (Exception e) {
              System.err.println("Используются одновременно разные системы счисления!");
              System.exit(0);
          }
          }
      }
