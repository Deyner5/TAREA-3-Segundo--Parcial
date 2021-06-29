import java.util.Scanner;

public class Tarea3_Nombre_Y_Apellido {

    public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);

String nom , ape ; 

System.out.println("Ingresa un nombre ");

nom = teclado.nextLine();

System.out.println("Ingresa un apellido ");

ape = teclado.nextLine();

System.out.println("Hola mi nombre es: " + nom);
System.out.println("Mi apellido es: " + ape);
 
    }

}