// Ben Said   Zine El Abidine
package gestion_de_la_paie;

/**
 *
 * @author Zinou
 */
public class Employe {
    
    private String Nom;
    private String Fonct;
    private double Salaire;
      
    public Employe (String Nom, String Fct){
        this.Nom = Nom;
        this.Fonct = Fct;
    }
    
    public void setSalaire (double S){
        this.Salaire = S;
    }
    
    public double getSalaire (){
        return this.Salaire;
    }
    public double calculPaie ()
    {
        return this.Salaire;
    }
    
    public void Cheque (){
        System.out.println("Payer a l'orde de " +this.Nom + "(" +this.Fonct +")" +"***"+calculPaie() +"DA");
    }
    
    public void setSalaireParSomaine (double S){}
    
    public void setPrime (double P){}
    
    public void setSalaireHeure (double S){}
}
