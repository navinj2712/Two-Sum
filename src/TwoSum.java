import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array elements : ");
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter sum value : ");
        int sum = scanner.nextInt();
        System.out.println("Output : " + findTwoSum(array, sum));
    }

    private static int findTwoSum(int[] array, int sum) {
        int size = array.length;
        for(int i = 0; i < size; i++){
            for(int j = i + 1; j < size; j++){
                if(array[i] + array[j] == sum){
                    return 1;
                }
            }
        }
        return 0;
    }
}
