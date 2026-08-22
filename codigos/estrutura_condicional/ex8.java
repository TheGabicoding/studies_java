import java.util.Scanner;
public class ex8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

        if (salario >= 0.00 && salario <= 2000.00){
            System.out.println("Isento");
        }
        else if (salario >= 2000.01 && salario <= 3000.00){
            salario = salario * 0.08;
            System.out.printf("R$: %.2f", salario);
    }
    else if (salario >= 3000.01 && salario <= 4500.00){
            salario = salario * 0.18;
            System.out.printf("R$: %.2f", salario);
    }
else if (salario > 4500){
            salario = salario * 0.28;
            System.out.printf("R$: %.2f", salario);
    }

    sc.close();

}
}