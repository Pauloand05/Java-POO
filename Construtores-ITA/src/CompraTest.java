import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CompraTest {

    @Test
    public void compraAVista(){
        Compra c = new Compra(500);
        Assertions.assertEquals(1, c.getNumeroParcelas());
        Assertions.assertEquals(500, c.getValorTotal());
        Assertions.assertEquals(500, c.getValorParcela());
    }

    @Test
    public void compraParcelado(){
        Compra c = new Compra(4,250);
        Assertions.assertEquals(4, c.getNumeroParcelas());
        Assertions.assertEquals(1000, c.getValorTotal());
        Assertions.assertEquals(250, c.getValorParcela());
    }
}