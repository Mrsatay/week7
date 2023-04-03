package week7.no3;
import java.util.Scanner;

public class MainSequential {
    
    public static void main(String[] args) {
        
        int[][] list = {{45,90,21},{78,1,2},{7,17,40},{200,100,18},{80,50,65}};

        Scanner sc = new Scanner(System.in);
  
        System.out.print("Input The number you want to check: ");
        int target = sc.nextInt();

        SequentialSearch ss = new SequentialSearch(list, target);

        boolean result = ss.Sequential();

        if (result == true){
            System.out.println("The target on Row: "+ss.row+" ,Column: "+ss.column);
        }
        else{
            System.out.println("Your target not in list");
        }


    }

}
