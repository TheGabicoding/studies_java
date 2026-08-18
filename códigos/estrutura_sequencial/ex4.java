import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int wage = sc.nextInt();
        double horas = sc.nextDouble();

        double salary = (horas * wage);
        
        System.out.printf("NUMBER = %d\n", n);
        System.out.printf("SALARY = U$ %.2f", salary); 

        sc.close();

    }
}
