import Film.Film;
import Films.Films;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class test {
    static private void pressAnyKeyToContinue()
    {
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] argv) {
        Films films = new Films();
        films.addFilm(new Film("First film", new Date()));
        films.addFilm(new Film("Second film", new Date()));
        films.addFilm(new Film("Third film", new Date()));

        if (films.size() != 0) {
            while (true) {
                Scanner in = new Scanner(System.in);
                int rightBorder = films.size() - 1;
                System.out.println("Select film from [0," + rightBorder + "] or -1 to exit");
                int num = in.nextInt();
                if (num == -1) {
                    return;
                } else if (num >= films.size()) {
                    try {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    try {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(films.get(num));
                    pressAnyKeyToContinue();
                }

            }
        } else {
            System.out.println("Sorry but films are out of stock");
        }
    }
}
