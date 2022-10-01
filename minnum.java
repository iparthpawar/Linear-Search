import java.util.Scanner;

public class minnum {
    public static void main(String[] args){
        //int[] arr = {2,4,15,6,78,-4};
        // number of elements to enter the array
        try(Scanner input = new Scanner(System.in)) {
            System.out.println("Enter number of the elements: ");
            int n = input.nextInt();
            // taking user input array
            int[] arr = new int[10];
            System.out.println("Enter the elements in array: ");
            for(int p = 0 ; p < n; p++){
                arr[p] = input.nextInt();
            }

            int answ = (min(arr));
            System.out.println("minimum number in array is " + answ);
        } 
        
    }
    //assume arr.length != zero or
    // if(arr.length = 0) return -1
    //return the minimum valve from array
    static int min(int[] arr){
        int ans = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
