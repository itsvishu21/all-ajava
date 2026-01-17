import java.util.*;
public class EvenOdd {
    
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a integer number to check even or Odd number :");
        int a = sc.nextInt();
        check(a);
    }
    public static void check(int a){
        if (a%2==0){
            System.out.println("the enter number is Even number");
        }
        else{
            System.out.println("the enter number is Odd number");
        }
    }
}
