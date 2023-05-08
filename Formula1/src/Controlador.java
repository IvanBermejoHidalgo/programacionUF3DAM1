import java.util.ArrayList;
import java.util.Scanner;

public class Controlador {
    Almacen almacen = new Almacen();

    // ELIMINAR PILOTOS
    public void eliminarPiloto(int idP) {
        boolean borrar = false;
        for (int i = 0; i < almacen.listaPilotos.size(); i++) {
            if (almacen.listaPilotos.get(i).getIdP() == idP) {
                almacen.listaPilotos.remove(i);
                borrar = true;
                System.out.println(Colores.GREEN_BOLD + "PILOTO ELIMINADO." + Colores.RESET);
                break;
            }
            if (!borrar) System.out.println(Colores.RED + "NO SE HA PODIDO ELIMINAR." + Colores.RESET);
        }
    }

    // ELIMINAR COCHE
    public void eliminarCoche(int idP) {
        boolean borrar = false;
        for (int i = 0; i < almacen.listaCoche.size(); i++) {
            if (almacen.listaCoche.get(i).getIdP() == idP) {
                almacen.listaCoche.remove(i);
                borrar = true;
                System.out.println(Colores.YELLOW_BOLD + "COCHE ELIMINADO." + Colores.RESET);
                break;
            }
            if (!borrar) System.out.println(Colores.RED + "NO SE HA PODIDO ELIMINAR." + Colores.RESET);
        }
    }

    // ELIMINAR CIRCUITO
    public void eliminarCircuito(int idP) {
        boolean borrar = false;
        for (int i = 0; i < almacen.listaCircuito.size(); i++) {
            if (almacen.listaCircuito.get(i).getIdP() == idP) {
                almacen.listaCircuito.remove(i);
                borrar = true;
                System.out.println(Colores.PURPLE_BOLD + "CIRCUITO ELIMINADO." + Colores.RESET);
                break;
            }
            if (!borrar) System.out.println(Colores.RED + "NO SE HA PODIDO ELIMINAR." + Colores.RESET);
        }
    }

    // LISTAR PILOTO/COCHE/CIRCUITO
    public void listar() {
        // LISTAR
        System.out.println(almacen);
    }

    // AÑADIR PILOTO
    public void anadirPiloto(Piloto piloto) {
        almacen.listaPilotos.add(piloto);
        System.out.println(Colores.GREEN_BOLD + "PILOTO AÑADIDO CON ÉXITO." + Colores.RESET);
    }

    // AÑADIR COCHE
    public void anadirCoche(Coche coche) {
        almacen.listaCoche.add(coche);
        System.out.println(Colores.YELLOW_BOLD + "COCHE AÑADIDO CON ÉXITO." + Colores.RESET);
    }

    // AÑADIR CIRCUITO
    public void anadirCircuito(Circuito circuito) {
        almacen.listaCircuito.add(circuito);
        System.out.println(Colores.PURPLE_BOLD + "CIRCUITO AÑADIDO CON ÉXITO." + Colores.RESET);
    }


    // MODIFICAR LOS DATOS DEL PILOTO SELECCIONADO
    public void modificarPiloto(int idP) {
        Scanner scanner = new Scanner(System.in);
        boolean modificado = false;
        for (Piloto p : almacen.listaPilotos) {
            if (p.getIdP() == idP) {

                modificado = true;
                System.out.println(Colores.GREEN_BOLD+"¿Quieres modificar el ID? \n1-SI\n2-NO"+Colores.RESET);
                int eleccion = scanner.nextInt();
                if (eleccion == 1) {
                    System.out.println(Colores.GREEN_BOLD+"¿Qué ID quieres poner?"+Colores.RESET);
                    int newidP = scanner.nextInt();
                    p.setIdP(newidP);

                }

                System.out.println(Colores.GREEN_BOLD+"¿Quieres modificar el nombre? \n1-SI \n2-NO"+Colores.RESET);
                eleccion = scanner.nextInt();
                scanner.nextLine();
                if (eleccion == 1) {
                    System.out.println(Colores.GREEN_BOLD+"¿Que nombre le quieres poner?"+Colores.RESET);
                    String newnombreP = scanner.nextLine();
                    p.setNombreP(newnombreP);
                }

                System.out.println(Colores.GREEN_BOLD+"¿Quieres modificar la abreviación? \n1-SI \n2-NO"+Colores.RESET);
                eleccion = scanner.nextInt();
                scanner.nextLine();
                if (eleccion == 1) {
                    System.out.println(Colores.GREEN_BOLD+"¿Que abreviación quieres poner?"+Colores.RESET);
                    String newabre = scanner.nextLine();
                    p.setAbreviacion(newabre);
                }

                System.out.println(Colores.GREEN_BOLD+"¿Quieres modificar el numero? \n1-SI \n2-NO"+Colores.RESET);
                eleccion = scanner.nextInt();
                if (eleccion == 1) {
                    System.out.println(Colores.GREEN_BOLD+"¿Que numero quieres poner?"+Colores.RESET);
                    int newnumero = scanner.nextInt();
                    p.setNumeroP(newnumero);
                }
                break;
            }
        }
        if (!modificado) {
            System.out.println(Colores.RED+"No se encontró ningún piloto con el ID especificado."+Colores.RESET);
        }
    }

