public class Regresion {
    private int arrayX[], arrayY[];
    private double x, y, xy, xx, a, b;
    private int tamanio;

    public Regresion() {
        arrayX = new int[] { 651, 762, 856, 1063, 1190, 1298, 1421, 1440, 1518 };
        arrayY = new int[] { 23, 26, 30, 34, 43, 48, 52, 57, 58 };
        x = 0;
        y = 0;
        xx = 0;
        xy = 0;
        a = 0;
        b = 0;
        tamanio = arrayY.length;
    }

    public void entrenar() {
        for (int i = 0; i < tamanio; i++) {
            System.out.println("Dado " + arrayX[i] + " => " + arrayY[i]);
            x += arrayX[i];
            y += arrayY[i];
            xy += arrayX[i] * arrayY[i];
            xx += arrayX[i] * arrayX[i];
        }

        b = (tamanio * xy - x * y) / (tamanio * xx - x * x);
        a = (y - (b * x)) / tamanio;
    }

    public void predecir(int prediccion) {
        double resultado = a + (b * prediccion);
        System.out.println(resultado + " = " + a + " + " + b + "(" + prediccion + ")");
    }
}