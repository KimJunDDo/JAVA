package Practice;
import java.util.Scanner;

public class GCD{
    public static int gcd(int a, int b){
        if(b == 0) return a;
        else return gcd(b, a % b);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("�� ���� ������ �Է��Ͻÿ�:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = gcd(a, b);
        System.out.println(a+", "+b+"�� �ִ�������"+gcd+"�Դϴ�.");
    }
}