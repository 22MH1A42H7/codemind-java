import java.util.Scanner;
public class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a, i, j = 0, k;
    a = sc.nextInt();
    k = a;
    while (a!=0){
        i = a%10;
        j = j * 10 + i;
        a = a / 10;
        
    }
    if ( k == j){
        System.out.println("Palindrome");
        
    }
    else{
        System.out.println("Not Palindrome");
    }
}
}