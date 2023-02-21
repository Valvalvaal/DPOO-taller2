package restaurante.procesamiento;

import java.io.IOException;

import restaurante.modelo.Restaurante;

public class LoaderRestaurante {

    public static Restaurante cargarArchivo(String nombreArchivo) throws IOException {

        return new Restaurante(null, null, null, null, null);
    }
}
