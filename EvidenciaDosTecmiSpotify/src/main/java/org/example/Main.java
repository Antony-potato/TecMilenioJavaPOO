package org.example;

import Back.Playlist;
import utilities.GetValues;

import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;

public class Main {
    private static GetValues get = new GetValues();

    public static void main(String[] args) throws IOException {
        HashMap<String, Playlist> playlistsMap = new HashMap<>();

        LocalDate fecha = LocalDate.of(2024, 4,2);

        Playlist MusicaEstudiar = new Playlist("MPE", "Musica Para Estudiar", fecha, 5);
        playlistsMap.put(MusicaEstudiar.getKey(), MusicaEstudiar);
        Playlist MusicaCorrer = new Playlist("MPC", "Musica Para Correr", fecha, 5);
        playlistsMap.put(MusicaCorrer.getKey(), MusicaCorrer);

        boolean salir = false;
        System.out.println("--------- TecmiSpotify ---------");
        System.out.println("A. Agregar una playlist." +
                "B. Reproducir música." +
                "C. Salir de la aplicación.");
        char opt = Character.toUpperCase(get.getCharAt0("Escribe la opción a elegir: "));
        do {
            System.out.println("------------- Menu -------------");

            switch (opt){
                case 'A':
                    break;
                case 'B':
                    break;
                case 'C':
                    salir = true;
                    break;
            }

        }while(!salir);






    }
}