public class EntadaNumerica {

    public void ValidaNum(Integer arg_int ){

       String ls_numero_Cadena = Integer.toString(arg_int);
        int li_longitud_num =  ls_numero_Cadena.length();

        double ld_suma = 0;
        for(int li_indice = 0; li_indice < li_longitud_num; li_indice++){

            //Convertir carácter a entero
            int li_cifra = Character.getNumericValue(ls_numero_Cadena.charAt(li_indice));

            //Elevarlo al exponente dado por la longitud del número
            double ld_elevado =  Math.pow(li_cifra,li_longitud_num );

            ///vamos sumando el resultado
            ld_suma =ld_suma + ld_elevado;
      
        }
        if(ld_suma == arg_int){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        
    }
    
}
