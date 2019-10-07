package Calculator;

public class Calculator {
    public static Double evaluate(String expression) {
        String[] str = expression.split(" ");
        if (str.length > 1) {
            if (str.length == 3) {
                switch (str[1]) {
                    case "*":
                        return Double.valueOf(str[0]) * Double.valueOf(str[2]);
                    case "/":
                        return Double.valueOf(str[0]) / Double.valueOf(str[2]);
                    case "+":
                        return Double.valueOf(str[0]) + Double.valueOf(str[2]);
                    case "-":
                        return Double.valueOf(str[0]) - Double.valueOf(str[2]);
                    default:
                        throw new IllegalStateException("Unexpected value: " + str[1]);
                }
            }
            int i;
            for (i = 1; i < str.length; i++) {
                if (str[i].equals("*")) {
                    evaluate(String.format("%s %s %s", str[i - 1], str[i], str[i - +1]));
                }
                if (str[i].equals("/")) {
                    evaluate(String.format("%s %s %s", str[i - 1], str[i], str[i - +1]));
                }
                if (str[i].equals("+")) {
                    evaluate(String.format("%s %s %s", str[i - 1], str[i], str[i - +1]));
                }
                if (str[i].equals("-")) {
                    evaluate(String.format("%s %s %s", str[i - 1], str[i], str[i - +1]));
                }
            }
        }
        return new Double(str[0]);
    }
}
