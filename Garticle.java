package magazin;

public class Garticle {
    public double prixA;
    public double prixV ;
    public String nomP ;
    public  String fournisseur;
    

    public Garticle(double prixA, double prixV, String nomP, String fournisseur)throws prixachatexception , prixventeexception {
        if (prixA < 0) throw new prixachatexception (prixA);
        this.prixA = prixA;
        if (prixV < prixA)throw new prixventeexception ( prixV );
        this.prixV = prixV;
        this.nomP = nomP;
        this.fournisseur = fournisseur;
    }

    

   public double calculateur ()
   {
   
   return ((this.prixV-this.prixA)/this.prixA) ;
   }
    public void affiche()
    {
    System.out.println(this.nomP+"/"+this.prixV+"/"+this.prixA);
    }
}
