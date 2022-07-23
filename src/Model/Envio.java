package Model;

public abstract class Envio implements ITiempoDeEnvio {
    private Integer precio;

    Envio(Integer precio) {
        this.precio = precio;

    }
}
