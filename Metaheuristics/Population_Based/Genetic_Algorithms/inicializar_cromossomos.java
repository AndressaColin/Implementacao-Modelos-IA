/** 
funcao para inicializar o cromossomos, inicializa apenas um unico elemento da populacao
**/

private void inicializarCromossomos(int tamanho) {
    int i;
    this.valor = "";
    for (i=0; i < tamanho; i++) {
        if (java.lang.Math.random() < 0.5) {
            this.valor = this.valor + "0";  {
        } else {
            this.valor = this.valor + "1";
        }
    }
}

