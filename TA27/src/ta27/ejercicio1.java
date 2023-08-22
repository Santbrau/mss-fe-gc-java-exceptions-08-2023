package ta27;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ejercicio1 {

	  public static void main(String[] args) {
	        Juego juego = new Juego();
	        juego.iniciarJuego();
	    }
	}

	class Juego {
	    private int numeroAdivinar;
	    private int intentos;
	    private boolean adivinado;
	    private Scanner scanner;

	    public Juego() {
	        Random rand = new Random();
	        numeroAdivinar = rand.nextInt(500) + 1;
	        intentos = 0;
	        adivinado = false;
	        scanner = new Scanner(System.in);
	    }

	    public void iniciarJuego() {
	        System.out.println("Bienvenido al juego de adivinar el número entre 1 y 500.");
	        while (!adivinado) {
	            System.out.print("Adivina el número: ");
	            try {
	                int intento = scanner.nextInt();
	                intentos++;
	                verificarIntento(intento);
	            } catch (InputMismatchException e) {
	                System.out.println("Entrada no válida. Debes introducir un número.");
	                scanner.nextLine(); 
	            }
	        }
	        scanner.close();
	    }

	    private void verificarIntento(int intento) {
	        if (intento < numeroAdivinar) {
	            System.out.println("El número a adivinar es mayor.");
	        } else if (intento > numeroAdivinar) {
	            System.out.println("El número a adivinar es menor.");
	        } else {
	            adivinado = true;
	            System.out.println("¡Felicidades! Adivinaste el número " + numeroAdivinar + " en " + intentos + " intentos.");
	        }
	    }
	}
