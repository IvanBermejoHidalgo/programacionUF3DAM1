public class Coche {
    // DECLARAR VARIABLES
    private int idP;
    private String scuderia;
    private String motor;
    private int numeroC;

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public String getScuderia() {
        return scuderia;
    }

    public void setScuderia(String scuderia) {
        this.scuderia = scuderia;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getNumeroC() {
        return numeroC;
    }

    public void setNumeroC(int numeroC) {
        this.numeroC = numeroC;
    }

    // CONSTRUCTOR DE TIPO COCHE PARA CREAR OBJETOS
    Coche(int idP, String scuderia, String motor, int numeroC){
        this.idP = idP;
        this.scuderia = scuderia;
        this.motor = motor;
        this.numeroC = numeroC;
    }

    // PRINTAR LA LISTA DE COCHE
    @Override
    public String toString() {
        return idP+"\t\t\t\t\t"+scuderia+"\t\t\t\t\t\t"+motor+"\t\t\t\t\t\t"+numeroC;
    }
}
