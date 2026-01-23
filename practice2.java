public class practice2 {

    public static void main(String args[]){
        int[] nums = new int[]{2, 5, -3, 10, 1};
        System.out.print("Массив: ");
        int sum = 0;
        double sr = 0;
        int max_element = 0;

        for(int i = 0; i < nums.length; i ++){
            sum += nums[i];
            sr = sum;
            sr /= nums.length;
            System.out.print(nums[i] + " ");
            if (nums[i] > max_element){
                max_element = nums[i];
            }
            }
        System.out.println(" ");
        System.out.println("Сумма элементов: " + sum);

        System.out.println("Среднее арифметическое: " + sr);

        System.out.println("Максимальный элемент: " + max_element);
    }
}
