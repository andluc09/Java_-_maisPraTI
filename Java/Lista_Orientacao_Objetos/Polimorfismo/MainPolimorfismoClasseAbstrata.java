package Java.Lista_Orientacao_Objetos.Polimorfismo;

import java.util.ArrayList;

public class MainPolimorfismoClasseAbstrata {
    public static void main(String[] args) {
        // Criando uma lista de Animal
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Vaca());

        // Iterando sobre a lista e chamando emitirSom() para cada animal
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}

