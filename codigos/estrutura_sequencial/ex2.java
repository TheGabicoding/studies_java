import java.util.Scanner;
public class ex2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        double pi = 3.14159;
        double raio = sc.nextDouble();

        double A = pi * Math.pow(raio, 2.00);

        System.out.printf("A  =  %.4f", A);

        sc.close();
    }
}
