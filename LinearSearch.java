
public class LinearSearch{
    public static void main(String[] args){
        int[] arr = { 2, 5, 4, 8, 10, 6, 7, 8 };
       
        int target = 10;
        
        int ans = Linear_Search(arr, target);
        System.out.println("Element is at " + ans + " index");
    }
    // search in the array: return the index if element found
    // otherwise if element not found return -1
    static int Linear_Search(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        //run a for loop
        for(int i = 0; i < arr.length; i++){
            //check for element at every index if it is equal to target
            int element = arr[i];
            if(element == target){
                return i;
            }

        }
        return target;


    }
}