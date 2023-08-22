package ta27;
import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Java");

        try {
            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.println("Seleccione una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz cuadrada (Número 1)");
            System.out.println("7. Raíz cúbica (Número 1)");
            int opcion = scanner.nextInt();

            double resultado = 0;

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    resultado = num1 * num2;
                    break;
                case 4:
                    if (num2 == 0) {
                        throw new ArithmeticException("División por cero no permitida.");
                    }
                    resultado = num1 / num2;
                    break;
                case 5:
                    resultado = Math.pow(num1, num2);
                    break;
                case 6:
                    if (num1 < 0) {
                        throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo.");
                    }
                    resultado = Math.sqrt(num1);
                    break;
                case 7:
                    resultado = Math.cbrt(num1);
                    break;
                default:
                    throw new IllegalArgumentException("Opción no válida.");
            }

            System.out.println("Resultado: " + resultado);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
