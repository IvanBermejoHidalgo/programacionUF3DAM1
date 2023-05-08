import java.io.*;
import java.util.ArrayList;

public class Almacen {

    // DECLARAR LAS ARRAYLIST
    ArrayList<Piloto> listaPilotos;
    ArrayList<Coche> listaCoche;
    ArrayList<Circuito> listaCircuito;

    // CONSTRUCTOR PARA INSTANCIAR LAS ARRAYLIST
    // PILOTOS/COCHES/CIRCUITOS
    public Almacen() {
        this.listaPilotos = new ArrayList<Piloto>();
//        this.listaPilotos.add(new Piloto(1,"FERNANDO ALONSO","ALO",14));
//        this.listaPilotos.add(new Piloto(2,"LEWIS HAMILTON","HAM",44));
        this.listaCoche = new ArrayList<Coche>();
//        this.listaCoche.add(new Coche(1,"ASTON MARTIN","MERCEDES",33));
//        this.listaCoche.add(new Coche(2,"MERCEDES","MERCEDES",63));
       this.listaCircuito = new ArrayList<Circuito>();
//        this.listaCircuito.add(new Circuito(1,"ABU DHABI", 4.5F,51.1F));
//        this.listaCircuito.add(new Circuito(2,"IMOLA", 3.3F,33.3F));
    }

    // PRACTICA NUEVA

