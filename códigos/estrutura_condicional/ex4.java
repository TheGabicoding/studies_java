import java.util.Scanner;
//exercicio para mostrar quantas horas durou um jogo
public class ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int ini = sc.nextInt();
        int fim = sc.nextInt();
        int tempo;

        if (ini < fim){
            tempo = fim - ini;
        }
        else{
            tempo = 24 - ini + fim;
        }

        System.out.printf("O jogo durou %d horas", tempo);
        
        sc.close();
    }
}
