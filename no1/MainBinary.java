package week7.no1;
import java.util.Scanner;

public class MainBinary {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);      
        
        int[] list = {20,12,14,8,10,18};
        
        System.out.print("Angka berapa yang anda ingin Cari: ");
        int search = sc.nextInt();
        
        BinarySearch bs = new BinarySearch(list,search);

        int result = bs.Binary_method();
            
        if (result == -1){
            System.out.println("The key is not found");
        }
        else{
            System.out.println("The key is found at index "+result);
        }

    }

}
