package utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class GetValues {
    private final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    public int getInt(String texto) throws IOException {
        int salidaInt = 0;
        boolean valido;

        do {
            valido = true;

            try {
                System.out.print(texto);
                salidaInt = Integer.parseInt(bf.readLine());

            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida, porfavor de insertar un numero");
                valido = false;
            }

        } while (!valido);

        return salidaInt;
    }

    public double getDouble(String texto) throws IOException {
        double salidaDouble = 0;
        boolean valido;

        do {
            valido = true;

            try {
                System.out.print(texto);
                salidaDouble = Double.parseDouble(bf.readLine());

            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida, porfavor de insertar un numero de telefono valido");
                valido = false;
            }

        } while (!valido);

        return salidaDouble;
    }

    public float getFloat(String texto) throws IOException {
        float salidaFloat = 0;
        boolean valido;

        do {
            valido = true;

            try {
                System.out.print(texto);
                salidaFloat = Float.parseFloat(bf.readLine());

            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida, porfavor de insertar un numero de telefono valido");
                valido = false;
            }

        } while (!valido);

        return salidaFloat;
    }
    
    public String getString(String texto) throws IOException {
        String salidaString = null;
        boolean valido;

        do {
            valido = true;

            try {
                System.out.print(texto);
                salidaString = bf.readLine();

            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida, porfavor de insertar una cadena de texto");
                valido = false;
            }

        } while (!valido);

        return salidaString;
    }
    
    public char getCharAt0(String texto) throws IOException {
        char salidaChar = ' ';
        boolean valido;

        do {
            valido = true;

            try {
                System.out.print(texto);
                salidaChar = bf.readLine().charAt(0);

            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida, porfavor de insertar una cadena de texto");
                valido = false;
            }

        } while (!valido);

        return salidaChar;
    }

    public LocalDate getDate(String texto) throws IOException {
        boolean valido;
        String fechaInput;
        LocalDate fecha = null;
        GetValues get = new GetValues();

        do {
            valido = true;
            fechaInput = get.getString(texto);

            DateTimeFormatter fechaFormato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            try {
                fecha = LocalDate.parse(fechaInput, fechaFormato);
            } catch (Exception e) {
                System.out.println("La fecha no está en el formato correcto (dd/MM/yyyy).");
                valido = false;
            }
        } while (!valido);
        return fecha;
    }
}
