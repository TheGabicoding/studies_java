import java.util.Scanner;

public class input {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double pi;
        x = sc.next();
        y = sc.nextInt();
        pi = sc.nextDouble();
        System.out.println("Seu nome é: " + x);
        System.out.printf("Você tem: %d anos.\n", y);   
        System.out.printf("Pi é: %.2f", pi);

        sc.close();
    }
    
}
