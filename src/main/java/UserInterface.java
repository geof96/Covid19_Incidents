import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class UserInterface {

    private FileHandler fileH = new FileHandler();
    private ArrayList<Covid19Data> covid19DataList = new ArrayList<>();

    public void showMenu() {
        System.out.println("""
                1) Load Data
                2) Save data
                0) exit program
                """);

    }

    public void startProgram() {
        Scanner input = new Scanner(System.in);
        int userInput = 10;
        while (userInput != 0) {
            showMenu();
            userInput = input.nextInt();

            switch (userInput) {
                case 1 -> restoreData();
                case 2 -> saveAllData();
                case 0 -> exit(0);
            }
        }
    }

    private void restoreData() {
        System.out.println("Printing your data out!");
        covid19DataList = fileH.restoreData();
        System.out.println(covid19DataList);
    }

    private void saveCovidData() {

        // fileH.saveCovidData();
    }

    private void saveAllData() {
        fileH.saveAllData(covid19DataList);
    }
}
