public abstract class Figura implements Comparable <Figura>{

    //Método abstracto que cada Figura implementará de forma distinta
    public abstract double area();

    /*Comparo las areas dentro de figura para que cuando ejecute el sort y vaya a buscar el valor comparado
    se encuentre que en figura se comparan las areas*/

    @Override//Sobreescrito ya que para cada clase podemos querer comparar cosas diferentes
    public int compareTo(Figura comparada) {
        return (int) (comparada.area() - this.area());
    }
    //La ordenación sera descendente
}
