import java.util.Scanner;

public class practice1 {
    public static void main (String args[]){
        Scanner in  = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = in.next();

        System.out.print("Введите текущий час: ");
        int time = in.nextInt();

        if(time >= 6 && time <= 12){
            System.out.println("Доброе утро " + name + "!");
        }
        else if (time >= 13 && time <= 17){
            System.out.println("Добрый день " + name + "!");
        }
        else if (time >= 18 && time <= 22){
            System.out.println("Добрый вечер " + name + "!");
        }
        else{
            System.out.println("Доброй ночи " + name + "!");
        }
    }

}
