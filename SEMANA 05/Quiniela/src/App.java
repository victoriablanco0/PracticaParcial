import com.coti.tools.Esdia;

import quiniela.Partido;
import quiniela.Quiniela;

public class App {
    public static void main(String[] args) throws Exception {
        Quiniela quiniela = new Quiniela();
        Partido[] partidos = quiniela.getPartidos();
        
        for(int i =0;i< partidos.length; i++){
            String equipoLocal = Esdia.readString("Introduzca el equipo Local: " );
            String equipoVisitante = Esdia.readString("Introduzca el equipo visitante: " );
            int golesLocal = Esdia.readInt("Introduzca los goles locales: ");
            int golesVisitante = Esdia.readInt("Introduzca los goles visitantes: ");
            Partido partido = new Partido(equipoLocal, equipoVisitante, golesLocal, golesVisitante);
            partidos[i] = partido;


        }


        quiniela.mostrarQuiniela();
    }
}
