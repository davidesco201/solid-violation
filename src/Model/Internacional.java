package Model;

public class Internacional extends Envio {

    public Internacional(Integer precio) {
        super(precio);
    }

    @Override
    public void imprimir() {
        System.out.println("Tiempo envio 90 horas");
    }
}
