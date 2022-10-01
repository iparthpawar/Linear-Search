import java.util.Scanner;

public class Linear_Search{
    public static void main(String[] args){
        // to take number of elements in array
        System.out.println("Enter the number of elements in array: ");
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int[] arr = new int[10];

                // int[] arr ={2,4,5,8,6};
                System.out.println("Enter the elements in array: ");
                for(int p = 0; p < n; p++){
                    arr[p] = input.nextInt(); 
                }

                // int target = 5;
                System.out.println("Enter the target number: ");
                try (Scanner sc = new Scanner(System.in)) {
                    int target = sc.nextInt();
                
                int ans = LinearSearch(target,arr);
                System.out.println("Element is at " + ans + " index");
            }
        }
        
    }
    static int LinearSearch(int target , int[] arr){
        if(arr.length == 0){
            return -1;
        }

        for(int i = 0; i < arr.length; i++){
            int element = arr[i];
            if(element == target){
                return i ;
            }
        }
        return 0;
    }
}

    