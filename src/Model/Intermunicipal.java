package Model;

public class Intermunicipal extends Envio {

    public Intermunicipal(Integer precio) {
        super(precio);
    }

    @Override
    public void imprimir() {
        System.out.println("Tiempo envio 36 horas");
    }
}
