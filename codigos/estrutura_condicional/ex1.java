package códigos.estrutura_condicional;
import java.util.Scanner;
//exercício para ver se o número é negativo ou não
public class ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0){
            System.out.println("Negativo");
        }
        else{
            System.out.println("Nao negativo");
        }

        sc.close();

    }
}
