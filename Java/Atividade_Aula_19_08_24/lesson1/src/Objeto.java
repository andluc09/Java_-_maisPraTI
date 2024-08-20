package Java.Atividade_Aula_19_08_24.lesson1.src;

public class Objeto {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("macho", "Golden Retriver");

        int i = 1;

        System.out.printf("""
                           \n Cachorro %d
                           \nRaça do cachorro: %s 
                           \nSexo do cachorro: %s
                           """, i++, meuCachorro.raca, meuCachorro.sexo);

        Cachorro outroCachorro = new Cachorro("femea", "Poodle");

        System.out.printf("""
                           \n Cachorro %d
                           \nRaça do cachorro: %s 
                           \nSexo do cachorro: %s
                           """, i, outroCachorro.raca, outroCachorro.sexo);
    }
}
