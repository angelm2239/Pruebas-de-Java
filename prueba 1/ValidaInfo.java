
import java.util.ArrayList;


public class ValidaInfo {
    ArrayList<Integer> la_info = new ArrayList<Integer>();
    boolean lb_entrada_num = true;

    public ArrayList<Integer> Valida(String arg_entradaTeclado ){
       
        for (int li_entrada=0; li_entrada< arg_entradaTeclado.length(); li_entrada++) {
            if (!Character.isDigit(arg_entradaTeclado.charAt(li_entrada))) {
                
                lb_entrada_num = false;
                break;
               
            }else{

                String infoConvert=String.valueOf(arg_entradaTeclado.charAt(li_entrada));  
                int li_convert_num = Integer.parseInt(infoConvert);
                Integer li_num = li_convert_num;
                la_info.add(li_num);

            }
        }
        if (!lb_entrada_num) {
            System.out.println ("Hay caracteres no numericos"); 
        }

        return la_info;
    }
}

