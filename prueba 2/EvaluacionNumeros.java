import java.util.Scanner;

public class EvaluacionNumeros {
    
    public static void main(String[] args){
        
        Integer li_entradaTeclado;
        System.out.print ("Introduzca un numero: ");
        Scanner arg_entradaEscaner = new Scanner(System.in);

        li_entradaTeclado = arg_entradaEscaner.nextInt();
        EntadaNumerica numValida = new EntadaNumerica();
        numValida.ValidaNum(li_entradaTeclado);
       
    }

    
}
