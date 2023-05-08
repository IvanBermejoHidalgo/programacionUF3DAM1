public class Circuito {
    // DECLARAR VARIABLES
    private int idP;
    private String nombreCir;
    private float kilometros;
    private float temperatura;

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public String getNombreCir() {
        return nombreCir;
    }

    public void setNombreCir(String nombreCir) {
        this.nombreCir = nombreCir;
    }

    public float getKilometros() {
        return kilometros;
    }

    public void setKilometros(float kilometros) {
        this.kilometros = kilometros;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    // CONSTRUCTOR DE TIPO CIRCUITO PARA CREAR OBJETOS
    Circuito(int idP,String nombreCir, float kilometros, float temperatura){
        this.idP = idP;
        this.nombreCir = nombreCir;
        this.kilometros = kilometros;
        this.temperatura = temperatura;
    }

    // PRINTAR LA LISTA DE CIRCUITO
    @Override
    public String toString() {
        return idP+"\t\t\t\t\t"+nombreCir+"\t\t\t\t\t\t\t\t"+kilometros+"\t\t\t\t\t\t\t\t"+temperatura;
    }
}
