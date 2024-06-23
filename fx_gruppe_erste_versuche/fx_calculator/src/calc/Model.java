package calc;

public class Model {

  public String calculate(long num1, long num2, String operator) {

    switch (operator) {
      case "+":
        return String.valueOf(num1 + num2);
      case "-":
        return String.valueOf(num1 - num2);
      case "*":
        return String.valueOf(num1 * num2);
      case "/":
        if (num2 == 0) {
          return "Division durch 0";
        }
        long a = num1 / num2;
        long b = num1 % num2;

        return "" + a + " Rest " + b;

      default:
        System.out.println("Unbekannter Operator: " + operator);
        break;
    }

    return "";
  }

}
