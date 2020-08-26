package src;

import java.util.Random;

//'Filho' means children in portuguese.
//this class represents a children with a random name given by the family.
public class Filho {

    private Random random = new Random();
    private String[] sexos = new String[] {"boy", "girl"};

    private String sexo;
    private String nome;

    public Filho(String nome) {
        this.sexo = sexos[random.nextInt(2)];
        this.nome = nome;
    }

    //"sexo" means sex.
    public String getSexo() {
        return this.sexo;
    }

    //"nome" means name.
    public String getNome() {
        return this.nome;
    }
}