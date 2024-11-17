import java.util.Arrays;

import com.coti.tools.Esdia;

public class App {
    public static void main(String[] args) throws Exception {
        String[] cadenas = new String[5];
        for(int i=0;i<cadenas.length; i++){
            String cadena = Esdia.readString("Introduzca la cadena: " );
            cadenas[i] = cadena;
        }
        Arrays.sort(cadenas);
        for(String cadena : cadenas){
            System.out.println(cadena);
        }


    }
}
