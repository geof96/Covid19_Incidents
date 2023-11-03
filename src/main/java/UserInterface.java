import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private FileHandler fileH = new FileHandler();

    public void showMenu() {
        System.out.println("""
                1) Load Data
                2) Enter data
                3) Save data
                0) exit program
                """);

    }

    public void startProgram() {
        Scanner input = new Scanner(System.in);
        int userInput = 10;
        while (userInput != 0 )
        userInput = input.nextInt();

        switch (userInput) {
            case 1 -> restoreData();
            case 2 -> saveCovidData();
            case 3 -> saveAllData();
        }
    }

    private void restoreData() {
        System.out.println("Printing your data out!");
        fileH.restoreData();
    }

    private void saveCovidData() {

        fileH.saveCovidData();
    }

    private void saveAllData(){
        fileH.saveAllData();
    }
}
