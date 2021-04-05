package magazin;

public class prixventeexception extends Exception 
{
    
  public prixventeexception ( double h)
{
    System.out.println("ce prix de vente"+h+" n est pas valide ");
}    
}