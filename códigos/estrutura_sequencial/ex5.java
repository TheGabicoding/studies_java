import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int cod1 = sc.nextInt();
        int n1 = sc.nextInt();
        double price1 = sc.nextDouble();

        int cod2 = sc.nextInt();
        int n2 = sc.nextInt();
        double price2 = sc.nextDouble();

        double conta = (n1 * price1 + n2 * price2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", conta);

        sc.close();
        
    }
    
}
