package lab2_victorcruz;
 
import java.util.Scanner;
public class Lab2_VictorCruz {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String usuario = "David";
        String contra = "99";
        int opc = 0;
        System.out.println("Ingrese su nombre de usuario!!!: ");
        String user1 = sc.next();
        System.out.println("Ingrese su contraseña!!!: ");
        String psswd1 = sc.next();
        while (user1.equalsIgnoreCase(usuario) && psswd1.equalsIgnoreCase(contra)) {
            while (opc != 3) {
                System.out.println("1 Reporte de restaurantes\n"
                                    + "2 Manejo de restaurantes\n"
                                    + "3 Salir. ");
                System.out.println("Ingrese la opcion: ");
                opc = sc.nextInt();
                switch (opc) {
                    case 1: {

                    }
                    break;
                    case 2: {

                    }
                    break;
                    case 3: {

                    }
                    break;
                }//fin del switch
            }//fin del While \
            System.out.println("Ingrese correctamente su nombre de usuario y contraseña");
        }//fin del while principal
    }//fin del main
}//fin de la clase 
