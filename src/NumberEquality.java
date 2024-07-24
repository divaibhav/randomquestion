import java.util.Scanner;

public class NumberEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1");
        int number1 = scanner.nextInt();
        System.out.println("Enter number 2");
        int number2 = scanner.nextInt();
        System.out.println("Enter number 3");
        int number3 = scanner.nextInt();
        int difference = 0;
        if(number1 == number2 && number1 != number3){
            int temp = 0;// for random purpose
            if( number3 < number1){
                difference = number1 - number3; //80 - 30
                number3 += difference;//50; 30 + 50
                // number3 = number3 + difference;
            }else{
                difference = number3 - number1;//50 - 10
                number3 -= difference;//40; 50 - 40
            }
        }else if(number1 == number3 && number1 != number2){
            if( number2 < number1){
                difference = number1 - number2; //80 - 30
                number2 += difference;//50; 30 + 50

            }else{
                difference = number2 - number1;//50 - 10
                number2 -= difference;//40; 50 - 40
            }
        }else if(number2 ==number3 && number2 != number1){
            if( number1 < number2){
                difference = number2 - number1;// 80 - 30
                number1 += difference;//50; 30 + 50

            }else{
                difference = number1 - number2;//50 - 10
                number1 -= difference;//40; 50 - 40
            }
        }else {
            System.out.println("invalid input");
        }
        System.out.println("number3 = " + number3);
        System.out.println("number2 = " + number2);
        System.out.println("number1 = " + number1);

    }

}
