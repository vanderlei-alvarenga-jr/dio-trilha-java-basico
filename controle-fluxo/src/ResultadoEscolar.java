public class ResultadoEscolar {
    public static void main(String[] args) {
        final String APROVADO = "APROVADO";
        final String PROVA_RECUPERACAO = "PROVA DE RECUPERAÇÃO";
        final String REPROVADO = "REPROVADO";
        double nota = 7.0;

        //Condição Composta 
        // if(nota >= 7)
        //     System.out.println(APROVADO);
        // else
        //     System.out.println(REPROVADO);

        //Condição Encadeada 
        // if(nota >= 7)
        //     System.out.println(APROVADO);
        // else if(nota >= 5 && nota < 7)
        //     System.out.println(PROVA_RECUPERACAO);
        // else
        //     System.out.println(REPROVADO);

        //Condição Ternária
        // String resultado = nota >= 7 ? APROVADO : REPROVADO;
        String resultado = nota >= 7 ? APROVADO : (nota >= 5 && nota < 7 ? PROVA_RECUPERACAO : REPROVADO );
        System.out.println(resultado);
    }
}
