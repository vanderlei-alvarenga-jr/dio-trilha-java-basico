import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //DONE: Conhecer e importar a classe Scanner
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        
        //DONE: Exibir as mensagens para o nosso usuário
        System.out.println("Digite o número da conta: ");
        //DONE: Obter pela classe Scanner os valores digitados no terminal
        int numeroConta = entrada.nextInt();
        
        System.out.println("Digite a agência da conta: ");
        //DONE: Obter pela classe Scanner os valores digitados no terminal
        String agencia = entrada.next();

        System.out.println("Digite o primeiro nome do cliente da conta: ");
        //DONE: Obter pela classe Scanner os valores digitados no terminal
        String primeiroNomeCliente = entrada.next();

        System.out.println("Digite o sobrenome do cliente da conta: ");
        //DONE: Obter pela classe Scanner os valores digitados no terminal
        String sobrenomeCliente = entrada.next();

        System.out.println("Digite o saldo disponível na conta: ");
        //DONE: Obter pela classe Scanner os valores digitados no terminal
        double saldoInformado = entrada.nextDouble();
        
        //DONE: Fechar o objeto do Scanner
        entrada.close();

        //DONE: Tratar os valores recebidos
        String nomeCliente = primeiroNomeCliente.concat(" ").concat(sobrenomeCliente);
        NumberFormat formatoValorMonetario = NumberFormat.getCurrencyInstance();
        String saldoEmConta = formatoValorMonetario.format(saldoInformado);

        //DONE: Exibir a mensagem "Conta criada"
        System.out.println(String.format("Seja bem-vindo ao Banco dos Devs Sr(a). %s!", nomeCliente));
        System.out.println(String.format("Sua conta \"%d\", na agência \"%s\", foi criada com sucesso!", numeroConta, agencia));
        System.out.println(String.format("Seu saldo em conta é: %s (Sujeito a atualizações).", saldoEmConta));
    }
}
