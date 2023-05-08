
public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        Lectura lectura = new Lectura();
        Controlador controlador = new Controlador();
        //menu.main();
        int eleccion;
        do {
            menu.mostrarMenuPrincipal();
            eleccion = lectura.leerOpcionMenu();

            // CONDICIONAL PARA LAS ELECCIONES
            if (eleccion == 1) {
                Piloto piloto = lectura.leerPiloto();
                controlador.anadirPiloto(piloto); // AÑADIR PILOTO
            } else if (eleccion == 2) {
                Coche coche = lectura.leerCoche();
                controlador.anadirCoche(coche); // AÑADIR COCHE
            } else if (eleccion == 3) {
                Circuito circuito = lectura.leerCircuito();
                controlador.anadirCircuito(circuito); // AÑADIR CIRCUITO
            } else if (eleccion == 4) {
                controlador.listar(); // LISTAR PILOTO/COCHE/CIRCUITO
            } else if (eleccion == 5) {
                int idP = lectura.leerCodigoEliminarPiloto();
                controlador.eliminarPiloto(idP); // ELIMINAR PILOTO
            } else if (eleccion == 6) {
                int idP = lectura.leerCodigoEliminarCoche();
                controlador.eliminarCoche(idP); // ELIMINAR COCHE
            } else if (eleccion == 7) {
                int idP = lectura.leerCodigoEliminarCircuito();
                controlador.eliminarCircuito(idP); // ELIMINAR CIRCUITO
            } else if (eleccion == 8) {
                int idP = lectura.leerCodigoModificarPiloto();
                controlador.modificarPiloto(idP); // MODIFICAR PILOTO
            } else if (eleccion == 9) {
                int idP = lectura.leerCodigoModificarCoche();
                controlador.modificarCoche(idP); // MODIFICAR COCHE
            } else if (eleccion == 10) {
                int idP = lectura.leerCodigoModificarCircuito();
                controlador.modificarCircuito(idP); // MODIFICAR CIRCUITO
            } else if (eleccion == 11) {
                controlador.almacen.cargarPiloto();
            } else if (eleccion == 12) {
                controlador.almacen.guardarPiloto();
            } else if (eleccion == 13) {
                controlador.almacen.cargarCoche();
            } else if (eleccion == 14) {
                controlador.almacen.guardarCoche();
            } else if (eleccion == 15) {
                controlador.almacen.cargarCircuito();
            } else if (eleccion == 16) {
                controlador.almacen.guardarCircuito();
            }

        } while (eleccion != 0); // SALIR DEL BUCLE



    }
}