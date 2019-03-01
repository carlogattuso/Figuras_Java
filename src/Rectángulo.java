public class Rectángulo extends Figura{

    double lado1;
    double lado2;

    //Constructor del rectangulo con sus propios atributos
    public Rectángulo (double l1, double l2){
        lado1 = l1;
        lado2 = l2;
    }

    @Override
    public int compareTo(Figura comparada) {
        return super.compareTo(comparada);
    }

    //Override del metodo area de la superclase abstracta
    @Override
    public double area() {
        double area = lado1*lado2;
        return area;
    }

    //Getters y setters

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
}
