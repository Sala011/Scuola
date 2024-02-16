import java.util.Random;
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int counter =0;
        int pos;
        int opzione =0;
        Random generatore = new Random();
        int [] numeri = new int[100];
        do{
            pos =0;
            System.out.println("Scegli un'opzione");
            System.out.println("1_Caricamento da tastiera");
            System.out.println("2_Caricamento casuale");
            System.out.println("3_Visualizzazione");
            System.out.println("4_Inserimento in posizione");
            System.out.println("5_Cancellazione di un elemento creato");
            System.out.println("6_Esci");
            opzione = in.nextInt();
            switch(opzione){
                case 1:
                    System.out.println("Inserisci un numero");
                    numeri [counter] = in.nextInt();
                    counter = counter+1;
                    break;
                case 2:
                    numeri [counter] = 1 + generatore.nextInt(49);
                    counter=counter+1;
                    break;
                case 3:
                    for(int i =0;i<counter;i++){
                        System.out.println(numeri [i]);
                    }
                    break;
                case 4:
                    System.out.println("Scegli la posizione per l'inserimento");
                    pos = in.nextInt();
                    for(int i =counter;i>=pos-1;i=i-1){
                        numeri [i+1] = numeri [i];
                    }
                    System.out.println("Inserisci il numero che vuoi inserire");
                    numeri [pos-1] = in.nextInt();
                    counter = counter+1;
                    break;
                case 5:
                    System.out.println("Scegli la posizione del numero da cancellare");
                    pos = in.nextInt();
                    for(int i =pos;i<counter;i++){
                        numeri [i-1] = numeri [i];
                    }
                    counter = counter-1;
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opzione non valida");
            }
        }while (opzione!=6);
    }
}