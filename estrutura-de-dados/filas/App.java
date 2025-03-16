package filas;

import java.util.Scanner;

public class App {
    private static Elemento raiz = null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
                    System.out.println("Insira um valor (apenas inteiros)");
                    inserirElemento(raiz, sc.nextInt());
                case 2:
                    imprimirLista(raiz);
            }
        }
    }
    public static void inserirElemento(Elemento e, int valor) {
        if(raiz == null){
            raiz = new Elemento(valor);
        } else {

        }
    }
    public static void imprimirLista(Elemento raiz){
        if(raiz != null)//o elemento inicial da lista precisa ser diferente de nulo
        {
            System.out.print(" "+raiz.getValor());
        } else {
            System.out.println("fim da lista\n");
        }
    }
}
