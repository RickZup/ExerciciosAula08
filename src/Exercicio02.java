import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("Por favor, digite sua altura: ");
        double altura = entradaDoUsuario.nextDouble();

        System.out.println("Agora digite seu peso: ");
        double peso = entradaDoUsuario.nextDouble();

        double calculoImc = peso / (altura * altura);
        DecimalFormat formatador = new DecimalFormat("0.00");
        System.out.println("Pronto! Seu IMC é: " + formatador.format(calculoImc));
    }
}
