import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Regresion regresion = new Regresion();
        regresion.entrenar();
        while (true) {
            System.out.println("Ingresa dato a predecir: ");
            Scanner leer = new Scanner(System.in);
            int prediccion = leer.nextInt();
            regresion.predecir(prediccion);
        }
    }
}