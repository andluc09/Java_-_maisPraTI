package Java.Atividade_Aula_03_08_24.lesson1.src;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {
    public DataHora() {
    }

    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatadoDataHora = currentDateTime.format(formatter);
        System.out.println("\nData e horário atual: " + formatadoDataHora);
    }
}
