package magazin;
import java.io.*;

/**
 *
 * @author MSI
 */
public class magazin {
    public double depenses ;
    public double revenus;
    //artcileselectro [] el ;
    //primeurs [] pr ;
    Garticle [] qr ;

    public magazin() {
        this.depenses = 0;
        this.revenus = 0;
        qr = new articleelectro[4];
        //pr = new primeurs [2];
        
    }
public void descrp () {
    System.out.println(this.depenses+"/"+this.revenus+"/");
    for (int i=0; i<4; i++)
    qr[i].affiche();
   // for (int i=0; i<2; i++)
    //pr[i].affiche();
    
}
 public String  calcul (Garticle [] a) 
 {
     int qte = 0 ;
     int qtp = 0 ;
 for (int i=0 ;i<4 ; i++ )
 {
 if (qr[i] instanceof primeurs)
     qtp++ ;
 else 
     qte++;    
 
 }
 
 return ("electro"+qte+"primeurs"+qtp);
}
}