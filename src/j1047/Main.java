package j1047;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        //Hora inicial + minuto inicial: 07:08
        int horaInicial = sc.nextInt();
        int minutoInicial = sc.nextInt();

        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();

        int horarioInicialEmMinutos = (horaInicial * 60) + minutoInicial;
        int horarioFinalEmMinutos = (horaFinal * 60) + minutoFinal;

        int duracaoEmMinutos;
        
        if(horarioInicialEmMinutos > horarioFinalEmMinutos){
            duracaoEmMinutos = (24 * 60 - horarioInicialEmMinutos) + horarioFinalEmMinutos;
        }else{
            duracaoEmMinutos = horarioFinalEmMinutos - horarioInicialEmMinutos;
        }

        int horasDeDiferenca = duracaoEmMinutos / 60;
        int minutosDeDiferenca = duracaoEmMinutos % 60;

        if (horasDeDiferenca == 0 && minutosDeDiferenca == 0) {
            horasDeDiferenca = 24; // Caso o jogo tenha durado exatamente 24 horas
        }


        System.out.println("O JOGO DUROU " + horasDeDiferenca +" HORA(S) E " + minutosDeDiferenca +" MINUTO(S)");
        

        sc.close();
    }
}
