public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";

        // if(plano == "B"){ //BASIC
        // System.out.println("100 minutos de ligação");
        // } else if(plano == "M") { //MIDIA
        // System.out.println("100 minutos de ligação");
        // System.out.println("Whats e Instagram grátis");
        // } else if(plano == "T") { //TURBO
        // System.out.println("100 minutos de ligação");
        // System.out.println("Whats e Instagram grátis");
        // System.out.println("5 Gb Youtube");
        // }

        switch(plano)
        {
            case "T": //TURBO
                System.out.println("5 Gb Youtube");
            case "M": //MIDIA
                System.out.println("Whats e Instagram grátis");
            case "B": //BASIC
                System.out.println("100 minutos de ligação");
        }
    }
}
