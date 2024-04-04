package Back;

import java.time.LocalDate;
import java.util.ArrayList;

public class Playlist {
    protected String key, nombre;
    protected int cantidadCanciones;
    protected LocalDate fecha;
    protected ArrayList<Cancion> canciones = new ArrayList<>();

    public Playlist(String key, String nombre, LocalDate fecha, int cantidadCanciones) {
        this.cantidadCanciones = cantidadCanciones;
        this.key = key;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public void agregarCancion (Cancion cancion){
        canciones.add(cancion);
    }

    public void recorrerCanciones(){

    }

    public String getKey() {
        return key;
    }
}
