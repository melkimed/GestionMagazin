package magazin;

public class articleelectro extends Garticle implements Succeptible , vendableparpiece
{
	public int nbp ;
	   public articleelectro( double prixA, double prixV, String nomP, String fournisseur) throws prixachatexception, prixventeexception 
	   {
        super(prixA, prixV, nomP, fournisseur) ;
        this.nbp = 0;
       
        }
	public double  remplirstock ( int qte)
	 {
	this.nbp=this.nbp+qte;
	return (qte*this.prixA);
	 }
	 public void descreption ()
	 {
	 System.out.println(this.nomP+"/"+this.prixV+"/"+this.fournisseur+"/"+this.calculateur()+"/"+nbp);
	 }

	    public  double vendre (int qte) 
	    {
	       if (qte < nbp)
	       {nbp=nbp-qte ;
	        return( this.prixV*qte);
	       }
	       else
	       {System.out.println("repture de stock");
	       return 0;
	       }
	        
	    }   
	public  void lancersld (double pourcentage){
	    this.prixV=this.prixV*pourcentage;
	}
	    public  void terminersld (double pourcentage){
	        this.prixV=this.prixV*pourcentage ;
	    }

	}
