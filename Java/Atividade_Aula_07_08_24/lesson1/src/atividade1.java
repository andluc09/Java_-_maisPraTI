package Java.Atividade_Aula_07_08_24.lesson1.src;
import Java.Atividade_Aula_07_08_24.lesson1.src.util.Utilitarios;

public class atividade1 {
    public static void main(String[] args) {
        // Todo método Java vai ter:
        /*
         * [modificador (public, private)] tipoRetorno (void = não retorna nada) nomeDoMétodo ([paramêtros]){
         *   bloco de código!
         * }
         */

        // Método de Instância de Classe (Contexto o TODO)
        Geometria geometria = new Geometria();

        double areaRetangulo = geometria.calcularAreaRetangulo(3, 9);

        System.out.println("Área do retângulo: " + areaRetangulo);

        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.depositar(1000);
        System.out.println("\n Saldo disponível: R$" + contaBancaria.consultaSaldo()); // Método de Instância da Classe proveniente

        // Método Estático de Classe (Unidade o SINGULAR)
        System.out.println("\nResultado do produto: " + Geometria.multiplicar(5, 7)); // Método de Classe

        Utilitarios.print("\nOlá Mundo!");
    }
}
