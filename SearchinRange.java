import java.util.Scanner;

public class SearchinRange {
    public static void main(String[] args){
        //int[] arr = {2,45,89,45,6,7,5};
        System.out.println("Enter number of elements in array: ");
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int[] arr = new int[10];
            
            System.out.println("Enter the elements in array: ");
            for(int p = 0; p < n; p++){
                arr[p] = input.nextInt();
            }
            //int target = 89;
            try(Scanner tar = new Scanner(System.in)){
            System.out.println("Enter the target element: ");
            int target = tar.nextInt();

            //int start = 0;
            try(Scanner sta = new Scanner(System.in)){
            System.out.println("Enter start index range to search: ");
            int start = sta.nextInt();

            //int end = 1;
            try(Scanner en = new Scanner(System.in)){
            System.out.println("Enter end index range to search: ");
            int end = sta.nextInt();
            int ans = (Search(target, arr, start, end));

            System.out.println("Targeted element is found at " + ans + " index" );
            }
        }
    }
       
        }
    }
    static int Search(int target,int[] arr,int start,int end){

        if(arr.length == 0){
            return -1;
        }
        for(int i = start; i <= end; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;

    }
}
