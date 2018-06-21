import java.util.Scanner;

public class KierSwiataTest {

    public static void main(String[] args) {
        KierSwiata[] kierunek =KierSwiata.values();
        for (KierSwiata kierSwiata : kierunek) {
            System.out.println(kierSwiata);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("podaj kierunek geograficzny: ");
        String speed = input.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println();
        }
        KierSwiata kierGeo = KierSwiata.valueOf(speed);
        System.out.println(kierGeo);
        System.out.println("ok więc idziemy na "+kierGeo.getKierunek());
    }
}
