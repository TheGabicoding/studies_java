import java.util.Locale;

public class ex1 {

    public static void main(String[] args){

        String produto1 = "Computador";
        String produto2 = "Mesa";

        int idade = 30;
        int codigo = 5290;
        char genero = 'F';

        double preco1 = 2100.0;
        double preco2 = 650.50;
        double medida = 53.234567;

        System.out.println("Produtos:");
        System.out.printf("%s, que custa R$ %.2f%n",produto1, preco1);
        System.out.printf("%s, que custa R$ %.2f%n",produto2, preco2);

        System.out.printf("Recorde: %d anos, codigo %d e genero: %s%n", idade, codigo,genero);

        System.out.printf("Medida com oito digitos: %.8f%n", medida);
        System.out.printf("Arredondado para três digitos: %.3f%n", medida);
        Locale.setDefault(Locale.US);
        System.out.printf("Com o ponto decimal americano: %.3f", medida);

    }
}
