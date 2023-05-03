package clasesParticular;

import java.util.Scanner;

public class Ejercicio25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Seleccione el tipo de triángulo:");
        System.out.println("1. Equilátero");
        System.out.println("2. Isósceles");
        System.out.println("3. Escaleno");
        
        
        System.out.print("Opción: ");
        int opcion = sc.nextInt();
        
       
        double base, lado1, lado2;
        switch (opcion) {
            case 1: 
                System.out.print("Ingrese la longitud del lado: ");
                lado1 = lado2 = sc.nextDouble();
                base = 0;
                break;
            case 2: 
                System.out.print("Ingrese la longitud de la base: ");
                base = sc.nextDouble();
                System.out.print("Ingrese la longitud de los lados iguales: ");
                lado1 = lado2 = sc.nextDouble();
                break;
            case 3: 
                System.out.print("Ingrese la longitud de la base: ");
                base = sc.nextDouble();
                System.out.print("Ingrese la longitud del primer lado: ");
                lado1 = sc.nextDouble();
                System.out.print("Ingrese la longitud del segundo lado: ");
                lado2 = sc.nextDouble();
                break;
            default: 
                System.out.println("La opción ingresada no es válida");
              
                return;
        }
        
    
        double perimetro;
        if (opcion == 1) { 
            perimetro = 3 * lado1;
        } else if (opcion == 2) { 
            perimetro = 2 * lado1 + base;
        } else { 
            perimetro = base + lado1 + lado2;
        }
        
        
        System.out.println("El perímetro del triángulo seleccionado es: " + perimetro);
        
        sc.close();
    }

}

