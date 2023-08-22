package customexeptions;
import customexceptions.customexception;

public class ejercicio2 {

	public static void main(String[] args) {
        try {
            throwCustomException();
        } catch (customexception e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }

    public static void throwCustomException() throws customexception {
        System.out.println("Mensaje lanzado por pantalla");
        throw new customexception("Excepcion capturada con mensaje: Esto es un objeto Exception");
    }
}
