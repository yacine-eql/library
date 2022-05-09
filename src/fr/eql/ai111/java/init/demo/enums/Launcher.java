package fr.eql.ai111.java.init.demo.enums;

public class Launcher {
    public static void main(String[] args) {

        DogBreed breed ;

        System.out.println("*** Affectation d'une variable de type enum ***");

        breed = DogBreed.SPITZ;

        System.out.println("valeure de la variable : " + breed);

        System.out.println("\r\n*** Transformer une chaîne de caractère en valeur enum ***");
        breed = DogBreed.valueOf("LEVRIER");
        System.out.println("valeure de la variable : " + breed);

        System.out.println(" : " + breed);

        System.out.println("\r\n*** Afficher toutes les valeurs d'une enum ***");

        DogBreed[] breeds = DogBreed.values();
        for (DogBreed db : breeds) {
            System.out.println(db);
        }


    }

}
