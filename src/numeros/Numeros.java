/*
Escribir un programa utilizando la estructura Switch, que reciba dos números de 
dos cifras, tome el primer número digitado y dependiendo del valor del último 
digito haga:
0: Diga cuál es mayor 5: Calcule la división
1: Diga cuál es menor 6: Diga si el primero es divisible por el segundo
2: Calcule la suma 7: Diga si el segundo es divisible por el prime
3: Calcule la resta 8: calcule la raíz cuadrada del primer número
4: Calcule la multiplicación 9: Imprima en pantalla “Que punto tan fácil
parce…”
Ejemplo si los dos números digitados son 46 y 54, el primer número es el 46 y 
el último digito es 6 el programa debe decir si el primero es divisible por el 
segundo.
 */
package numeros;

import java.util.Scanner;
public class Numeros {

 
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int a, b;
        int dig;
        
        System.out.println("Ingrese el primer número");
        a = lector.nextInt();
        System.out.println("Ingrese el segundo numero");
        b = lector.nextInt();
        
        dig = a % 10;
        switch(dig){
            case 0:
                if(a>b)
                    System.out.println("El mayor es: "+a);
                else
                    System.out.println("El mayor es: "+b);
                break;
            case 1:
                if(a<b)
                    System.out.println("El menor es: "+a);
                else
                    System.out.println("El menor es: "+b);
                break;
            case 2:
                System.out.println("La suma es:" +Math.addExact(a, b));
                break;
            case 3:
                System.out.println("La resta es: " +Math.subtractExact(a, b));
                break;
            case 4:
                System.out.println("La multiplicación es: " +Math.multiplyExact(a, b));
                break;
            case 5:
                if(b!=0)
                    System.out.println("La división es: " +Math.floorDiv(a, b));
                else 
                    System.out.println("No es posible dividir por cero");
                break;
            case 6:
                if (a%b == 0)
                    System.out.println("El primer numero es divisible por el segundo");
                else
                    System.out.println("El primer numero NO es divisible por el segundo");
                break;
            case 7:
                if (b%a == 0)
                    System.out.println("El segundo numero es divisible por el primer");
                else
                    System.out.println("El segundo numero NO es divisible por el primer");
                break;
                
            case 8:
                System.out.println("La raiz cuadrada del primero es: " +Math.sqrt(a));
                
                break;
            case 9:
                System.out.println("fdjhdfnn");
                break; 
            default:
                System.out.println("Estas en el lugar eq");
                
        }
    }
    
}
