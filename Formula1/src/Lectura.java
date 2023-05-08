import java.util.Scanner;

public class Lectura {
    Almacen almacen = new Almacen();
    // PREGUNTAS PARA AÑADIR PILOTO
    public Piloto leerPiloto() {
        Scanner scanner = new Scanner(System.in);
        int idP = 0;
        System.out.println(Colores.BLUE+"══════════════════════════════════════════"+Colores.RESET);
        boolean existeono = true;
        while (existeono) {
            System.out.println("Introduce el ID del piloto");
            idP = scanner.nextInt();
            scanner.nextLine();

            existeono = false;
            for (Piloto p : almacen.listaPilotos) {
                if (p.getIdP() == idP) {
                    existeono = true;
                    System.out.println("La ID ya está en uso. Ingrese un código diferente.");
                    break;
                }
            }

        }
        System.out.println(Colores.BLUE+"══════════════════════════════════════════");
        System.out.println(Colores.BLUE+"┌─────────────────────────────────────────┐");
        System.out.println(Colores.BLUE+"│"+Colores.GREEN_BOLD+"                  PILOTO                 "+Colores.BLUE+"│");
        System.out.println(Colores.BLUE+"└─────────────────────────────────────────┘");
        System.out.println(Colores.GREEN_BOLD+"Introduce el nombre del piloto:");
        String nombreP = scanner.nextLine();

        System.out.println(Colores.GREEN_BOLD+"Introduce la abreviación del piloto:");
        String abreviacion = scanner.nextLine();

        System.out.println(Colores.GREEN_BOLD+"Introduce el número del piloto:");
        int numeroP = scanner.nextInt();
        System.out.println(Colores.BLUE+"══════════════════════════════════════════"+Colores.RESET);

        scanner.nextLine();
        return new Piloto(idP,nombreP, abreviacion, numeroP);

    }

    // PREGUNTAS PARA AÑADIR COCHE
    public Coche leerCoche() {
        Scanner scanner = new Scanner(System.in);
        int idP = 0;
        System.out.println(Colores.BLUE+"══════════════════════════════════════════"+Colores.RESET);
        boolean existeono = true;
        while (existeono) {
            System.out.println("Introduce el ID del coche:");
            idP = scanner.nextInt();
            scanner.nextLine();

            existeono = false;
            for (Coche c : almacen.listaCoche) {
                if (c.getIdP() == idP) {
                    existeono = true;
                    System.out.println("La ID ya está en uso. Ingrese un código diferente.");
                    break;
                }
            }

        }
        System.out.println(Colores.BLUE+"══════════════════════════════════════════");
        System.out.println(Colores.BLUE+"┌─────────────────────────────────────────┐");
        System.out.println(Colores.BLUE+"│"+Colores.YELLOW_BOLD+"                  COCHE                  "+Colores.BLUE+"│");
        System.out.println(Colores.BLUE+"└─────────────────────────────────────────┘");
        System.out.println(Colores.YELLOW_BOLD+"Introduce el nombre de la Scuderia:");
        String scuderia = scanner.nextLine();

        System.out.println(Colores.YELLOW_BOLD+"Introduce la marca del motor:");
        String motor = scanner.nextLine();

        System.out.println(Colores.YELLOW_BOLD+"Introduce el número del coche:");
        int numeroC = scanner.nextInt();
        System.out.println(Colores.BLUE+"══════════════════════════════════════════"+Colores.RESET);

        scanner.nextLine();
        return new Coche(idP,scuderia,motor,numeroC);
    }

    // PREGUNTAS PARA AÑADIR CIRCUITO
    public Circuito leerCircuito() {
        Scanner scanner = new Scanner(System.in);
        int idP = 0;
        System.out.println(Colores.BLUE+"══════════════════════════════════════════"+Colores.RESET);
        boolean existeono = true;
        while (existeono) {
            System.out.println("Introduce el ID del circuito:");
            idP = scanner.nextInt();
            scanner.nextLine();

            existeono = false;
            for (Circuito ci : almacen.listaCircuito) {
                if (ci.getIdP() == idP) {
                    existeono = true;
                    System.out.println("La ID ya está en uso. Ingrese un código diferente.");
                    break;
                }
            }

        }
        System.out.println(Colores.BLUE+"══════════════════════════════════════════");
        System.out.println(Colores.BLUE+"┌─────────────────────────────────────────┐");
        System.out.println(Colores.BLUE+"│"+Colores.PURPLE_BOLD+"                 CIRCUITO                "+Colores.BLUE+"│");
        System.out.println(Colores.BLUE+"└─────────────────────────────────────────┘");
        System.out.println(Colores.PURPLE_BOLD+"Introduce el nombre del circuito:");
        String nombreCir = scanner.nextLine();

        System.out.println(Colores.PURPLE_BOLD+"Introduce los kilómetros del circuito:");
        float kilometros = scanner.nextFloat();

        System.out.println(Colores.PURPLE_BOLD+"Introduce la temperatura del circuito:");
        float temperatura = scanner.nextFloat();
        System.out.println(Colores.BLUE+"══════════════════════════════════════════"+Colores.RESET);

        // GUARDA LAS VARIABLES EN LA ARRAYLIST
        scanner.nextLine();
        return new Circuito(idP,nombreCir,kilometros,temperatura);
    }

    // LECTURA DE "Elección" DEL MENU PRINCIPAL
    public int leerOpcionMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.print(Colores.RED_BOLD+"Elección: " + Colores.RESET);
        int eleccion = scanner.nextInt();
        scanner.nextLine();

        return eleccion;
    }

    // PREGUNTA ELIMINAR PILOTO
    public int leerCodigoEliminarPiloto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Colores.BLUE+"Introduce el código del piloto que quieres eliminar:"+Colores.RESET);
        int idP = scanner.nextInt();
        return idP;
    }

    // PREGUNTA ELIMINAR COCHE

    public int leerCodigoEliminarCoche() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Colores.BLUE+"Introduce el código del coche que quieres eliminar:"+Colores.RESET);
        int idP = scanner.nextInt();
        return idP;
    }

    // PREGUNTA ELIMINAR CIRCUITO
    public int leerCodigoEliminarCircuito() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Colores.BLUE+"Introduce el código del circuito que quieres eliminar:"+Colores.RESET);
        int idP = scanner.nextInt();
        return idP;
    }

    // PREGUNTA MODIFICAR PILOTO
    public int leerCodigoModificarPiloto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Colores.BLUE+"Introduce el código del piloto que quieres modificar:"+Colores.RESET);
        int idP = scanner.nextInt();
        return idP;
    }

    // PREGUNTA MODIFICAR COCHE
    public int leerCodigoModificarCoche() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Colores.BLUE+"Introduce el código del coche que quieres modificar:"+Colores.RESET);
        int idP = scanner.nextInt();
        return idP;
    }

    // PREGUNTA MODIFICAR CIRCUITO
    public int leerCodigoModificarCircuito() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Colores.BLUE+"Introduce el código del circuito que quieres modificar:"+Colores.RESET);
        int idP = scanner.nextInt();
        return idP;
    }

}
