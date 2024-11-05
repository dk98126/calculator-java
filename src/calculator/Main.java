package calculator;

public class Main {
  public static void main(String[] args) {
    if (args.length != 3) {
      System.out.println("Введите выражение в формате: <число> <операция> <число>");
      System.exit(1);
    }
    int a = Integer.parseInt(args[0]);
    Operation operation = Operation.from(args[1]);
    int b = Integer.parseInt(args[2]);

    Calculator calculator = new Calculator();
    int result = calculator.calculate(a, operation, b);

    System.out.println(result);
  }
}

