
public class Linear_max_search_in_2D_Array {
    public static void main(String[] args){
        int[][] arr ={{2,1,5},
        {14,4,7},
        {5,8,2},
        {1,6,4,7}
        };

        System.out.println((max(arr)));
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] element : arr) {
            for (int element2 : element) {
                if(element2 < max){
                    max = element2;
                }
            }
        }
        return max;
    }
}
