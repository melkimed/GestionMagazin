package magazin;

public class magazine {
    public static void main(String[] args) {
    	
    	try {
    		magazin mgs=new magazin();
            mgs.qr[0]= new primeurs(1100,1200,"PC","CART");
            mgs.qr[1]= new primeurs(300,250,"PC","CART");
            mgs.qr[2]= new articleelectro(20,100,"PC","CART");
            mgs.qr[3]= new articleelectro(20,100,"PC","CART");
            Garticle[] qr = null;
			System.out.println(mgs.calcul(qr));
    		
    		
    	}
    	 catch (prixachatexception p )
        {   }
        catch ( prixventeexception h)
    	{  }
    	
    }
 

}
