package week7.no2;
import java.util.Scanner;

public class MainSequential {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[] list = {"maulana","arif","dante","topik"};

        System.out.print("Type the name to check is it exist or not: ");
        String target = sc.next().toLowerCase();

        SequentialSearch ss = new SequentialSearch(list, target);

        boolean result = ss.Sequential();

        if (result){
            System.out.println("The name is found");
        }
        else{
            System.out.println("The name is not found");
        }

    }

}
