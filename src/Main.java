import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz : ");
        int birthYear;
        String horoscope="none";
        birthYear = input.nextInt();
        if (birthYear % 12 == 0) {
            horoscope = "Maymun";
        } else if (birthYear % 12 == 1) {
            horoscope = "Horoz";
        } else if (birthYear % 12 == 2 ) {
            horoscope = "Köpek";
        } else if (birthYear % 12 == 3) {
            horoscope = "Domuz";
        } else if (birthYear % 12 == 4) {
            horoscope = "Fare";
        } else if (birthYear % 12 == 5) {
            horoscope = "Öküz";
        } else if (birthYear % 12 == 6) {
            horoscope = "Kaplan";
        } else if (birthYear % 12 == 7) {
            horoscope = "Tavşan";
        } else if (birthYear % 12 == 8) {
            horoscope = "Ejderha";
        } else if (birthYear % 12 == 9) {
            horoscope = "Yılan";
        } else if (birthYear % 12 == 10) {
            horoscope = "At";
        } else if (birthYear % 12 == 11) {
            horoscope = "Koyun";
        }
        System.out.println("çin Zodyağı Burcunuz : " + horoscope);
    }
}