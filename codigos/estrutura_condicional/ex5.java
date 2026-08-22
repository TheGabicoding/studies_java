package códigos.estrutura_condicional;
import java.util.Scanner;
//exercício para retornar o valor de uma conta com base na multiplicação do código do prod pela quantidade
public class ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        
        int cod = sc.nextInt();
        int qnt = sc.nextInt();
        double total;

        if (cod == 1){
            total = 4.0 * qnt;
        }
        else if (cod == 2){
            total = 4.5 * qnt;
        }
        else if (cod == 3){
            total = 5.0 * qnt;
        }
        else if (cod == 4){
            total = 2.0 * qnt;
        }
        else{
            total = 1.5 * qnt;
        }

        System.out.printf("Total: R$ %.2f", total);
        sc.close();

    }    
}
