import java.text.NumberFormat;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 24.0;

        //Condição Simples
        //if(valorSolicitado < saldo)
        //    saldo -= valorSolicitado;
        
        //Condição Composta
        if(valorSolicitado < saldo)
        {
            saldo -= valorSolicitado;
            NumberFormat formatoValorMonetario = NumberFormat.getCurrencyInstance();
            String saldoAtualizado = formatoValorMonetario.format(saldo);
            System.out.println(String.format("Novo saldo: %s.", saldoAtualizado));
        }
        else
            System.out.println("Saldo insuficiente para a operação.");

        //Condição Encadeada
        //Condição Ternária
        //Switch Case

        System.out.println(saldo);
    }
}
