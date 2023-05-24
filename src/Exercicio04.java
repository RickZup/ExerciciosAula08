import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("Por gentleza, digite sua idade em anos: ");
        double idadeEmAnos = entradaDoUsuario.nextDouble();

        System.out.println("Você tem " + idadeEmAnos + " anos e quantos meses? ");
        double idadeMeses = entradaDoUsuario.nextDouble();

        System.out.println("Agora diga, você tem " + idadeEmAnos + " anos, " + idadeMeses + " meses e quantos dias?");
        double idadeDias = entradaDoUsuario.nextDouble();

        double totalDeDias = (idadeEmAnos * 365) + (idadeMeses * 30) + idadeDias;

        System.out.println("Você tem " + totalDeDias + " de idade.");
    }
}
