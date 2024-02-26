import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Озунуздун телефонунузду тузунуз.
         *Телефонунузда томондогу мумкунчулуктор болсун :
         * заметки, банк приложения, калькулятор .
         * -Заметкиге озунуз каалаганча текст турундо маалыматтарды сактай алыныз
         * жаnа аларды озгортуп очуруп колдонунуз.-Bank приложенияда озунуздун балансынызды
         * текшеруу, башка адамдын картасына акча которуу  мумкунчулуктору болсун
         * -Калькулятордо болсо сандарды кошуп, алып, кобойтуп, боло алыныз.Эскертуу,
         * кандай полелер жана кандай методдор болот озубуз ойлонобуз ар бир студенттин
         * тапшырмасы уникалдуу болсун!
         */
        Scanner scanner = new Scanner(System.in);
        Note note1 = new Note();
        OptimaBank optimaBank = new OptimaBank();
        Calculator calculator = new Calculator();

        ExitWhile:
        ExitBank:
        while (true) {
            System.out.println("""
                    \n Welcome to your phone!
                    1)Note
                    2)Bank
                    3)Calculator
                    4)exit
                    5)output all words from Note: """);

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                  note1.getNote();
                    break;
                case 3:
                    System.out.println("""
                            1)Add
                            2)Subtract
                            3)Multiply
                            4)Divide
                            5)Exit""");
                    System.out.println("Enter operation: ");
                    int operation = scanner.nextInt();
                    System.out.println("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.println("Enter second number:  ");
                    double num2 = scanner.nextDouble();
                    double result;
                    switch (operation) {
                        case 1:
                            result = Calculator.add(num1, num2);
                            System.out.println("Addition result: " + result);
                            break;
                        case 2:
                            result = Calculator.subtract(num1, num2);
                            System.out.println("Subtraction result: " + result);
                            break;
                        case 3:
                            result = Calculator.multiply(num1, num2);
                            System.out.println("Multiplication result: " + result);
                            break;
                        case 4:
                            result = Calculator.divide(num1, num2);
                            System.out.println("Division result: " + result);
                            break;
                        case 5: break ExitWhile;
                        default:
                            System.out.println("Invalid choice");
                    }

                case 2:

                    int code = 1234;
                    System.out.println("Enter your PIN code");
                    int a = scanner.nextInt();
                    if (a != code)
                        System.out.println("PIN code is not correct");


                    System.out.println("""
                            \nEnter your choice:\s
                             0)exit
                             1)checkBalance
                             2)deposit
                             3)withdraw
                             4)transaction""");
                        switch (scanner.nextInt()) {
                            case 0 ->{  break ExitBank;
                            }
                            case 1 -> {
                                optimaBank.checkBalance();
                            }
                            case 2 -> {
                                System.out.println("Enter amount to the top balance: ");
                                double num = scanner.nextDouble();
                                optimaBank.deposit(num);
                            }
                            case 3 -> {
                                System.out.println("Enter deductible amount: ");
                                double num = scanner.nextDouble();
                                optimaBank.withdraw(num);
                            }
                            case 4 -> {
                                System.out.println("What surname and name do you wanna enter, write surname and name" + scanner.nextLine());
                                   String name = scanner.nextLine();

                                if (name.equals("Kydyraliev Aziret")) {
                                    System.out.println("Write the amount: ");
                                    double num = scanner.nextDouble();
                                    optimaBank.transaction(num);
                                    System.out.println("The transaction was completed successfully! \n");
                                }


                                    }

                                }


                            }


                        }
                    }

            }


