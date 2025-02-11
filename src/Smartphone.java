public class Smartphone extends Prodotto {
    
    private String IMEI;
    private double ram;

    protected Smartphone (String nome, String marca, float prezzo, float iva, String IMEI, double ram){
         super(nome, marca, prezzo,iva);
         this.IMEI=IMEI;
         this.ram=ram;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    @Override
    public void stampaInformazioni(){
        System.out.println("Il telefono è "
                           + getNome()
                           + " della marca "
                           + getMarca()
                           + " con il prezzo di "
                           + prezzoTotale()
                           + " euro e con l'IMEI di "
                           + getIMEI()
                           + " e con memoria di "
                           + getRam()
                           + " GB ram."
                          );
    }

    @Override
    public String toString() {
        return "Lo smartphone ha IMEI " + getIMEI() + ", la memoria di " + getRam() + " GB di RAM" 
                + ", ha il codice " + getCodice() + ", ha il nome " + getNome() + ", è della marca " + getMarca()
                + ", ha un prezzo di " + getPrezzo() + " euro, ha un iva di " + getIva() 
                + ", ha un prezzo totale di " + prezzoTotale()
                + " euro.";
    }

    


}
