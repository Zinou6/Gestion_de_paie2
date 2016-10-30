// Ben Said   Zine El Abidine
package gestion_de_la_paie;

/**
 *
 * @author Zinou
 */
public class EmployePleinTemps extends Employe {
    
    private double SalaireParSomaine ;
    private double Prime ;
    
    public EmployePleinTemps(String Nom, String Fct) {
        super(Nom, Fct);
    }
    
    @Override
    public void setSalaireParSomaine (double S){
        this.SalaireParSomaine = S;
    }
    
    @Override
    public void setPrime (double P){
        this.Prime = P;
    }
    
    @Override
    public double calculPaie ()
    {
        setSalaire(this.SalaireParSomaine * 4 + this.Prime);
        return getSalaire();
    }
       
}
