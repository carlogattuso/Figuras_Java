import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class GestorFigurasTestScenario1 {

    private Figura [] figuras = null;

    @Before
    public void initialize () {
        this.figuras = new Figura[5];
    }

    @After
    public void tearDown () {
        this.figuras = null;
    }

    @Test
    public void addSquareTest (){
        Cuadrado cuadrado = new Cuadrado(2);
        figuras[0]=cuadrado;
        Assert.assertNotNull(figuras[0]);
        assertTrue(figuras[0] instanceof Cuadrado);
        Assert.assertEquals(2,cuadrado.getLado1(),0.0);
        Assert.assertEquals(cuadrado.getLado2(),cuadrado.getLado1(),0.0);
    }

    @Test
    public void addRectangleTest () {
        Rectángulo rectangulo = new Rectángulo(1,5);
        figuras[0]=rectangulo;
        Assert.assertNotNull(figuras[1]);
        assertTrue(figuras[0] instanceof Rectángulo);
        Assert.assertEquals(1,rectangulo.getLado1(),0.0);
        Assert.assertEquals(5,rectangulo.getLado2(),0.0);
    }

    @Test
    public void addCircleTest () {
        Círculo circulo = new Círculo(3);
        figuras[0]=circulo;
        Assert.assertNotNull(figuras[2]);
        assertTrue(figuras[0] instanceof Círculo);
        Assert.assertEquals(3,circulo.getRadio(),0.0);
    }

    @Test
    public void addTriangleTest () {
        Triángulo triangulo = new Triángulo(2,4);
        figuras[0]=triangulo;
        Assert.assertNotNull(figuras[3]);
        assertTrue(figuras[0] instanceof Triángulo);
        Assert.assertEquals(2,triangulo.getBase(),0.0);
        Assert.assertEquals(4,triangulo.getAltura(),0.0);
    }

    @Test
    public void addDiamondTest () {
        Rombo rombo = new Rombo(1,2,1);
        figuras[0]=rombo;
        Assert.assertNotNull(figuras[4]);
        assertTrue(figuras[0] instanceof Rombo);
        Assert.assertEquals(1,rombo.getLado(),0.0);
        Assert.assertEquals(2,rombo.getDiagonalGrande(),0.0);
        Assert.assertEquals(1,rombo.getDiagonalPequeña(),0.0);
    }
}
