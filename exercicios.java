package prova;

import java.util.Scanner;

/**
 * exercicios
 */
public class exercicios {

    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("digite 1 para adicao");
        int valor1 = sc.nextInt();
        System.out.println("digite 2 para subtracao");
        int valor2 = sc.nextInt();
        int nDgitado = sc.nextInt();
        if (nDgitado == 1) {
            int valortotal1 = valor1 += valor2;
            System.out.println("valor total e " + valortotal1);
        } else if (nDgitado == 2) {
            int valortotal2 = valor1 - valor2;
            System.out.println("valor total e" + valortotal2);
        }

        else if (nDgitado == 3) {
            int valortotal3 = valor1 * valor2;
            System.out.println("valor total" + valortotal3);
        }

        else if (nDgitado == 4) {
            int valortotal4 = valor1 * valor2;
            System.out.println("valor total e" + valortotal4);
        } else {
            System.out.println("digite o numero novamente");

        }
    }

    public void exercicio2(){
    double nDgitado =sc.nextInt();
    System.out.println("digite o numero de matricula");
    if(nDgitado%4==0){
    System.out.println("voce foi selecionado para o time do cris");}
else if (nDgitado%4==1)
{System.out.println("voce foi selecionado para o tme do greg");}

else if (nDgitado%4==2){System.out.println("voce foi selecionado para o time do caruso");}
else if(nDgitado%4==3)
{System.out.println("voce foi selsecionado para o time do geronio");}
else {System.out.println("digite o numero novamente");}

}
}


