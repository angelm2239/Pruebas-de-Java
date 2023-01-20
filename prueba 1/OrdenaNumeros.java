
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenaNumeros {
    
    public void Ordena( ArrayList<Integer> arg_miArrreglo){
        
        Collections.sort(arg_miArrreglo);
        int li_primerNumero = arg_miArrreglo.get(0);

        Collections.sort(arg_miArrreglo, Comparator.reverseOrder());
        int li_ultimoNumero = arg_miArrreglo.get(0);

        for(int i = li_primerNumero; i < li_ultimoNumero; i++){
            if(i > li_primerNumero && i < li_ultimoNumero ){
                System.out.println(i);
            }
        }
        
    }
}
