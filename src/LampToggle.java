import java.util.InputMismatchException;
import java.util.Scanner;

public class LampToggle {
    public static void main(String[] args) {
        Lamp lampe1 = new Lamp("lampe1");
        Lamp lampe2 = new Lamp("lampe2");
        Lamp lampe3 = new Lamp("lampe3");
        Lamp lampe4 = new Lamp("lampe4");
        Lamp lampe5 = new Lamp("lampe5");

        Lamp selectedLamp = null;

        Scanner sc = new Scanner(System.in);

        int valg;
        do {
            System.out.println(lampe1);
            System.out.println(lampe2);
            System.out.println(lampe3);
            System.out.println(lampe4);
            System.out.println(lampe5);

            System.out.println("Hvilken lampe skal ændres? (0 er afslut)");

            try {
                valg = sc.nextInt();
            } catch (InputMismatchException e) {
                valg = 0;
            }

            if (valg > 0 && valg <= 5) {
                if (valg == 1)
                    selectedLamp = lampe1;
                else if (valg == 2)
                    selectedLamp = lampe2;
                else if (valg == 3)
                    selectedLamp = lampe3;
                else if (valg == 4)
                    selectedLamp = lampe4;
                else if (valg == 5)
                    selectedLamp = lampe5;

                selectedLamp.toggle();
            }
        } while (valg != 0);
    }
}

