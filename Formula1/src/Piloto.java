public class Piloto {

    // DECLARAR VARIABLES
    private int idP;
    private String nombreP;
    private String abreviacion;
    private int numeroP;

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getAbreviacion() {
        return abreviacion;
    }

    public void setAbreviacion(String abreviacion) {
        this.abreviacion = abreviacion;
    }

    public int getNumeroP() {
        return numeroP;
    }

    public void setNumeroP(int numeroP) {
        this.numeroP = numeroP;
    }

    // CONSTRUCTOR DE TIPO PILOTO PARA CREAR OBJETOS
    Piloto(int idP, String nombreP, String abreviacion, int numeroP){
        this.idP = idP;
        this.nombreP = nombreP;
        this.abreviacion = abreviacion;
        this.numeroP = numeroP;
    }


    // PRINTAR LA LISTA DE PILOTO
    @Override
    public String toString() {
        return idP+"\t\t\t\t\t"+nombreP+"\t\t\t\t\t\t\t"+abreviacion+"\t\t\t\t\t\t\t"+numeroP;
    }

}
