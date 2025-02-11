public class Carrello {
    
    private Televisori televisore;
    private Cuffie cuffie;
    private Smartphone smartphone;

   /*  public Carrello(Televisori televisore, Cuffie cuffie, Smartphone smartphone){
       this.televisore=televisore;
       this.cuffie=cuffie;
       this.smartphone=smartphone;
    }
    */

   
    public Televisori getTelevisore() {
        return televisore;
    }

    public void setTelevisore(Televisori televisore) {
        this.televisore = televisore;
    }

    public Cuffie getCuffie() {
        return cuffie;
    }

    public void setCuffie(Cuffie cuffie) {
        this.cuffie = cuffie;
    }

    public Smartphone getSmartphone() {
        return smartphone;
    }

    public void setSmartphone(Smartphone smartphone) {
        this.smartphone = smartphone;
    }

    
    public void stampaInformazioni(){
        System.out.println("La televisione ha le dimensioni di "
                           + televisore.getDimensioni()
                           + " pollici, lo smartphone ha "
                           + smartphone.getRam()
                           + " GB di memoria ed è "
                           + cuffie.isWireless()
                           +  " che le cuffie sono wireless."
        
                          );
    }

    
    @Override
    public String toString() {
        return "Carrello [televisore="
                + ", getTelevisore()=" + getTelevisore() 
                + ", getCuffie()=" + getCuffie() 
                + ", getSmartphone()=" + getSmartphone() + "]";
    }
}
