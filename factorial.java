import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int s=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            s=s*i;
        }
        System.out.println("Factorial is "+s);
    }
}
