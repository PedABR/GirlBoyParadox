package src;

//the "actual program"
public class Main {

    public static void main(String[] args) {

        int count1 = 0;
        int count2 = 0;
        double pop_a = 0.0;
        double pop_girls = 0.0;

        Familia[] populacao = new Familia[10000];

        //creating a population of 10000 families, you can change the number in line 13/16 if you want.
        for (int i = 0; i<10000; i++) {
            populacao[i] = new Familia();
        }

        //counting the numbers of families that: have a girl in it(pop_girls), have a 2 girls(count1), have a girl named "a"(pop_a) and the ones that have 2 girls, one of witch named "a".
        for (Familia familia:populacao) {
            if (!familia.getFilho(0).getSexo().equals("boy") || !familia.getFilho(1).getSexo().equals("boy")) {
                pop_girls++;
            }
            if (familia.getFilho(0).getSexo().equals("girl") && familia.getFilho(1).getSexo().equals("girl")) {
                count1++;
            }if (familia.getFilho(0).getSexo().equals("girl") && familia.getFilho(0).getNome().equals("a")) {
                pop_a++;
                if (familia.getFilho(1).getSexo().equals("boy")) {
                    count2++;
                }
            } else if (familia.getFilho(1).getSexo().equals("girl") && familia.getFilho(1).getNome().equals("a")) {
                pop_a++;
                if (familia.getFilho(0).getSexo().equals("boy")) {
                    count2++;
                }
            }
        }

        //returning the number of girl/girl families over the families that have a girl and the number of girl/girl families over the families that have a girl names "a".
        System.out.print("sem nome:" + count1/pop_girls + ", com nome:" + count2/pop_a);
    }
}