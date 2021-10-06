package TD5.model;


import jdk.internal.org.objectweb.asm.tree.analysis.Analyzer;

import java.util.ArrayList;

public class Model extends AbstractModel {
    Case[][] map;
    ArrayList<Animal> trou = new ArrayList<>();

    public Model() {
        this.map = new Case[8][10];
    }

    public void ajouterDansTrou(Animal animal){
        trou.add(animal);
    }


    @Override
    public void faireSeDeplacerLesAnimaux() {

    }

    @Override
    public TypeCase getTypeCase(int x, int y) {
        return this.map[x][y].getTypeCase();
    }

    @Override
    public void setTypeCase(int x, int y, TypeCase tc) {
        this.map[x][5].setTypeCase(tc);
    }

    @Override
    public Animal getAnimalPlusFort(int x, int y) {
        return null;
    }

    @Override
    public int getLargeur() {
        return this.map[0].length;
    }

    @Override
    public int getHauteur() {
        return this.map.length;
    }

    @Override
    public int getNbSourisIn() {
        return trou.size();
    }

    @Override
    public int getNbSourisOut() {
        int count = 0;
        for (int i = 0; i < this.map.length; i++) {
            for (int j = 0; j < this.map[i].length; j++) {
                if (this.map[i][j].getAnimal() instanceof Souris) {
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public int getNbFlecheUtilisee() {

        return 0;
    }

    @Override
    public int getNbFlecheMax() {
        return 0;
    }

    @Override
    public boolean partieTerminer() {
        return false;
    }
}
