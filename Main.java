import Clases.Monedas.*;    //Importacion de todas las clases de Moneda (100,500,1000,1500)
import Clases.*;            //Importacion de todas las clases del paquete Clases (Expendedor,Deposito,Comprador,Producto)

public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(7);
        Moneda m = null;
        Comprador c = null;
        m = new Moneda100();
        c = new Comprador(m,Expendedor.CONSTANTES.SPRITE.getValor(),exp);
        System.out.println(c.queConsumiste()+" $"+c.cuantoVuelto());
    }
}
