import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige la figura geometrica que quieres calcular el área");
        System.out.println("1: Triángulo");
        System.out.println("2: Circulo");

        System.out.print("Ingresa tu elección (1 o 2): ");
        int eleccion = scanner.nextInt();

        switch (eleccion){
            case 1:
                System.out.print("Ingresa la altura del triangulo ");
                double altura = scanner.nextDouble();

                System.out.print("Ingresa la base del triangulo ");
                double base = scanner.nextDouble();

                double areaTriangulo = calcularAreaTriangulo(base, altura);
                System.out.println("El Area del triangulo es: "+ areaTriangulo);
                break;

            case 2:
                System.out.print("Ingresa el radio del circulo: ");
                double radio = scanner.nextDouble();

                double areaCirculo =  calcularAreaCirculo(radio);
                System.out.println("El area del circulo es: "+ areaCirculo);
                break;

        }

    }

    public static  double calcularAreaTriangulo(double base, double altura){
        return (base * altura)/2;
    }

    public static  double calcularAreaCirculo(double radio){
        return Math.PI * radio * radio;
    }

}