import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //criando o objeto Scanner
        Scanner objScanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = objScanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = objScanner.next();

        int idade = 0;

        try {
            System.out.println("Digite sua idade: ");
            idade = objScanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("O campo idade precisa ser numérico.");
            objScanner.close();
            return;
        }

        double altura = 0;

        try {
            System.out.println("Digite sua altura: ");
            altura = objScanner.nextDouble();
            if(altura <= 0 || altura > 3) System.out.println("O campo altura está preenchido com uma valor inválido.");
        } catch (InputMismatchException e) {
            System.out.println("O campo altura precisa ser numérico.");
            objScanner.close();
            return;
        }

        DecimalFormat formatoValorMedida = new DecimalFormat("0.00");

        System.out.println(String.format("Olá, me chamo %s %s", nome, sobrenome));
        System.out.println(String.format(Locale.US, "Tenho %d anos.", idade));
        System.out.println(String.format(Locale.US, "Minha altura é %s m.", formatoValorMedida.format(altura)));

        objScanner.close();
    }
}