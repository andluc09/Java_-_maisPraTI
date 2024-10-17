package Java.Lista_Orientacao_Objetos.Polimorfismo;

public class MainPolimorfismoInterface {
    public static void main(String[] args) {
        // Criando um array de IMeioTransporte
        IMeioTransporte[] meiosDeTransporte = {
                new Carro(),
                new Bicicleta(),
                new Trem()
        };

        // Percorrendo o array e chamando acelerar() e frear() para cada objeto
        for (IMeioTransporte transporte : meiosDeTransporte) {
            transporte.acelerar();
            transporte.frear();
            System.out.println(); // Pula uma linha
        }
    }
}

