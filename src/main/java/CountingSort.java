public class CountingSort {
   
    /**
    * Implemente a versão clássica do counting sort que vimos em sala de aula. Você pode
    * criar métodos auxiliares se precisar.
    */
    public int[] classicCountingSort(int[] a, int k) {

        //Array auxiliar com tamanho do maior elemento
        int[] c = new int[k];

        //frequência de cada número no array auxiliar
        for (int i = 0; i < a.length; i++){
            c[a[i] -1] += 1;
        }

        //acumulativa 
        for (int i = 1; i < c.length; i++){
            c[i] += c[i -1]; //acumula o anterior com o próximo
        }

        //array final que irá alocar todos os elementos de maneira ordenada
        int[] b = new int[a.length];
        //ordenação 
        for (int i = a.length -1; 0 <= i; i--){
            b[c[a[i]-1]-1] = a[i]; //adiciona o último elemento do array principal 
            c[a[i]-1]--; //decrementa a acumulativa

        }

       return b;
    }

    /**
    * Implemente uma versão do counting sort que aceita valor 0 na coleção original.
    */
    public int[] zeroCountingSort(int[] a, int k) {
        // TODO implementar
                //Array auxiliar com tamanho do maior elemento
        int[] c = new int[k + 1];

        //frequência de cada número no array auxiliar
        for (int i = 0; i < a.length; i++){
            c[a[i]] += 1;
        }

        //acumulativa 
        for (int i = 1; i < c.length; i++){
            c[i] += c[i -1]; //acumula o anterior com o próximo
        }

        //array final que irá alocar todos os elementos de maneira ordenada
        int[] b = new int[a.length];
        //ordenação 
        for (int i = a.length -1; 0 <= i; i--){
            b[c[a[i]]-1] = a[i]; //adiciona o último elemento do array principal 
            c[a[i]]--; //decrementa a acumulativa

        }

       return b;
    }

    

    /**
    * Implemente uma versão do counting sort que aceita valores negativos na coleção original. Você
    * vai precisar identificar o menor elemento do array. FAça isso no início do método.
    */
    public int[] negativosCountingSort(int[] v, int k) {
        // TODO implementar
        return null;
    }

}
