public class Example2 {
    public static void main(String[] args){
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts){
        // person = row
        // account = column
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person <accounts[person].length; person++){
            // when you start new col, take a new sum for that row
            int sum = 0;
            for(int account = 0; account <accounts[person].length; account++){
                sum += accounts[person][account];
                }
                // now we have sum of accounts of person
                //check with overall answer
                if(sum> ans){
                    ans = sum;
                }
            }
            return ans;
        }
}


