import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class FileHandler {

    File f = new File("Covid19 ark.csv");

    public void saveCovidData(Covid19Data covid19Data) {
        String line = covid19Data.getRegion() + ',' +
                covid19Data.getAgeGroup() + ',' +
                covid19Data.getConfirmedCases() + ',' +
                covid19Data.getDeaths() + ',' +
                covid19Data.getIntensiveCareUnit() + ',' +
                covid19Data.getHospitalizedPatients();
        try {
            PrintStream output = new PrintStream(f);
            output.println(line);
            output.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }


    public void saveAllData(ArrayList<Covid19Data> covidList) {
        try {
            PrintStream output = new PrintStream(f);
            for (Covid19Data covid19Data : covidList) {
                String line = covid19Data.getRegion() + ',' +
                        covid19Data.getAgeGroup() + ',' +
                        covid19Data.getConfirmedCases() + ',' +
                        covid19Data.getDeaths() + ',' +
                        covid19Data.getIntensiveCareUnit() + ',' +
                        covid19Data.getHospitalizedPatients();
                output.println(line);
            }
            output.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();

        }

    }


    //Indlæs fil:

    public ArrayList<Covid19Data> restoreData(){
        File f = new File("Covid19 ark.csv");
        ArrayList<Covid19Data> information = new ArrayList<>();

        try {
            Scanner sc = new Scanner(f, StandardCharsets.ISO_8859_1);

            sc.nextLine();

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] attributter = line.split(",");
                if (attributter.length == 6) {
                    String region = attributter[0].trim();
                    String ageGroup = attributter[1].trim();
                    int confirmedCases = Integer.parseInt(attributter[2].trim());
                    int deaths = Integer.parseInt(attributter[3].trim());
                    int intensiveCareUnit = Integer.parseInt(attributter[4].trim());
                    int hospitalizedPatients = Integer.parseInt(attributter[5].trim());
                    Covid19Data indlæsData = new Covid19Data(
                            region,
                            ageGroup,
                            confirmedCases,
                            deaths,
                            intensiveCareUnit,
                            hospitalizedPatients);
                    information.add(indlæsData);
                } else {
                    System.out.println("Length != 7");
                }
            }
            sc.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return information;
    }

}



