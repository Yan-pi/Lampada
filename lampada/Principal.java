package lampada;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int op;
        Scanner teclado = new Scanner(System.in);
        Lampada l1 = new Lampada(); //instanciando um objeto na memória

        do {
            System.out.println("MENU");
            System.out.println("1 - ligar | desligar");
            System.out.println("2 - A lampada esta ligada?");
            System.out.println("3 - verificar potencia");
            System.out.println("4 - Alterar potencia");
            System.out.println("-------------------------");
            System.out.println("5 - Sair");
            op = teclado.nextInt();

            switch(op) {
                case 1:
                    l1.acionarOnOff();
                    break;
                case 2:
                    System.out.println("A lampada esta ligada? " + l1.getEstado());
                    break;
                case 3:
                    System.out.println("Potencia da lampada: " + l1.verificarPotencia());
                    break;
                case 4:
                    System.out.println("Qual a nova potencia?");
                    l1.alterarPotencia(teclado.nextInt());
                    break;
                }
        }while(op != 6);

    teclado.close();
    }
}


