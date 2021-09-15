package com.company;
import java.util.Arrays;
import java.util.Scanner;



public class Main {

    public static String[] all = new String[] { "1","2","3","4","5","6","7","8","9","10",
            "I","II","III","IV","V","VI","VII","VIII","IX","X"};
    public static String numb1 ;
    public static String symbol;
    public static String numb2;
    public static String numb3;
    public static String numb4;
    public static String numb5;
    public static String numb6;
    public static String res;
    public static int result2;
    static String[] all1 = Arrays.copyOfRange(Main.all, 0, 10);
    static String[] all2 = Arrays.copyOfRange(Main.all, 10, Main.all.length);


    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        console.close();
        try {
            String[] numbers = input.split(" ");
            numb1 = numbers[0];
            numb5 = numbers[0];
            symbol = numbers[1];
            numb2 = numbers[2];
            numb6 = numbers[0];
            if (numbers.length != 3)
            throw new Exception();
        } catch (Exception e) {
            System.err.println("Неправильный ввод данных. Пример: 1 пробел + пробел 2!");
            System.exit(0);

        }
        Number.getNumber();
        Operations.getOperations();

        result2 = Operations.result;
        res = String.valueOf(Operations.result);

        if (Arrays.binarySearch(all1, numb5) >= 0 &&
            Arrays.binarySearch(all1, numb6) >= 0) {
            System.out.println(res);
        }
        else if (Arrays.binarySearch(all2, numb3) >= 0 && Arrays.binarySearch(all2, numb4) >= 1 && result2 <= 10) {
            try {
                for (int i = 0; i < all.length - 10; i++) {
                    if (res.equals(all[i])) {
                        res = all[i + 10];
                        System.out.println(res);
                    }
                }
                if (res.startsWith("-") || res.startsWith("0"))
                    throw new Exception();
            } catch (Exception e) {
                System.err.println("В римской системе нет отрицательных чисел!");
                System.exit(0);
            }
        }
        else if (Arrays.binarySearch(all2,numb3) >=0  &&
            Arrays.binarySearch(all2,numb4) >=0 && result2 >10 && result2 <=49) {
            int x = result2 / 10;
            int y = result2 - x * 10;
            String res1 = null;
            String z = String.valueOf(y);
            for (int j = 0; j < all.length - 10; j++) {
                if (all[j].equals(z)) {
                    z = all[j + 10];
                    if (x == 1) {
                        res1 = "X";
                        System.out.println(res1 + z);
                    } else if (x == 2) {
                        res1 = "XX";
                        System.out.println(res1 + z);
                    } else if (x == 3) {
                        res1 = "XXX";
                        System.out.println(res1 + z);
                    } else if (x == 4) {
                        res1 = "XL";
                        System.out.println(res1 + z);
                    }
                }
                String[] all3 = new String[] {"20", "30","40", "XX", "XXX", "XL"};
                for(int k = 0; k < all3.length-3; k++) {
                    if (all3[k].equals(res)){
                        res = all3[k+3];
                        System.out.println(res);
                    }
                }

            }
        }
        else if (Arrays.binarySearch(all2,numb3) >=0  &&
                Arrays.binarySearch(all2,numb4) >=0 && result2 >49 && result2 <=100) {
            int x = (result2 - 50) / 10;
            int y = (result2 - 50) - x*10;
            String res1 = null;
            String z = String.valueOf(y);
            for(int j = 0; j < all.length-10; j++) {
                if (all[j].equals(z)){
                    z = all[j+10];
                    if ( x==1 ){
                        res1 = "X";
                        System.out.println("L"+res1 + z);
                    }
                    else if (x==2 ){
                        res1 = "XX";
                        System.out.println("L"+res1 + z);
                    }
                    else if (x==3){
                        res1 = "XXX";
                        System.out.println("L"+res1 + z);
                    }
                    else if (x==4){
                        res1 = "XL";
                        System.out.println("L"+res1 + z);
                    }
                    }
                String[] all4 = new String[] {"50", "60","70", "80", "90","100",
                        "L", "LX","LXX", "LXXX", "XC","C"};
                for(int k = 0; k < all4.length-6; k++) {
                    if (all4[k].equals(res)){
                        res = all4[k+6];
                        System.out.println(res);
                    }
                }
           }
    }

        }
    }





