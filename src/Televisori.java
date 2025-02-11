public class Televisori extends Prodotto {

    private int dimensioni;
    private boolean isSmart;

    protected Televisori (String nome, String marca, float prezzo, float iva,int dimensioni, boolean isSmart){
       super(nome, marca, prezzo, iva);
       this.dimensioni=dimensioni;
       this.isSmart=isSmart;
    }

    public int getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(int dimensioni) {
        this.dimensioni = dimensioni;
    }

    public boolean isIsSmart() {
        return isSmart;
    }

    public void setIsSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

    @Override
    public void stampaInformazioni(){
    System.out.println("Il nome della TV è "
                     + getNome()
                     + " della marca "
                     + getMarca()
                     + " con il prezzo totale di "
                     + prezzoTotale()
                     + " euro ed è larga di "
                     + getDimensioni()
                     + " pollici ed è "
                     + isIsSmart()
                     + " che è una TV smart."
                    );
    }

    @Override
    public String toString() {
        return "Il televisore ha le dimensioni di " + getDimensioni() + " pollici , ed è " + isIsSmart() + " che è smart "
                + ", ha il codice " + getCodice() + ", ha il nome " + getNome()
                + ", è della marca " + getMarca() + ", ha un prezzo di " + getPrezzo() + " euro, ha un iva di " + getIva()
                + ", ha un prezzo totale di " + prezzoTotale() + " euro.";
    }


}
