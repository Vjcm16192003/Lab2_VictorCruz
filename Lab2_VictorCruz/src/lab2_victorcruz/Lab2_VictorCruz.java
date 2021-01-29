package lab2_victorcruz;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab2_VictorCruz {

    static Scanner sc = new Scanner(System.in);
    static String username = "David";
    static String password = "99";

    public static void main(String[] args) {
        ArrayList Rest = new ArrayList();
        System.out.println("Ingrese su nombre de usuario!!!: ");
        String user1 = sc.next();
        System.out.println("Ingrese su contraseña!!!: ");
        String psswd1 = sc.next();
        if (user1.equalsIgnoreCase(username) && psswd1.equalsIgnoreCase(password)) {
            int menuPrincipal = 0;
            boolean seguir = true;
            System.out.println("Ingrese una opcion: \n"
                    + "1-Reporte de los restaurantes\n"
                    + "2-Manejo de los restaurantes\n"
                    + "3-Salir");
            System.out.print("-> ");
            menuPrincipal = sc.nextInt();
            switch (menuPrincipal) {
                case 1:
                    int op1 = 0;
                    boolean seguir2 = true;
                        while (seguir2) {
                            System.out.println("1-Reporte 1\n"
                                    + "2-Reporte 2\n"
                                    + "3-Reporte 3\n"
                                    + "4-Regresar");
                            System.out.print("-> ");
                            op1 = sc.nextInt();
                            switch (op1) {
                              case 1:
                                System.out.println("Ingrese que estado desea buscar[Remodelacion/ Demolicion/ Funcional]: ");
                                String search = sc.next();
                                System.out.println("Restaurantes " + search);
                                for (Object v :  Rest) {
                                Object j = ((Restaurante) v).getEsta_Restaurante();
                                String estado = j.toString();
                                if (estado.equals(search)) {
                                    System.out.println(Rest.indexOf(v) + " --> " + v);
                                }//fin del if
                            }//fin del for
                               break;
                               case 2: 
                                   System.out.println("Restaurantes premium en el Array");
                            for (Object v : Rest) {
                                Object k = ((Restaurante) v).getEs_premium();
                                String parqueo = k.toString();
                                Object i = ((Restaurante) v).getEs_premium();
                                String juego = i.toString();
                                if (parqueo.equals("Si existe parqueo") & juego.equals("Si existe area de juegos")) {
                                    Object n_rest = ((Restaurante) v).getNom_restaurante();
                                    Object espcial = ((Restaurante) v).getEspec_Restaurante();
                                    Object location = ((Restaurante) v).getLocation();
                                    System.out.println(Rest.indexOf(v) + 
                                            " - Nombre: " + n_rest 
                                            + ", Especialidad: " + espcial 
                                            + ", Ubicacion: " + location);
                                }//fin del if
                            }//fin del for
                               break; 
                               case 3:  
                                   System.out.println("Ingrese la franquicia desea buscar los restaurantes : ");
                            search = sc.next();
                            System.out.println("Restaurantes " + search);
                            for (Object v : Rest) {
                                Object j = ((Restaurante) v).getNom_Franquicia();
                                String franquicia = j.toString();
                                if (franquicia.equals(search)) {
                                    System.out.println(Rest.indexOf(v) + " --> " + v);
                                }//fin del if
                            }//fin del for
                               break;
                               case 4:
                                   seguir2 = false;
                               break;
                               default: System.out.println("Ingrese una opcion valida!");
                            }//fin del switch secundario
                        }//fin del while
                    break;
                    
                case 2:
                    int opc1 = 0;
                        boolean seguir5 = true;
                        while (seguir5) {
                            System.out.println("1-Crear restaurante\n"
                                    + "2-Listar restaurante\n"
                                    + "3-Modificar restaurante\n"
                                    + "4-Eliminar restaurante\n"
                                    + "5-Regresar");
                            System.out.print("-> ");
                            opc1 = sc.nextInt();
                            
                            switch(opc1){
                                case 1:
                                    int cm = 0;
                                    String nombre_ger = " ";
                                    String especialidad = " ";
                                    String tipo_rest = " ";
                                    System.out.println("Ingrese nombre de la franquicia: ");
                                    String franq = sc.next();
                                    System.out.println("Ingrese el nombre del restaurante: ");
                                    String n_rest = sc.next();
                                    System.out.println("Ingrese la ubicacion: ");
                                    String location = sc.next();
                                    System.out.println("Ingrese cantidad de empleados: ");
                                    int cant_emp = sc.nextInt();
                                    System.out.println("Tiene parqueo mas de 30 carros [S/N]");
                                    char resp = sc.next().charAt(0);
                                    System.out.println("Tiene Area de juegos [S/N]");
                                    char resp2 = sc.next().charAt(0);
                                    if (resp == 'S' || resp == 's' && resp2 == 'S' || resp2 == 's') {
                                        tipo_rest = "Premiun";
                                    } else if (resp2 == 'N' || resp2 == 'n' && resp == 'N' || resp == 'n') {
                                        tipo_rest = "No es premiun";
                                    } else if (resp == 'S' || resp == 's' && resp2 == 'N' || resp2 == 'n') {
                                        tipo_rest = "No es premiun";
                                    } else if (resp == 'N' || resp == 'n' && resp2 == 'S' || resp2 == 's') {
                                        tipo_rest = "No es premiun";
                                    }
                                    System.out.println("Ingrese cantidad de cajeros: ");
                                    int cant_caj = sc.nextInt();
                                    System.out.println("Ingrese el Estado del restaurante: \n");
                                    System.out.println("1) Funcional\n"
                                            + "2) Remodelacin\n"
                                            + "3) Demolicion ");
                                    System.out.println("Ingrese una opcion: ");
                                    int opce = sc.nextInt();
                                    String state = " ";
                                    switch (opce) {
                                        case 1:
                                            state = "Funcional";
                                            System.out.println("Ingrese cantidad de mesas: ");
                                            cm = sc.nextInt();
                                            System.out.println("Ingrese el nombre del gerente: ");
                                            nombre_ger = sc.next();
                                            System.out.println("Ingrese la especialidad del restaurante: ");
                                            especialidad = sc.next();
                                            break;
                                        case 2:
                                            state = "Remodelacion";
                                            break;
                                        case 3:
                                            state = "Demolicion";
                                            break;
                                        default:
                                      System.out.println("Ingrese una opcion correcta");
                                        }//fin del switch de estado
                                    Rest.add(new Restaurante(franq,n_rest,location,cant_emp,tipo_rest,cant_caj,state,cm,nombre_ger,especialidad));                                  
                                    break;
                                case 2:
                                     String output = " ";
                                    for (Object t : Rest) {
                                        if (t instanceof Restaurante) {
                                            output += Rest.indexOf(t) + "-->" + t + "\n";
                                        }//fin del if
                                    }//fin del for
                                    System.out.println(output);
                                    break;   
                                case 3:
                                    int opc3 = 0;
                                    boolean seguir6 = true;
                                    while (seguir6) {
                                        System.out.println("Que opcion desea modificar?\n"
                                                + "1-cambiar franquicia\n"
                                                + "2-cambiar nombre del restuarante\n"
                                                + "3-cambiar ubicacion del restaurante\n"
                                                + "4-cambiar la cantidad de empleados\n"
                                                + "5-cambiar si es Premium o no"
                                                + "6-cambiar cantidad de cajeros\n"
                                                + "7-cambiar cantidad de empleados\n"
                                                + "8-cambiar nombre del gerente\n"
                                                + "9-cambiar la especialidad del restaurante\n"
                                                + "10-Regresar\n");
                                        System.out.print("-> ");
                                        opc3 = sc.nextInt();

                                        switch (opc3) {
                                            case 1:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                int p_1 = sc.nextInt();
                                                if (Rest.get(p_1) instanceof Restaurante) {
                                                    System.out.println("Ingrese la nueva Franquicia");
                                                    String fran1 = sc.next();
                                                    ((Restaurante) Rest.get(p_1)).setNom_Franquicia(fran1);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else
                                                break;
                                            case 2:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                int p_2 = sc.nextInt();
                                                if (Rest.get(p_2) instanceof Restaurante) {
                                                    System.out.println("Ingrese el nuevo nombre del restaurante");
                                                    String nom_res = sc.next();
                                                    ((Restaurante) Rest.get(p_2)).setNom_restaurante(nom_res);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else
                                                break;
                                            case 3:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                int p_3 = sc.nextInt();
                                                if (Rest.get(p_3) instanceof Restaurante) {
                                                    System.out.println("Ingrese la nueva ubicacion");
                                                    String new_u = sc.next();
                                                    ((Restaurante) Rest.get(p_3)).setLocation(new_u);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else
                                                break;
                                            case 4:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                int p_4 = sc.nextInt();
                                                if (Rest.get(p_4) instanceof Restaurante) {
                                                    System.out.println("Ingrese la nueva cantidad de empleados");
                                                    int new_cante = sc.nextInt();
                                                    ((Restaurante) Rest.get(p_4)).setCant_empleados(new_cante);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else
                                                break;
                                            case 5:
                                                String tipo_res = "";
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                int p_5 = sc.nextInt();
                                                if (Rest.get(p_5) instanceof Restaurante) {
                                                    System.out.println("Tiene parqueo mas de 30 carros [S/N]");
                                                    char reesp = sc.next().charAt(0);
                                                    System.out.println("Tiene Area de juegos [S/N]");
                                                    char reesp1 = sc.next().charAt(0);
                                                    if (reesp == 'S' || reesp == 's' && reesp1 == 'S' || reesp1 == 's') {
                                                        tipo_res = "Premiun";
                                                    } else if (reesp1 == 'N' || reesp1 == 'n' && reesp == 'N' || reesp == 'n') {
                                                        tipo_res = "No es premiun";
                                                    } else if (reesp == 'S' || reesp == 's' && reesp1 == 'N' || reesp1 == 'n') {
                                                        tipo_res = "No es premiun";
                                                    } else if (reesp == 'N' || reesp == 'n' && reesp1 == 'S' || reesp1 == 's') {
                                                        tipo_res = "No es premiun";
                                                    }//fin de las condiciones
                                                    ((Restaurante) Rest.get(p_5)).setEs_premium(tipo_res);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else
                                                break;
                                            case 6:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                int p_6 = sc.nextInt();
                                                if (Rest.get(p_6) instanceof Restaurante) {
                                                    System.out.println("Ingrese nueva cantidad de cajeros");
                                                    int new_caj = sc.nextInt();
                                                    ((Restaurante) Rest.get(p_6)).setCant_Cajeros(new_caj);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else
                                                break;
                                            case 7:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                int p_7 = sc.nextInt();
                                                if (Rest.get(p_7) instanceof Restaurante) {
                                                    System.out.println("Ingrese la nueva cantidad de mesas");
                                                    int new_mesas = sc.nextInt();
                                                    ((Restaurante) Rest.get(p_7)).setCant_mesas(new_mesas);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else
                                                break;
                                            case 8:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                int p_8 = sc.nextInt();
                                                if (Rest.get(p_8) instanceof Restaurante) {
                                                    System.out.println("Ingrese el nuevo nombre del gerente");
                                                    String new_geren = sc.next();
                                                    ((Restaurante) Rest.get(p_8)).setNom_Gerente(new_geren);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else
                                                break;
                                            case 9:
                                                 System.out.println("ingrese la posicion del producto a modificar");
                                                int p_9 = sc.nextInt();
                                                if (Rest.get(p_9) instanceof Restaurante) {
                                                    System.out.println("Ingrese la nueva especialidad del gerente");
                                                    String new_espe = sc.next();
                                                    ((Restaurante) Rest.get(p_9)).setEspec_Restaurante(new_espe);
                                                } else {
                                                    System.out.println("La posicion no tiene un elemento a modificar!!!");
                                                }//fin del else
                                                break;
                                            case 10:
                                                seguir6 = false;
                                                break;
                                            default:
                                                System.out.println("Ingrese una opcion valida");
                                        }//fin menu secundario
                                    }//fin de resp
                                    break;
                                case 4:
                                    System.out.println("Ingrese la posicion del restaurante que desea eliminar: ");
                                    int pos = sc.nextInt();
                                    if (Rest.get(pos) instanceof Restaurante) {
                                        Rest.remove(pos);
                                    } else {
                                        System.out.println("La posicion ingresada no contiene un restaurante");
                                    }//fin del else
                                    break;
                                case 5:
                                    seguir5 = false;
                                    break;
                                default: System.out.println("Ingrese una opcion valida");
                            }//switch secundario
                        }//resp
                    break;
                case 3:
                    seguir = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }//fin del menu principal
        }else{
            System.out.println("Usuario o contreaseña no valida!");
            System.out.println("");
            System.out.println("Ingrese su nombre de usuario!!!: ");
            user1 = sc.next();
            System.out.println("Ingrese su contraseña!!!: ");
            psswd1 = sc.next();
        } //fin de validacion
    }//fin del main
}//fin de la clase 
