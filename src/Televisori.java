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


}
