import java.util.Arrays;

public class Linear_search_in_2D_array {
    public static void main(String[] args) {
        int[][] arr = {{2,52,47},
                        {1,2,3},
                        {45,1,2,3},
                        {12,7,56,-8}
    };
    int target = 7;
    int[] ans = search(target,arr);
    System.out.println(Arrays.toString(ans));

    }
   
    static int[] search(int target, int[][] arr) {
        for(int r = 1; r < arr.length; r++){
            for(int j = 1; j < arr[r].length; j++){
                if(arr[r][j] == target){
                    return new int[]{r,j};
                } 
            }
        }


        return new int[]{-1,-1};

    }

}
