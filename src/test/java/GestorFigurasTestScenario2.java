import javafx.scene.shape.TriangleMesh;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class GestorFigurasTestScenario2 {

    private Figura [] figuras = null;

    @Before
    public void Initialize () {
        this.figuras = new Figura[5];
        figuras[0] = new Cuadrado(2);
        figuras[1] = new Rectángulo(1,5);
        figuras[2] = new Círculo(3);
        figuras[3] = new Triángulo(2,4);
        figuras[4] = new Rombo(1,2,1);
    }

    @After
    public void tearDown () {
        this.figuras = null;
    }

    @Test
    public void squareAreaTest () {
         double expected = 4;
         double area = figuras[0].area();
         Assert.assertEquals(expected,area,0.0);
    }

    @Test
    public void rectangleAreaTest () {
        double expected = 5;
        double area = figuras[1].area();
        Assert.assertEquals(expected,area,0.0);
    }

    @Test
    public void circleAreaTest () {
        double expected = Math.PI*9;
        double area = figuras[2].area();
        Assert.assertEquals(expected,area,0.0);
    }
    @Test
    public void trianguleAreaTest () {
        double expected = 4;
        double area = figuras[3].area();
        Assert.assertEquals(expected,area,0.0);
    }

    @Test
    public void diamondAreaTest () {
        double expected = 1;
        double area = figuras[4].area();
        Assert.assertEquals(expected,area,0.0);
    }
    
    @Test
    public void areaSumTest () {
        double expected = 4 + 5 + Math.PI*9 + 4 + 1;
        double sum = GestorFiguras.suma(figuras);
        Assert.assertEquals(expected,sum,0.0);
    }
    @Test
    public void sortTest () {
        GestorFiguras.sort(figuras);
        Assert.assertTrue(figuras[0] instanceof Círculo);
        Assert.assertTrue(figuras[1] instanceof Rectángulo);
        Assert.assertTrue(figuras[2] instanceof Cuadrado);
        Assert.assertTrue(figuras[3] instanceof Triángulo);
        Assert.assertTrue(figuras[4] instanceof Rombo);
    }
}
