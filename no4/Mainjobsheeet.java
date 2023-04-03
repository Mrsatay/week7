package week7.no4;
import java.util.Scanner;

public class Mainjobsheeet {
    
    public static void main(String[] args) {
        
        int[] list = {12,17,2,1,70,50,90,17,2,90};

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number do you want: ");
        int target = sc.nextInt();

        jobsheetno4 jn4 = new jobsheetno4(list, target);
        jn4.search();
        jn4.amount_biggest_value();

        int target_index = jn4.index;
        int biggest_value = jn4.biggest_value;
        int total_biggest_value = jn4.total_biggest_value;

        System.out.println("The target index do you want is: "+target_index);
        System.out.println("The biggest value on the list is: "+biggest_value);
        System.out.println("Total the biggest value on the list is: "+total_biggest_value);

    }

}
