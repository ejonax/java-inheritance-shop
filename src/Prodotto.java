
public class Prodotto {
   
private int codice;
private String nome;
private String marca;
private float prezzo;
private float iva;
private float prezzoTotale;

private int setCodice(){
    return this.codice=(int) ( Math.random() * 101 );
}

protected  Prodotto( String nome, String marca, float prezzo, float iva){
    this.nome=nome;
    this.marca=marca;
    this.prezzo=prezzo;
    this.iva=iva;
    this.codice=setCodice();
}

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public float prezzoTotale(){
       return this.prezzoTotale=this.prezzo + (this.prezzo * (this.iva/100));
    }

    public void stampaInformazioni(){
        System.out.println("Il prodotto è "
                        + getNome()
                        + " della marca "
                        + getMarca()
                        + " che costa "
                        + getPrezzo()
                        + " euro con l'iva "
                        + getIva()
                        + " euro con il prezzo totale di "
                        + prezzoTotale()
                        + " euro."
                    );
    }

    @Override
    public String toString() {
        return "Prodotto [codice=" + codice + ", nome=" + nome + ", marca=" + marca + ", prezzo=" + prezzo + ", iva="
                + iva + ", prezzoTotale=" + prezzoTotale + "]";
    }

}
