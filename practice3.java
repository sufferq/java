import java.util.Scanner;

public class practice3 {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        double num2 = in.nextInt();
        System.out.print("Введите действие: ('+', '-', '*', '/'): ");
        String action = in.next();
        if(action.equals("+")){
            System.out.println("Результат: " + num1 + " " + action + " " + num2 + " = " + (num1 + num2));
        }
        else if(action.equals("-")){
            System.out.println("Результат: " + num1 + " " + action + " " + num2 + " = " + (num1 - num2));
        }
        else if(action.equals("*")){
            System.out.println("Результат: " + num1 + " " + action + " " + num2 + " = " + (num1 * num2));
        }
        else if(action.equals("/")){
            if(num2 != 0){
                System.out.println("Результат: " + num1 + " " + action + " " + num2 + " = " + (num1 / num2));
            }
            else{
                System.out.println("Делить на 0 нельзя!");
            }
        }
    }
}
