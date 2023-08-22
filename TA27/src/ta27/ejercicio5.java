package ta27;

import java.util.Random;
import java.util.Scanner;

class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de contraseñas a generar: ");
        int cantidadContraseñas = scanner.nextInt();

        System.out.print("Ingrese la longitud de las contraseñas: ");
        int longitud = scanner.nextInt();

        Contraseña[] contraseñas = new Contraseña[cantidadContraseñas];
        boolean[] contraseñasFuertes = new boolean[cantidadContraseñas];

        for (int i = 0; i < cantidadContraseñas; i++) {
            contraseñas[i] = new Contraseña(longitud);
            contraseñasFuertes[i] = contraseñas[i].esFuerte();
        }

        System.out.println("Contraseñas generadas:");
        for (int i = 0; i < cantidadContraseñas; i++) {
            System.out.println("Contraseña: " + contraseñas[i].getContraseña());
            System.out.println("Fuerte: " + contraseñasFuertes[i]);
            System.out.println("--------------------");
        }

        scanner.close();
    }
}

class Contraseña {
    private int longitud;
    private String contraseña;

    public Contraseña() {
        this.longitud = 8;
        generarPassword();
    }

    public Contraseña(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    public boolean esFuerte() {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        for (char c : contraseña.toCharArray()) {
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                numeros++;
            }
        }

        return mayusculas > 2 && minusculas > 1 && numeros > 5;
    }

    public void generarPassword() {
        Random rand = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int tipo = rand.nextInt(3);

            if (tipo == 0) {
                char letraMayuscula = (char) (rand.nextInt(26) + 'A');
                password.append(letraMayuscula);
            } else if (tipo == 1) {
                char letraMinuscula = (char) (rand.nextInt(26) + 'a');
                password.append(letraMinuscula);
            } else {
                int numero = rand.nextInt(10);
                password.append(numero);
            }
        }

        contraseña = password.toString();
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }
}
