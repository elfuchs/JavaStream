package streams1;

import java.util.ArrayList;
import java.util.List;


public class TestBoucle {

  public static void main(String[] args) {
	  
    List<Personne> personnes = new ArrayList<>(6);
    personnes.add(new Personne("p1", Genre.HOMME, 176));
    personnes.add(new Personne("p2", Genre.HOMME, 190));
    personnes.add(new Personne("p3", Genre.FEMME, 172));
    personnes.add(new Personne("p4", Genre.FEMME, 162));
    personnes.add(new Personne("p5", Genre.HOMME, 176));
    personnes.add(new Personne("p6", Genre.FEMME, 168));

    long total = 0;
    int nbPers = 0;
    for (Personne personne : personnes) {
      if (personne.getGenre() == Genre.FEMME) {
        nbPers++;
        total += personne.getTaille();
      }
    }
    double resultat = (double) total / nbPers;
    System.out.println("Taille moyenne des femmes = " + resultat);
  }
}