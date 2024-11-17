package quiniela;

public class Quiniela {
    final int NUMERO_PARTIDOS=2;
    private Partido[] partidos;

public Quiniela(){
    this.partidos = new Partido[NUMERO_PARTIDOS];
}

public Quiniela(int numeroPartidos){
    this.partidos = new Partido[numeroPartidos];
}


public void mostrarQuiniela(){
    int longitudTotal=45;
    String separador = "|" + "-".repeat(43) +"|";
    System.out.println("QUINIELA");
    System.out.println(separador);

    for(Partido partido : partidos){
        System.out.println(partido.lineaPartido());
    }
    System.out.println(separador);
}


//getters setters
public int getNUMERO_PARTIDOS() {
    return NUMERO_PARTIDOS;
}

public Partido[] getPartidos() {
    return partidos;
}

public void setPartidos(Partido[] partidos) {
    this.partidos = partidos;
}




}
