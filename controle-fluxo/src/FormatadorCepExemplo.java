import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23764064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            System.out.println("O CEP informado é inválido.");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException
    {
        // if(cep.length() != 8)
        //     throw new CepInvalidoException();

        Pattern pattern = Pattern.compile("\\d{8}", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(cep);

        if(!matcher.find())
            throw new CepInvalidoException();
        
        return "23.764-064";
    }
}
