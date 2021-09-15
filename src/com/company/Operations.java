package com.company;
enum Operation {ADDITION ,SUBTRACTION, MULTIPLICATION, DIVISION}
class Operations {
    public static int result;

    public static void getOperations() {
        for (int i = 0; i < Operation.values().length; i++) {
            Operation a = Operation.values()[i];
            try {
                switch (a) {
                    case ADDITION:
                        if (Main.symbol.equals("+")) {
                            result = Number.number1 + Number.number2;
                        }
                        break;
                    case SUBTRACTION:
                        if (Main.symbol.equals("-")) {
                            result = Number.number1 - Number.number2;
                        }
                        break;
                    case MULTIPLICATION:
                        if (Main.symbol.equals("*")) {
                            result = Number.number1 * Number.number2;
                        }
                        break;
                    case DIVISION:
                        if (Main.symbol.equals("/")) {
                            result = Number.number1 / Number.number2;
                        }
                        break;
                }

                if (Main.symbol.equals("+") == false && Main.symbol.equals("-") == false &&
                        Main.symbol.equals("*") == false && Main.symbol.equals("/") == false)
                    throw new Exception();
            } catch (Exception e) {
                System.err.println("Формат метематической операции не удовлетворяет заданию!");
                System.exit(0);
            }
        }
    }
}