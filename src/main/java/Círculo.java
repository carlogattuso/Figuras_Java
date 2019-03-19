public class Círculo extends Figura {

    double radio;

    //Constructor del círculo con sus propios atributos
    public Círculo (double r){
        radio = r;
    }

    //Override del metodo area de la superclase abstracta
    @Override
    public double area() {
        double area = Math.PI*radio*radio;
        return area;
    }

    //Getters y setters

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
