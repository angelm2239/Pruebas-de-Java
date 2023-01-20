import java.util.ArrayList;
import java.util.Scanner;

public class EnterosOrdenados {
    ArrayList<Integer> num = new ArrayList<Integer>();
    public static void main(String[] args){
       
        String ls_entradaTeclado ="";
        System.out.print ("Introduzca un numero: ");
        Scanner arg_entradaEscaner = new Scanner(System.in);
        ls_entradaTeclado = arg_entradaEscaner.nextLine();

        //Clases
        ValidaInfo valida = new ValidaInfo();
        OrdenaNumeros ordena = new OrdenaNumeros();

        //Metodos
        ordena.Ordena(valida.Valida(ls_entradaTeclado));

    }
}