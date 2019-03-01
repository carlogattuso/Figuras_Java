public class Cuadrado extends Rectángulo {

    public Cuadrado (double lado){
        super(lado,lado);
    }

    //Getters y setters sobreescritos de la clase rectángulo porque son exactamente iguales
    @Override
    public double getLado1() {
        return super.getLado1();
    }

    @Override
    public void setLado1(double lado1) {
        super.setLado1(lado1);
    }

    @Override
    public double getLado2() {
        return super.getLado2();
    }

    @Override
    public void setLado2(double lado2) {
        super.setLado2(lado2);
    }
}
