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

}
