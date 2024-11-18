import com.coti.tools.Esdia;

public class App {
    public static void main(String[] args) throws Exception {
        float suma=0;
        int n =Esdia.readInt("Introduzca el numero de enteros de los que se calculará la media: ");
    while (n>0){
        for(int i=0; i<n; i++){
            int k=Esdia.readInt("Introduzca el entero");
            suma = suma+k;

        }
    }
    System.out.println("La suma es " + suma/n);
}
}
