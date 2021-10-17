package pl.camp.it.nawiasy;

public class App {
    public static void main(String[] args) {
        String s = "Al(a ma )(kot)a)(";

        char[] cars = s.toCharArray();

        int licznik = 0;
        for (char c : cars) {
            if(c == '(') {
                licznik++;
            } else if(c == ')') {
                licznik--;
            }
            if(licznik < 0) {
                System.out.println("Nawiasy nieprawidłowe");
                return;
            }
        }

        if(licznik == 0) {
            System.out.println("Nawiasy się zgadzają !!");
        }


        //??????

        //??????
    }
}
