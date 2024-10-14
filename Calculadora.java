import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Elija una operación:");
            System.out.println("1: Suma");
            System.out.println("2: Resta");
            System.out.println("3: Multiplicación");
            System.out.println("4: División");
            System.out.println("5: Salir");
            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 5){
                System.out.println("Cerrar programa..");
                break;
            }



            if (opcion == 1){
                System.out.println("Ingrese el primer numero: ");
                double num1 = scanner.nextDouble();
                System.out.println("Ingrese el segundo numero: ");
                double num2 = scanner.nextDouble();
                double resultado;
                resultado = num1 + num2;
                System.out.println("El resultado es: "+resultado);
            }else if (opcion == 2){
                System.out.println("Ingrese el primer numero: ");
                double num1 = scanner.nextDouble();
                System.out.println("Ingrese el segundo numero: ");
                double num2 = scanner.nextDouble();
                double resultado;
                resultado = num1 - num2;
                System.out.println("El resultado es: "+resultado);
            }else if (opcion == 3){
                System.out.println("Ingrese el primer numero: ");
                double num1 = scanner.nextDouble();
                System.out.println("Ingrese el segundo numero: ");
                double num2 = scanner.nextDouble();
                double resultado;
                resultado = num1 * num2;
                System.out.println("El resultado es: "+resultado);
            }else if (opcion == 4){
                System.out.println("Ingrese el primer numero: ");
                double num1 = scanner.nextDouble();
                System.out.println("Ingrese el segundo numero: ");
                double num2 = scanner.nextDouble();
                double resultado;
                resultado = num1 / num2;
                System.out.println("El resultado es: "+resultado);
            }else{
                System.out.println("Opcion no valida, vuelva a intentarlo!");
            }
        }
        scanner.close();
    }
}