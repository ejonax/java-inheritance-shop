public class usaProdotto {
     public static void main(String[] args) {

        
        System.out.println("/* start of  USO DEL PRODOTTO */");

        Prodotto prod1,prod2;
        prod1=new Prodotto("shampoo","l'oreal",3.5F,0.2f);
        System.err.println("Il primo prodotto è "
                            + prod1.getNome()
                            + " della marca "
                            + prod1.getMarca()
                            + " che costa "
                            + prod1.getPrezzo()
                            + " euro con l'iva "
                            + prod1.getIva()
                            + " euro con il prezzo totale di "
                            + prod1.prezzoTotale()
                            + " euro.");


    
        prod2=new Prodotto("libro","einaudi",25f,0.3f );
        System.err.println("Il secondo prodotto è "
                            + prod2.getNome()
                            + " della marca "
                            + prod2.getMarca()
                            + " che costa "
                            + prod2.getPrezzo()
                            + " euro con l'iva "
                            + prod2.getIva()
                            + " euro con il prezzo totale di "
                            + prod2.prezzoTotale()
                            + " euro."
                            );
        System.out.println("/* end of  USO DEL PRODOTTO */");
        System.out.println("/****************************/");

        System.out.println("/* start of  USO DEL TELEVISORI */");                   
       
        Televisori prod3,prod4;
        prod3=new Televisori("Crystal UHD", "SAMSUNG", 336.99f, 1.2F, 43, false);
        System.err.println("Il nome della TV è "
                           + prod3.getNome()
                           + " della marca "
                           + prod3.getMarca()
                           + " con il prezzo totale di "
                           + prod3.prezzoTotale()
                           + " euro ed è larga di "
                           + prod3.getDimensioni()
                           + " pollici ed è "
                           + prod3.isIsSmart()
                           + " che è una TV smart."
                           );
        
        prod4=new Televisori("24PHS6808", "PHILIPS", 179.98f, 1.2F, 24, true);
        System.err.println("Il nome della TV è "
                            + prod4.getNome()
                            + " della marca "
                            + prod4.getMarca()
                            + " con il prezzo totale di "
                            + prod4.prezzoTotale()
                            + " euro ed è larga di "
                            + prod4.getDimensioni()
                            + " pollici ed è "
                            + prod4.isIsSmart()
                            + " che è una TV smart."
                            );
        System.out.println("/* end of  USO DEL TELEVISORI */ ");
        System.out.println("/****************************/");
         
        System.out.println("/* start of  USO DEL SMARTPHONE */");
        
        Smartphone prod5,prod6;
        prod5=new Smartphone( "Galaxy S25", "SAMSUNG", 929f, 1.2f,"12345678", 128);
        System.out.println("Il telefono è "
                           + prod5.getNome()
                           + " della marca "
                           + prod5.getMarca()
                           + " con il prezzo di "
                           + prod5.prezzoTotale()
                           + " euro e con l'IMEI di "
                           + prod5.getIMEI()
                           + " e con memoria di "
                           + prod5.getRam()
                           + " GB ram."
                          );

        prod6= new Smartphone("iPHONE 14", "APPLE", 689f, 1.2f, "987654321", 128);
        System.out.println("Il telefono è "
                           + prod6.getNome()
                           + " della marca "
                           + prod6.getMarca()
                           + " con il prezzo di "
                           + prod6.prezzoTotale()
                           + " euro e con l'IMEI di "
                           + prod6.getIMEI()
                           + " e con memoria di "
                           + prod6.getRam()
                           + " GB ram."
                           );
        System.out.println("/* end of  USO DEL SMARTPHONE */");
        System.out.println("/****************************/");

        System.out.println("/* start of  USO DEL CUFFIE */");
 
        Cuffie prod7,prod8;
        prod7=new Cuffie("TUNE 760NC", "Samsung", 59.99f, 0.3f, "nero", false);
        System.out.println("Le cuffie sone "
                          + prod7.getNome()
                          + " della marca "
                          + prod7.getMarca()
                          + " con il prezzo di "
                          + prod7.prezzoTotale()
                          + " euro e di colore "
                          + prod7.getColore()
                          + " ed è "
                          + prod7.isWireless()
                          + " che sono wireless."
                        );


        prod8=new Cuffie("WHCH520B", "Sonny", 34.99f, 0.3f, "nero", true);
        System.out.println("Le cuffie sone "
                           + prod8.getNome()
                           + " della marca "
                           + prod8.getMarca()
                           + " con il prezzo di "
                           + prod8.prezzoTotale()
                           + " euro e di colore "
                           + prod8.getColore()
                           + " ed è "
                           + prod8.isWireless()
                           + " che sono wireless."
                        );

        System.out.println("/* end of  USO DEL CUFFIE */");
        System.out.println("/****************************/");
        
    }
}
