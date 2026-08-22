package códigos.estrutura_condicional;
import java.util.Scanner;
//exercício para ver se o código é par ou ímpar
public class ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 2 == 0){
            System.out.println("PAR");
        }
        else{
            System.out.println("IMPAR");
        }

        sc.close();
    }    
}
