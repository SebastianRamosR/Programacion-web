import java.util.ArrayList;
import java.util.Scanner;


public class agenda {
        public static void main(String[] args) {
		
            Scanner sc = new Scanner (System.in);
            do {
            System.out.println ("Bienvendio a la agenda");
            System.out.println("||||||||||||||||||||||||");
                System.out.println("Ingresar nuevo contacto (A) o Consultar contacto existente(B)");
                char cunsulta = sc.nextLine(). charAt(0);
                if (cunsulta == 'A') {
                System.out.println ("Ingrese el nombre");
                String name = sc.nextLine();
                System.out.println("Ingrese un numero");
                String number = sc.nextLine();
                System.out.println("Ingrese un email(o presione enter si no lo sabe)");
                String gmail = sc.nextLine();
                System.out.println("Contacto ingresado");
                contactos usuario = new contactos(name,number,gmail);
                ArrayList<contactos> usu = new ArrayList<contactos>();
                usu.add(usuario);
                
                }else {
                    
                    
                        
                    }
                
            }while(true);
            }
        }
        