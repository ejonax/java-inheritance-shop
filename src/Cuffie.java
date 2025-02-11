public class Cuffie extends Prodotto{

    private String colore;
    private boolean wireless;

    protected Cuffie(String nome, String marca, float prezzo, float iva, String colore, boolean wireless) {
        super(nome, marca, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }
    
    @Override
    public void stampaInformazioni(){
        System.out.println("Le cuffie sone "
                             + getNome()
                             + " della marca "
                             + getMarca()
                             + " con il prezzo di "
                             + prezzoTotale()
                             + " euro e di colore "
                             + getColore()
                             + " ed è "
                             + isWireless()
                             + " che sono wireless."
                         );
    }

    @Override
    public String toString() {
        return " Le cuffie sono del colore " +  getColore() + ", ed è " + isWireless() + " che sono wireless "  
                + ", hanno il codice " + getCodice() + ", hanno il nome " + getNome() 
                + ", sono della marca " + getMarca() + ", hanno un prezzo di " + getPrezzo() 
                + " euro, hanno un iva di " + getIva() + ", hanno il prezzo totale di " + prezzoTotale() + " euro.";
    }

    

    
    


}
