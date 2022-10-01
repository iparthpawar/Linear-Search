//Q1. Give an array nums of integers, returns hom many of them contain an even number of digits
public class Example1 {
    public static void main(String[] args){
        int[] nums = {12,345,6,7,7896};
        System.out.println(findnumbers(nums));
        //System.out.println(digits(num));
    }
    static int findnumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }

        return count;
    }
        // function to check whether a number contains even digits or not
     static boolean even(int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }
    static int digits2(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }

    static int digits(int num){

        if (num < 0){
            num = num * -1;
        }

        if(num == 0){
            return 1;
        }

        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
            //return count;
        }
        return count;

    }
    
}
