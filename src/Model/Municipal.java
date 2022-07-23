package Model;

public class Municipal extends Envio {

    public Municipal(Integer precio) {
        super(precio);
    }

    @Override
    public void imprimir() {
        System.out.println("Tiempo envio 12 horas");
    }
}
