import java.util.Scanner;

public class practice4 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        boolean numberN = true;

        while(numberN == true){
            System.out.print("Введите число N (Для выхода введите 0 или меньше): ");
            int N = in.nextInt();

            if(N <= 0){
                System.out.println("Программа завершена.");
                break;
            }
            else {
                numberN = false;
                System.out.println("Обратный отсчёт: ");
                for(int i = N; i >= 1; i--){
                    System.out.println(i);
                }
            }
            System.out.println("Хотите найти числа, кратные 3 в этом диапазоне? (да/нет): ");
            String chose = in.next();
            if(chose.equals("да")){
                for(int i = N; i >= 1; i--){
                    if(i % 3 == 0){
                        System.out.println(i);
                    }
                    else{
                        continue;
                    }
                }
                numberN = true;
            }
            else{
                numberN = true;
            }
        }
    }
}
