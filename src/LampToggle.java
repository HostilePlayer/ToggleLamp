import java.util.InputMismatchException;
import java.util.Scanner;

public class LampToggle {
    //laver 5 Lamp elemtner
    public static void main(String[] args) {
        Lamp lampe1 = new Lamp("lampe1");
        Lamp lampe2 = new Lamp("lampe2");
        Lamp lampe3 = new Lamp("lampe3");
        Lamp lampe4 = new Lamp("lampe4");
        Lamp lampe5 = new Lamp("lampe5");

        //sitter brugers valg til null
        Lamp selectedLamp = null;
        //laver scanner
        Scanner sc = new Scanner(System.in);
        //laver int valg
        int valg;
        //starter loop
        do {
            //printer Lamp state og navn
            System.out.println(lampe1);
            System.out.println(lampe2);
            System.out.println(lampe3);
            System.out.println(lampe4);
            System.out.println(lampe5);
            //giver brugeret et valg
            System.out.println("Hvilken lampe skal ændres? (0 er afslut)");
            //chekker om brugeren giver et tal
            try {
                valg = sc.nextInt();
            } catch (InputMismatchException e) {
                valg = 0;
            }
            //brugeren vælger lamp
            if (valg > 0 && valg <= 5) {
                if (valg == 1) {
                    selectedLamp = lampe1;
                }
                else if (valg == 2) {
                    selectedLamp = lampe2;
                }
                else if (valg == 3) {
                    selectedLamp = lampe3;
                }
                else if (valg == 4) {
                    selectedLamp = lampe4;
                }
                else if (valg == 5) {
                    selectedLamp = lampe5;
                }
                //tager brugerns valg og putter den til medtoden toggle
                selectedLamp.toggle();
            }
        } while (valg != 0);
    }
}

