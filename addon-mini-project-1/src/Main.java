import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void menuCalculator(){
        boolean inInput = true;
        Scanner my_scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        while(inInput){
            System.out.println("---Input (type \"exit\" to exit)");
            System.out.print(">");
            String user_input = my_scanner.nextLine();

            if(Objects.equals(user_input, "exit")){
                inInput = false;
            }else{
                double result = calc.calculate(user_input);
                if(result != Double.POSITIVE_INFINITY){
                    System.out.println("The result is: " + result);

                }
            }
        }
    }

    public static void menuExamples(){
        System.out.println("\n---------------------------");
        System.out.println("Examples:");
        System.out.println("1.) 4/2*2 [Answer: 4]");    // 4
        System.out.println("2.) 1+2+3*4/6*2 [Answer: 7]"); // 7
        System.out.println("3.) 4/2*2+9 [Answer: 13]");  // 13
        System.out.println("4.) 4/(2*2)+9 [Answer: 10]"); //10
        System.out.println("5.) 4/2*(2+9) [Answer: 22]"); //22
        System.out.println("6.) (2+9)-(9+3) [Answer: -1]"); // -1
        System.out.println("7.) (3+(2+9)) [Answer: 14]"); // 14
        System.out.println("8.) 2+(2-3)-5+(2*(4/2)) [Answer: 0]"); // 0
        System.out.println("9.) 2.1+9.2*4/2 [Answer: 20.5]"); // 20.5
        System.out.println("10.) -2.1+-9.2*-4/2 [Answer: 16.3]"); // 16.3
        System.out.println("---------------------------\n");
    }


    public static void menu(){
        System.out.println("-----Calculator-----");

        // Main Loop
        boolean in_calculator = true;
        while(in_calculator){

            // Menu
            System.out.println("1. Start");
            System.out.println("2. Examples/Help");
            System.out.println("3. Exit");

            // Get the user Input
            System.out.print("> ");
            Scanner my_scanner = new Scanner(System.in);
            String user_input = my_scanner.nextLine();

            // Process the user Input
            switch(user_input){
                case "1": {
                    menuCalculator();
                    break;
                }
                case "2":{
                    menuExamples();
                    break;
                }
                case "3":{
                    in_calculator = false;
                    break;
                }
                default:{
                    System.out.println("[!] Invalid Input");
                    break;
                }
            }
        }
    }

    // Some Sample Tests
    public static void test(){
        Calculator calc = new Calculator();
        System.out.println(calc.calculate("4/2*2"));    // 4
        System.out.println(calc.calculate("1+2+3*4/6*2")); // 7
        System.out.println(calc.calculate("4/2*2+9"));  // 13
        System.out.println(calc.calculate("4/(2*2)+9")); //10
        System.out.println(calc.calculate("4/2*(2+9)")); //22
        System.out.println(calc.calculate("(2+9)-(9+3)")); // -1
        System.out.println(calc.calculate("(3+(2+9))")); // 14
        System.out.println(calc.calculate("2+(2-3)-5+(2*(4/2))")); // 0
        System.out.println(calc.calculate("2.1+9.2*4/2")); // 20.5
        System.out.println(calc.calculate("-2.1+-9.2*-4/2")); // 16.3
    }

    public static void main(String[] args){
        //test();
        menu();
    }
}
