import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.exit;

public class UserInterface {

    private FileHandler fileH = new FileHandler();
    private ArrayList<Covid19Data> covid19DataList = new ArrayList<>();

    public void showMenu() {
        System.out.println("""
                1) Load Data
                2) Save data
                3) Sort by region
                4) Sort by age group
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
                case 3 -> sortByRegion();
                case 4 -> sortByAgeGroup();
                    case 0 -> exit(0);
            }
        }
    }

    private void restoreData() {
        System.out.println("Printing your data out!");
        covid19DataList = fileH.restoreData();
        System.out.println(covid19DataList);
    }

    private void sortByRegion() {
        System.out.println("Here is the list sorted by region");
        Collections.sort(covid19DataList, new RegionComparator());
        System.out.println(covid19DataList);
    }

    private void saveAllData() {
        fileH.saveAllData(covid19DataList);
    }

    private void sortByAgeGroup(){
        System.out.println("Here is the list sorted by age");
        Collections.sort(covid19DataList,new AgeGroupComparator());
        System.out.println(covid19DataList);
    }
}
