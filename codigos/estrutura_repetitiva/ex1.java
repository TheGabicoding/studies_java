package codigos.estrutura_repetitiva;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int senha = 2002;

        int valor = sc.nextInt();
        while (true){
            if (valor == senha){
                System.out.println("Acesso Permitido");
                break;
            }
            else{
            System.out.println("Senha Invalida");
            valor = sc.nextInt();
        }
        }

        sc.close();
    }
}
