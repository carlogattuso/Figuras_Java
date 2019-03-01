public class App {

    //Declaramos el método main
    public static void main(String[] args) {

        //Creamos un array de figuras
        Figura[] figuras = new Figura[8];

        //Creamos unas cuantas figuras para rellenar nuestro vector
        Cuadrado cuadrado = new Cuadrado(2);
        Rectángulo rectangulo = new Rectángulo(1,5);
        Círculo circulo = new Círculo(3);
        Triángulo triangulo = new Triángulo(2,4);
        Triángulo triangulo2 = new Triángulo(1,4);
        Rombo rombo = new Rombo(1,2,1);

        ///Ahora añadimos unas cuantas en un orden aleatorio para ordenarlas despues

        figuras[0] = rectangulo;
        figuras[1] = cuadrado;
        figuras[2] = triangulo;
        figuras[3] = rombo;
        figuras[4] = circulo;
        figuras[5] = rectangulo;
        figuras[6] = cuadrado;
        figuras[7] = triangulo2;

        //Sumamos las areas de todas las figuras
        double suma = GestorFiguras.suma(figuras);
        System.out.println(suma);

        //Ordenamos las figuras en funcion del área de cada uno
        GestorFiguras.sort(figuras);
        for (Figura figura: figuras) {
            System.out.println("Nombre: " + figuras.getClass().getName());
            System.out.println("Área: " + figura.area());
        }
    }
}
