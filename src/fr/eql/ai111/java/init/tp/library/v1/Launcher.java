package fr.eql.ai111.java.init.tp.library.v1;


import fr.eql.ai111.java.init.demo.oop.Toy;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Launcher {
    public static void main(String[] args) {

        Category category;

        String name = JOptionPane.showInputDialog("Veuillez entrer votre nom");
        String surname = JOptionPane.showInputDialog("Veuillez entrer votre prenom");
        String adress = JOptionPane.showInputDialog("Veuillez entrer votre votre adresse");


        JOptionPane.showMessageDialog(null, "Menu Principal\r\n" + "que voulez vous faire ? :\r\n" +
                "1 pour : Afficher vos informations\r\n" + "2 pour : Enregistrer vos livres\r\n" +
                "3 pour : Quitter l'application");
        int choise = Integer.parseInt(JOptionPane.showInputDialog("Veuillez entrer votre choix 1, 2 ou 3"));
        do {

            List<Book> books = new ArrayList<>();

            if (choise == 1) {
                do {

                    JOptionPane.showMessageDialog(null, "Fiche d'Identité Utilisateur\r\n" +
                            "Nom : " + name + "\r\nPrenom :" + surname + "\r\nAdresse : " + adress);
                    JOptionPane.showMessageDialog(null, "Menu Principal\r\n" + "que voulez vous faire ? :\r\n" +
                            "1 pour : Afficher vos informations\r\n" + "2 pour : Enregistrer vos livres\r\n" +
                            "3 pour : Quitter l'application");
                    choise = Integer.parseInt(JOptionPane.showInputDialog("Veuillez entrer votre choix 1, 2 ou 3"));
                } while (choise == 1);

            } else if (choise == 2) {
                do {



                    int numberBooks = Integer.parseInt(JOptionPane.showInputDialog("Combien de livres  voulez vous ?"));
                    for (int i =0; i < numberBooks; i++) {
                        String title = JOptionPane.showInputDialog("Veuillez entrer le titre du livre : ");
                        String author = JOptionPane.showInputDialog("Veuillez entrer l'auteur du livre : ");
                        int isbn = Integer.parseInt(JOptionPane.showInputDialog("Veuillez entrer l' isbn du livre :"));
                        //String category1 = JOptionPane.showInputDialog("Enfin Veuillez entrer la catégorie du livre :");
                        Book book = new Book(title, author, isbn);
                        books.add(book);

                        }
                    for (Book t : books) {
                        JOptionPane.showMessageDialog(null, "Titre : " + t.getTitle() +"\r\n" +
                                "Auteur : " + t.getAuthor() +"\r\n" +
                                "Num isbn : " + t.getIsbn() +"\r\n");
                    }


                    JOptionPane.showMessageDialog(null, "Menu Principal\r\n" +
                            "que voulez vous faire ? :\r\n" +
                            "1 pour : Afficher vos informations\r\n" + "2 pour : Enregistrer vos livres\r\n" +
                            "3 pour : Quitter l'application\r\n" + "4 pour : Afficher tous les livres");

                    choise = Integer.parseInt(JOptionPane.showInputDialog("Veuillez entrer votre choix 1, 2, 3 ou 4"));

                } while (choise == 2);

            } else if (choise == 3) {

                System.exit(0);

            } else /*for (Book t : books) {
                    System.out.println(t.getTitle() + t.getAuthor() + t.getIsbn() );
                }

                /*for (Book t : books) {
                    JOptionPane.showMessageDialog(null, "Titre : " + t.getTitle() +"\r\n" +
                            "Auteur : " + t.getAuthor() +"\r\n" +
                            "Num isbn : " + t.getIsbn() +"\r\n");
                }
               */ if (choise == 4) System.out.println("bye");

        }while ((choise == 1) || (choise == 2));
    }


        }



