package src;

import java.util.Random;

//"Familia" means family in portuguese.
//this class represents a family with 2 kids.
//i made this in a way that no family can have both children with the same name, but that doesn't affect the end result that much.
public class Familia {

    private Random rand = new Random();

    private Filho[] filhos;
    //possible names for the children... yes, i'm not that creative.
    private String[] nomes = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

    public Familia() {
        filhos = new Filho[2];
        filhos[0] = new Filho(nomes[rand.nextInt(10)]);
        tiraNome(filhos[0].getNome());
        Filho filho = new Filho(nomes[rand.nextInt(9)]);
        filhos[1] = filho;
    }

    private void tiraNome(String nome) {
        int i = 0;
        String[] nomes1 = new String[9];
        for (String nome1:this.nomes) {
            if (!nome1.equals(nome)) {
                nomes[i] = nome1;
                i++;
            }
        }
        this.nomes = nomes1;
    }

    public Filho getFilho(int i) {
        return filhos[i];
    }
}