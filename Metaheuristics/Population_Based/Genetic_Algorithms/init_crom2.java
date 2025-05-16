package Metaheuristics.Population_Based.Genetic_Algorithms;

public class init_crom2 {
    
}

//inicializar todos os individuos da populacao

public void inicializarPopulacao(int tamPopulacao) {
    int i;
    this.populacao = new Vector();
    for (i=0; i < tamPopulacao; i++) {
        this.populacao.add(new ElementoGA1 ());
    }
}
