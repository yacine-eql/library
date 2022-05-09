package fr.eql.ai111.java.init.demo.wrapper;

public class DemoWrapper {
    public static void main(String[] args) {
        /*
        les wrapper ou classes enveloppes permettent d'encapsuler des types primitifs .
        chaque type primitif possede sa classe enveloppe qui lui permet de se comprter comme un objet :
        -Byte
        -Short
        -Integer
        -Long
        -Float
        -Double
        -Boolean
        -Character
          */

        //Les wrappers sont donc nullable et instanciables

        //int myInt = null;
        Integer myInteger = null;
        myInteger = new Integer(42);

        // on peut affecter un primitif à un wrapper.
        //une conversion automatique vers son wrapper, appelée "autoboxing", aura lieu.

        Float myFloat = 3.45f;

        /*
        Chaque wrapper (sauf Charactere) posséde une méthode statique parseXXX(String str)
        qui permet de renvoyer un tupe premitif a partir d'une chaine de caracteres
         */

        double myDouble = Double.parseDouble("42.222222");
        /*
        chaque wrapper (sauf charactere) possede une methode statique
        valueOf(String str) qui permet de renvoyer un type objet a partir d'une chaîne de caractere
         */
        boolean myboolean = Boolean.valueOf("true");
        System.out.println("valeur du booléen :" + myboolean);

    }
}
