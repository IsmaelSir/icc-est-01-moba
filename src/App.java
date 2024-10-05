import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tecla = new Scanner(System.in);
        String mensaje = "Ingrese el tmanio del arreglo: ";
        boolean permitirNegativo = true;
        //int[] arr = {5,8,9,3,0, -60, 40, -1100, 70, 13};
        //int[] arr = {1,2,3,4,5};
        //ba.sortBubbleAva(arr);
        //ba.pritArreglo(arr);
        int tamanio = leerEnteroValido(tecla, mensaje, permitirNegativo);

        int[] arreglo = new int[tamanio];

        for(int i=0; i<tamanio; i++){
            System.out.print("Ingrese los valores del arreglo: ");
            arreglo[i] = tecla.nextInt();
        }
        
        tecla.close();
    }
    public static int leerEnteroValido(Scanner tecla, String mensaje, boolean permitirNegativo){
        int tamanio = 0;
            do { 
                while (!tecla.hasNextInt()) {
                    System.out.println("Intente de nuevo"); 
                    tecla.next();
                    }
                    tamanio = tecla.nextInt();
                    if(tamanio <= 0){
                        System.out.println("El tamanio del arreglo debe ser positivo y mayor a 0");
                    }
            }while (tamanio<=0);
            
            return tamanio;
        }
}
