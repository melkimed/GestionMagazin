package magazin;

public class prixachatexception extends Exception 
{
    
      public prixachatexception (double p)
{
    System.out.println(p+"prix achat positive");
}
}