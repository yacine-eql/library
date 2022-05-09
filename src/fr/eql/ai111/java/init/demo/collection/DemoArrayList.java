package fr.eql.ai111.java.init.demo.collection;

import fr.eql.ai111.java.init.demo.oop.Toy;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {

    public static void main(String[] args) {

        /*
        Une liste contient une collection d'elements ordonnés, et permettant l'ajout de doublon
         */

        //initialistion d'une liste

        List<Toy> toys = new ArrayList<>();

        //Ajouter des elements /instances
        Toy toy1 = new Toy("Balle");
        Toy toy2 = new Toy("Souris en plastique");
        toys.add(toy1);
        toys.add(toy2);

        // il est possible d'insérer un element a un index precis

        Toy toy3 = new Toy("Branche");
        toys.add(1,toy3);

        // une liste permet de rajouter un doublon (une instance deja presente dans la liste)

        toys.add(toy3);

        System.out.println("*** obtenir la taille de la liste ***");

        System.out.println("la liste contient : " + toys.size() + " jouets");

        System.out.println("*** liste des noms des jouets ***");

        // fore each ecrire toys.iter
        for (Toy t : toys) {
            System.out.println(t.getToyName());
        }

        System.out.println("\r\n*** recuperer un element a partir de son index ***");
        Toy thirdToy = toys.get(2);
        System.out.println("3eme jouet de la liste index2  " + thirdToy.getToyName());


        System.out.println("\r\n*** recuperer un index a partir de la reférence de l'instance ***");
        int toy2Index = toys.indexOf(toy2);
        System.out.println("index de la souris en plastique : " + toy2Index);

        System.out.println("\r\n*** Suppression d'elements dans la liste par référence ou par index ***");

        toys.remove(toy1);
        toys.remove(0);
        System.out.println("la liste ne contient plus que " + toys.size() + " elements");

        for (Toy t : toys) {
            System.out.println(t.getToyName());
        }

        System.out.println("\r\n *** vider la liste ***");

        toys.removeAll(toys);

        //toys = new ArrayList<>(); //same
        if (toys.isEmpty()) {
            System.out.println("la liste de jouets est vide");
        }



    }
}
