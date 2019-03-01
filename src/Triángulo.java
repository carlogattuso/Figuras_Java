public class Triángulo extends Figura {

    double base;
    double altura;

    //Constructor del triangulo con sus propios atributos
    public Triángulo (double b, double h){
        base = b;
        altura = h;
    }

    //Override del metodo area de la superclase abstracta
    @Override
    public double area() {
        double area = (base*altura)/2;
        return area;
    }

    //Getters y setters

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
