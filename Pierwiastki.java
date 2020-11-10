/*Proszę napisać program w języku Java, który przyjmuje jako parametr wywołania 3 liczby rzeczywiste będąco odpowiednio współczynnikami równania kwadratowego (y = ax^2+ bx + c).
Program wyznacza pierwiastki jeżeli istnieją i przekazuje przez standardowe wyjście do konsoli w postaci tekstowej.
Ponadto w kodzie programu powinna znaleść się informacja o autorze.

Autor: Kacper Bukowski*/

import java.util.Scanner;
import java.lang.Math;

public class Pierwiastki{
    public static void main(String[] args){
        Scanner wej = new Scanner(System.in);
        System.out.println("Podaj parametr a");
        double a = wej.nextDouble();
        System.out.println("Podaj parametr b");
        double b = wej.nextDouble();
        System.out.println("Podaj parametr c");
        double c = wej.nextDouble();
        double delta = Math.pow(b,2) - 4 * a * c;
        if (delta < 0){
            System.out.println("Nie ma rozwiazan w dziedzinie liczb rzeczywistych!");
        }
        else if (delta == 0)
        {
            double x0 = (-b)/2*a;
            System.out.println("Pierwiastek x wynosi:" +  x0);
        }
        else{
        double x1 = (-b-Math.sqrt(delta))/2*a;
        double x2 = (-b+Math.sqrt(delta))/2*a;
        System.out.println("Pierwiastek x1 wynosi: " + x1);
        System.out.println("Pierwiastek x2 wynosi: " + x2);
        wej.close();
        }
    }
}