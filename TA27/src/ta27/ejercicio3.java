package ta27;

import java.util.Random;

public class ejercicio3 {
    public static void main(String[] args) {
        try {
            int numeroAleatorio = generarNumeroAleatorio();
            System.out.println("Número aleatorio generado: " + numeroAleatorio);

            verificarParidad(numeroAleatorio);
            System.out.println("El número es par.");
        } catch (ParImparException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
            System.out.println("El número es impar.");
        }
    }

    public static int generarNumeroAleatorio() {
        Random rand = new Random();
        return rand.nextInt(1000); 
    }

    public static void verificarParidad(int numero) throws ParImparException {
        if (numero % 2 != 0) {
            throw new ParImparException("El número es impar.");
        }
    }

    public static class ParImparException extends Exception {
        public ParImparException(String message) {
            super(message);
        }
    }
}

