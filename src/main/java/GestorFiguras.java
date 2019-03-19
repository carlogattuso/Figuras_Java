import java.util.Arrays;

public interface GestorFiguras {

    /*Cada figura tiene el mismo tipo de area, es decir, un numero, por lo tanto, todas las sumas se harán de la misma
    //forma. Es por eso que se puede implementar el metodo en la interfaz. Si cada uno tuviera una suma distinta las
    implementaciones se deberían realizar en las clases hijas*/

    public static double suma(Figura [] figuras){
        double suma = 0;
        for(Figura figura : figuras){
            suma = suma + figura.area();
        }
        return suma;
    }

    //Implementacion del metodo sort en la interfaz ya que comparan características que comparten todas las figuras
    public static void sort(Figura [] figuras){
        Arrays.sort(figuras);
    }
}
