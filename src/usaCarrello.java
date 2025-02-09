
import java.util.Scanner;

public class usaCarrello {
    public static void main(String[] args) {

        Carrello carrello;
        carrello=new Carrello();

    // con il for chiedo 3 volte all'utente di inserire i dati del prodotto desiderato
   for (int i = 0; i < 3; i++) {
        Scanner prod1=new Scanner(System.in);

        System.out.println("Inserisci il nome, la marca, il prezzo e l'iva del prodotto che stai scegliendo");
        
        String nomeInput=prod1.nextLine();
        String marcaInput=prod1.nextLine();
        Float prezzoInput=prod1.nextFloat();
        Float ivaInput=prod1.nextFloat();

        Scanner risposta=new Scanner(System.in);
        System.err.println("Stai scegliendo un Smarphone, un televisore o una cuffia");
        String tipoProdotto=risposta.nextLine();

        Scanner properties=new Scanner(System.in);
        // cosi lowercase e uppercase sarrano validati come uguali per la stringa risposta
        if (tipoProdotto.equalsIgnoreCase("Televisione")){

            System.out.println("Inserisci le dimensioni della TV e True/False per l'opzione di essere smartTV e smart oppure no");
            int dimensioniInput=properties.nextInt();
            Boolean isSmartInput=properties.nextBoolean();

            Televisori tv=new Televisori(nomeInput, marcaInput, prezzoInput,ivaInput, dimensioniInput, isSmartInput);
            //tv.stampaInformazioni();
            carrello.setTelevisore(tv);
            
        }
        else if (tipoProdotto.equalsIgnoreCase("Smartphone")) {

            System.out.println("Inserisci l'IMEI del telefono e il suo RAM");
            String IMEI=properties.nextLine();
            Double ram=properties.nextDouble();

            Smartphone smartphone=new Smartphone(nomeInput, marcaInput, prezzoInput, ivaInput, IMEI,ram);
            //smartphone.stampaInformazioni();
            carrello.setSmartphone(smartphone);

        } 
        else {
            System.out.println("Inserisci il colore delle cuffie e True/False se sono wireless");
            String colore=properties.nextLine();
            Boolean wireless=properties.nextBoolean();

            Cuffie cuffie=new Cuffie(nomeInput, marcaInput,prezzoInput, ivaInput, colore, wireless);
           // cuffie.stampaInformazioni();
            carrello.setCuffie(cuffie);
           
        }
    }
        // la stampiamo dopo il for cosi cosi inseriti tutti tre prodotti: tv, smartphone e cuffia
        carrello.stampaInformazioni();
    }

}
