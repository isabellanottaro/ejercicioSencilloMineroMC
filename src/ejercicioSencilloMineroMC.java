import java.util.Scanner;

public class ejercicioSencilloMineroMC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( " Hola! Cuantos bloques quieres picar? ");
        int bloques = sc.nextInt();

        for (int bloque2 = 1; bloque2 <= bloques; bloque2++) {
            System.out.println( " Has picado " + bloque2 + " bloques. " );
        }
        System.out.println("\n Has terminado de picar! ");
        sc.close();
    }

    }