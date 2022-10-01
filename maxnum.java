import java.util.Scanner;

public class maxnum {
    public static void main(String[] args){
        System.out.println("Enter the number of element:");
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int[] arr = new int[10];

            System.out.println("Enter the elements in array: ");
            for(int p = 0; p < n; p++){
                arr[p] = input.nextInt();
            }
            int answer = (max(arr));
            System.out.println("maxmium number in the array: " + answer);
        }
    }
    static int max(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        int ans = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(ans < arr[i]){
                ans = arr[i];
            }
        }
        return ans;
    }
}
