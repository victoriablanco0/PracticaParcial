import com.coti.tools.Esdia;

public class App {
    public static void main(String[] args) throws Exception {
        int n;
        float suma=0;
while(true){
    n = Esdia.readInt("Introduce un numero entero mayor que cero");
    
    if(n>0){
        break;
        } else{
        System.err.println("ERROR");
    } 

}
 for (int i = 0; i < n; i++) {
        
        int k= Esdia.readInt("Introduce un numero entero");
        suma =suma +k ;

        
    
    }
    
    System.out.println("La media aritmetica de los numeros es: " + suma/n);
}

}