    // MODIFICAR LOS DATOS DEL COCHE SELECCIONADO
    public void modificarCoche(int idP) {
        Scanner scanner = new Scanner(System.in);
        boolean modificado = false;
        for (Coche c : almacen.listaCoche) {
            if (c.getIdP() == idP) {

                modificado = true;
                System.out.println(Colores.YELLOW_BOLD+"¿Quieres modificar el ID del coche? \n1-SI\n2-NO"+Colores.RESET);
                int eleccion = scanner.nextInt();
                if (eleccion == 1) {
                    System.out.println(Colores.YELLOW_BOLD+"¿Qué ID le quieres poner?"+Colores.RESET);
                    int newidP = scanner.nextInt();
                    c.setIdP(newidP);

                }

                System.out.println(Colores.YELLOW_BOLD+"¿Quieres modificar el nombre del coche? \n1-SI \n2-NO"+Colores.RESET);
                eleccion = scanner.nextInt();
                scanner.nextLine();
                if (eleccion == 1) {
                    System.out.println(Colores.YELLOW_BOLD+"¿Que nombre le quieres poner?"+Colores.RESET);
                    String newscu = scanner.nextLine();
                    c.setScuderia(newscu);
                }

                System.out.println(Colores.YELLOW_BOLD+"¿Quieres modificar el nombre del motor? \n1-SI \n2-NO"+Colores.RESET);
                eleccion = scanner.nextInt();
                scanner.nextLine();
                if (eleccion == 1) {
                    System.out.println(Colores.YELLOW_BOLD+"¿Que nombre de motor quieres poner?"+Colores.RESET);
                    String newmotor = scanner.nextLine();
                    c.setMotor(newmotor);
                }

                System.out.println(Colores.YELLOW_BOLD+"¿Quieres modificar el numero del coche? \n1-SI \n2-NO"+Colores.RESET);
                eleccion = scanner.nextInt();
                if (eleccion == 1) {
                    System.out.println(Colores.YELLOW_BOLD+"¿Que numero de coche quieres poner?"+Colores.RESET);
                    int newnumeroC = scanner.nextInt();
                    c.setNumeroC(newnumeroC);
                }
                break;
            }
        }
        if (!modificado) {
            System.out.println(Colores.RED+"No se encontró ningún coche con el ID especificado."+Colores.RESET);
        }
    }

    // MODIFICAR LOS DATOS DEL CIRCUITO SELECCIONADO
    public void modificarCircuito(int idP) {
        Scanner scanner = new Scanner(System.in);
        boolean modificado = false;
        for (Circuito circuito : almacen.listaCircuito) {
            if (circuito.getIdP() == idP) {

                modificado = true;
                System.out.println(Colores.PURPLE_BOLD+"¿Quieres modificar el ID del circuito? \n1-SI\n2-NO"+Colores.RESET);
                int eleccion = scanner.nextInt();
                if (eleccion == 1) {
                    System.out.println(Colores.PURPLE_BOLD+"¿Qué ID le quieres poner?"+Colores.RESET);
                    int newidP = scanner.nextInt();
                    circuito.setIdP(newidP);

                }

                System.out.println(Colores.PURPLE_BOLD+"¿Quieres modificar el nombre del circuito? \n1-SI \n2-NO"+Colores.RESET);
                eleccion = scanner.nextInt();
                scanner.nextLine();
                if (eleccion == 1) {
                    System.out.println(Colores.PURPLE_BOLD+"¿Que nombre le quieres poner?"+Colores.RESET);
                    String newnom = scanner.nextLine();
                    circuito.setNombreCir(newnom);
                }

                System.out.println(Colores.PURPLE_BOLD+"¿Quieres modificar los kilometros del circuito? \n1-SI \n2-NO"+Colores.RESET);
                eleccion = scanner.nextInt();
                scanner.nextLine();
                if (eleccion == 1) {
                    System.out.println(Colores.PURPLE_BOLD+"¿Cuantos kilometros tiene el circuito?"+Colores.RESET);
                    float newkilom = scanner.nextFloat();
                    circuito.setKilometros(newkilom);
                }

                System.out.println(Colores.PURPLE_BOLD+"¿Quieres modificar la temperatura del circuito? \n1-SI \n2-NO"+Colores.RESET);
                eleccion = scanner.nextInt();
                if (eleccion == 1) {
                    System.out.println(Colores.PURPLE_BOLD+"¿Que temperatura hace en el circuito?"+Colores.RESET);
                    float newtempora = scanner.nextFloat();
                    circuito.setTemperatura(newtempora);
                }
                break;
            }
        }
        if (!modificado) {
            System.out.println(Colores.RED+"No se encontró ningún circuito con el ID especificado."+Colores.RESET);
        }
    }
}