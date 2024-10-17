package Java.Lista_Orientacao_Objetos.Polimorfismo;

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo: Au au!");
    }
}