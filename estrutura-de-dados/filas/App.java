package filas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Elemento raiz = null;
        int opt = 0;
        while(opt != 9){
            System.out.println(
                    "1 - Inserir um novo valor \n"+
                    "2 - Imprimir a fila; \n"+
                    "9 - Sair; \n"
            );
            System.out.print("Digite um valor: ");
            opt = sc.nextInt();
            switch (opt){
                case 1:
                    inserirElemento(0);
                case 2:
                    imprimirLista(raiz);
            }
        }
    }
    public static void inserirElemento(int valor) {

    }
    public static void imprimirLista(Elemento raiz){
        if(raiz != null)//o elemento inicial da lista precisa ser diferente de nulo
        {

        } else {
            System.out.println("A fila está vazia, insira elementos primeiro!\n");
        }
    }
}
