public class MOBurbujaAjustes {

    public int[] sortBubbleAva(int[] arreglo){

        boolean intercambio = false;
        int n= arreglo.length;
        for (int i = 0; i < n; i++) {
            intercambio = false;
            System.out.println("Pasada"+i);
            for (int j = 0; j < n-1-i; j++) { // el i da las iteraciones y j es el indice para comparar 
                System.out.println("j="+j+" [j]"+ arreglo[j] + "j+1=" + j+1 +" [j+1]"+ arreglo[j+1]);
                //Intercambio
                if(arreglo[j] > arreglo[j+1] ){
                    System.out.println("si hay cambio");
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                    intercambio = true;
                }
            }
            //Rompe el bucle si el arreglo esta Ordenado
            if(!intercambio){
                break;
            }
        }
        return arreglo;
    }

    public void pritArreglo(int[] arr) {
        for( int num : arr){
            System.out.print(num+" ");
        }
    }
}
