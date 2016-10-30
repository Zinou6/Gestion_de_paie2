// Ben Said   Zine El Abidine
package gestion_de_la_paie;
import java.util.ArrayList;
/**
 *
 * @author Zinou
 */
public class Main {

   
    public static void main(String[] args) {
       
        ArrayList <Employe> Emp = new ArrayList <Employe> ();
        
        Emp.add(new Employe("Salim","PDG"));
        Emp.get(0).setSalaire(100000.0);
        Emp.add(new EmployePleinTemps("Halima", "Secrétaire"));
        Emp.get(1).setSalaireParSomaine(4000.0);
        Emp.get(1).setPrime(4000.0);
        Emp.add(new EmployeTempsPartiel("Abd El Halim", "Agent de Sécurité"));
        Emp.get(2).setSalaireHeure(428.6);
        
        
        for(Employe val : Emp)
        {
          val.Cheque();
          System.out.println("-------------------");
        }
    }
    
}
