public class Rombo extends Figura {

    double lado;
    double DiagonalGrande;
    double DiagonalPequeña;

    //Constructor del rectangulo con sus propios atributos
    public Rombo(double l, double D, double d) {
        lado = l;
        DiagonalGrande = D;
        DiagonalPequeña = d;
    }

    //Override del metodo area de la superclase abstracta
    @Override
    public double area() {
        double area = (DiagonalGrande * DiagonalPequeña) / 2;
        return area;
    }

    //Getters y setters

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getDiagonalGrande() {
        return DiagonalGrande;
    }

    public void setDiagonalGrande(double diagonalGrande) {
        DiagonalGrande = diagonalGrande;
    }

    public double getDiagonalPequeña() {
        return DiagonalPequeña;
    }

    public void setDiagonalPequeña(double diagonalPequeña) {
        DiagonalPequeña = diagonalPequeña;
    }
}
