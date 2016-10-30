// Ben Said   Zine El Abidine
package gestion_de_la_paie;
/**
 *
 * @author Zinou
 */
public class EmployeTempsPartiel extends Employe {
    
    private double SalaireHeure ;
    private final int Heure = 35;
    
    public EmployeTempsPartiel(String Nom, String Fct) {
        super(Nom, Fct);
    }
    
    @Override
    public void setSalaireHeure (double S){
        this.SalaireHeure = S;
    }
    
    @Override
     public double calculPaie()
    {
        setSalaire(this.SalaireHeure * this.Heure);
        return getSalaire ();
    }
}
