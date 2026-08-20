package códigos.estrutura_condicional;
import java.util.Scanner;
//exercício para verificar se os números são múltiplos ou não.
public class ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0){
            System.out.println("Sao multiplos");
        }
        else{
            System.out.println("Nao sao multiplos");

            sc.close();
        }
    }
}
