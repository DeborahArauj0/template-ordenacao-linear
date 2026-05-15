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
    public int[] zeroCountingSort(int[] v, int k) {
        
        //Array auxiliar com tamanho do maior elemento
        int[] c = new int[k + 1];

        //frequência de cada número no array auxiliar
        for (int i = 0; i < v.length; i++){
            c[v[i]] += 1;
        }

        //acumulativa 
        for (int i = 1; i < c.length; i++){
            c[i] += c[i -1]; //acumula o anterior com o próximo
        }

        //array final que irá alocar todos os elementos de maneira ordenada
        int[] b = new int[v.length];
        //ordenação 
        for (int i = v.length -1; 0 <= i; i--){
            b[c[v[i]]-1] = v[i]; //adiciona o último elemento do array principal 
            c[v[i]]--; //decrementa a acumulativa

        }

       return b;
    }

    /**
    * Implemente uma versão do counting sort que aceita valores negativos na coleção original. Você
    * vai precisar identificar o menor elemento do array. FAça isso no início do método.
    */
    public int[] negativosCountingSort(int[] v, int k) {
    
        int menor = menor(v);
        
        int[] c = new int[k - menor + 1];

        //Frequência
        for (int i = 0; i < v.length; i++){
            c[v[i]- menor] += 1;
        }

        //acumulativa
        for (int i = 1; i < c.length; i++){
            c[i] += c[i -1];
        }

        //aloca os elementos do array principal, de forma ordenadeda
        int[] b = new int[v.length];
        //ordenação
        for (int i = v.length -1; i >= 0; i--){
            b[c[v[i] - menor] -1] = v[i];
            c[v[i]-menor]--;
        }

        return b;
    }

    //método auxiliar para mapear o menor elemento do array
    public int menor(int[] v){

        int menor = v[0];
        
        for (int i = 1; i < v.length; i++){
            if (v[i] < menor){
                menor = v[i];
            }

        }

        return menor;

    }

}
