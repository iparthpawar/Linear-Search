import java.util.Arrays;
import java.util.Scanner;

public class SearchinString {
    
    public static void main(String[] args){
        //String name = "Parth";
        System.out.println("Enter your name: ");
        try (Scanner input = new Scanner(System.in)) {
            String name = input.next();

            //char target = 'u';  
            System.out.println("Enter the target character: ");
            try (Scanner sc = new Scanner(System.in)) {
                char target = sc.next().charAt(0);

                System.out.println(search(name, target));
            }
            //to place your name in array
            System.out.println(Arrays.toString(name.toCharArray()));
        }
        
        
        
    }
    static boolean search(String str,char target){
        if(str.length() == 0){
            return false;
        }

        for(int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    

}
