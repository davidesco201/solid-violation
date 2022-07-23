package View;

import Model.Envio;
import Model.Intermunicipal;
import Model.Internacional;
import Model.Municipal;

public class Principal {
    public static void main(String[] args) {
        Envio[] envios = {
                new Municipal(5000),
                new Intermunicipal(15000),
                new Internacional(25000)
        };
        imprimirTiempoDeEnvios(envios);
    }
    public static void imprimirTiempoDeEnvios(Envio[] envios){
        for (Envio envio: envios) {
            envio.imprimir();
        }
    }
}