    public void cargarPiloto() {

        try {
            // Para leer
            BufferedReader inputStream = new BufferedReader(new FileReader(new File("data/piloto.txt")));
            int idP = 0;
            String nombreP = "";
            String abreviacion = "";
            int numeroP = 0;

            String line = "";
            while ((line = inputStream.readLine()) != null) {
                String[] parts = line.split(":");
                Piloto piloto = new Piloto(idP, nombreP, abreviacion, numeroP);
                piloto.setIdP(Integer.parseInt(parts[0]));
                piloto.setNombreP(parts[1]);
                piloto.setAbreviacion(parts[2]);
                piloto.setNumeroP(Integer.parseInt(parts[3]));

                // Añadir el objeto cosa al ArrayList de cosas
                this.listaPilotos.add(piloto);
            }

            System.out.println("Datos cargados con éxito.\n");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void cargarCoche() {

        try {
            // Para leer
            BufferedReader inputStream = new BufferedReader(new FileReader(new File("data/coche.txt")));

            int idP = 0;
            String scuderia = "";
            String motor = "";
            int numeroC = 0;

            String line = "";
            while ((line = inputStream.readLine()) != null) {
                String[] parts = line.split(":");
                Coche coche = new Coche(idP, scuderia, motor, numeroC);
                coche.setIdP(Integer.parseInt(parts[0]));
                coche.setScuderia(parts[1]);
                coche.setMotor(parts[2]);
                coche.setNumeroC(Integer.parseInt(parts[3]));

                // Añadir el objeto cosa al ArrayList de cosas
                this.listaCoche.add(coche);
            }

            System.out.println("Datos cargados con éxito.\n");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void cargarCircuito() {

        try {
            // Para leer
            BufferedReader inputStream = new BufferedReader(new FileReader(new File("data/circuito.txt")));


            int idP = 0;
            String nombreCir = "";
            float kilometros = 0.0f;
            float temperatura = 0.0f;


            String line = "";
            while ((line = inputStream.readLine()) != null) {
                String[] parts = line.split(":");
                Circuito circuito = new Circuito(idP, nombreCir, kilometros, temperatura);
                circuito.setIdP(Integer.parseInt(parts[0]));
                circuito.setNombreCir(parts[1]);
                circuito.setKilometros(Float.parseFloat(parts[2]));
                circuito.setTemperatura(Float.parseFloat(parts[3]));

                // Añadir el objeto cosa al ArrayList de cosas
                this.listaCircuito.add(circuito);
            }

            System.out.println("Datos cargados con éxito.\n");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }





    public void guardarPiloto() {

        try {
            // Para escribir
            BufferedWriter outputStream = new BufferedWriter(new FileWriter(new File("data/piloto.txt")));

            // Leer las cosas y guardarlas en el fichero
            for (Piloto piloto : this.listaPilotos) {
                outputStream.write(piloto.getIdP() + ":");
                outputStream.write(piloto.getNombreP() + ":");
                outputStream.write(piloto.getAbreviacion() + ":");
                outputStream.write(piloto.getNumeroP() + "\n");
                //outputStream.close();
                //outputStream.write(piloto.isTangible() + "\n");
            }

            outputStream.close();

            System.out.println("Datos guardados con éxito.\n");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    public void guardarCoche() {

        try {
            // Para escribir
            BufferedWriter outputStream = new BufferedWriter(new FileWriter(new File("data/coche.txt")));

            // Leer las cosas y guardarlas en el fichero
            for (Coche coche : this.listaCoche) {
                outputStream.write(coche.getIdP() + ":");
                outputStream.write(coche.getScuderia() + ":");
                outputStream.write(coche.getMotor() + ":");
                outputStream.write(coche.getNumeroC() + "\n");
                //outputStream.close();
                //outputStream.write(piloto.isTangible() + "\n");
            }

            outputStream.close();

            System.out.println("Datos guardados con éxito.\n");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    public void guardarCircuito() {

        try {
            // Para escribir
            BufferedWriter outputStream = new BufferedWriter(new FileWriter(new File("data/circuito.txt")));

            // Leer las cosas y guardarlas en el fichero
            for (Circuito circuito : this.listaCircuito) {
                outputStream.write(circuito.getIdP() + ":");
                outputStream.write(circuito.getNombreCir() + ":");
                outputStream.write(circuito.getKilometros() + ":");
                outputStream.write(circuito.getTemperatura() + "\n");
                //outputStream.close();
                //outputStream.write(piloto.isTangible() + "\n");
            }

            outputStream.close();

            System.out.println("Datos guardados con éxito.\n");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }



        // TOSTRING PARA PRINTAR LAS LISTAS
    @Override
    public String toString() {
        // LISTAR LAS ARRAYLIST
        String resultado = "";
        // PRINTAR EL ARRAYLIST DE PILOTO
        resultado += Colores.BLUE+"ID\t\t\t\t\t\tNOMBRE\t\t\t\t\t\tABREVIACIÓN\t\t\t\t\t\tNÚMERO\n"+Colores.RESET;
        for (int i = 0; i < this.listaPilotos.size(); i++) {
            resultado += Colores.GREEN_BOLD+this.listaPilotos.get(i).toString()+Colores.RESET;
            resultado += "\n";
        }

        System.out.println("\n");

        resultado  += Colores.BLUE+"\nID\t\t\t\t\t\tSCUDERIA\t\t\t\t\t\tMOTOR\t\t\t\t\t\tNÚMERO\n"+Colores.RESET;
        // PRINTAR EL ARRAYLIST DE COCHE
        for (int i = 0; i < this.listaCoche.size(); i++) {
            resultado += Colores.YELLOW_BOLD+this.listaCoche.get(i).toString()+Colores.RESET;
            resultado += "\n";
        }

        System.out.println("\n");

        resultado += Colores.BLUE+"\nID\t\t\t\t\t\tCIRCUITO\t\t\t\t\t\tKILÓMETROS\t\t\t\t\t\tTEMPERATURA\n"+Colores.RESET;
        // PRINTAR EL ARRAYLIST DE CIRCUITO
        for (int i = 0; i < this.listaCircuito.size(); i++) {
            resultado += Colores.PURPLE_BOLD+this.listaCircuito.get(i).toString()+Colores.RESET;
            resultado += "\n";
        }
        System.out.println("\n");
        return resultado;
    }
}
