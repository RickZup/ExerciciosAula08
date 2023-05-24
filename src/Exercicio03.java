import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("Por favor, digite seu salário: ");
        double salarioUsuario = entradaDoUsuario.nextDouble();

        double ims = salarioUsuario / 1212;
        DecimalFormat formatador = new DecimalFormat("0.0");
        System.out.println("O IMS é igual a: " + formatador.format(ims));
    }
}
