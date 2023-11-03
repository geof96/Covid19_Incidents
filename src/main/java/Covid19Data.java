public class Covid19Data {
    private String region;
    private String ageGroup;
    private int confirmedCases;

    @Override
    public String toString() {
        return "Covid19Data: \n" +
                "Region: " + region + "\n" +
                "AgeGroup: " + ageGroup + "\n" +
                "ConfirmedCases: " + confirmedCases + "\n" +
                "Deaths: " + deaths + "\n" +
                "IntensiveCareUnit: " + intensiveCareUnit + "\n" +
                "HospitalizedPatients: " + hospitalizedPatients;
    }

    private int deaths;
    private int intensiveCareUnit;
    private int hospitalizedPatients;


    public Covid19Data(String region, String ageGroup, int confirmedCases, int deaths, int intensiveCareUnit, int hospitalizedPatients){
        this.region = region;
        this.ageGroup = ageGroup;
        this.confirmedCases = confirmedCases;
        this.deaths = deaths;
        this.intensiveCareUnit = intensiveCareUnit;
        this.hospitalizedPatients = hospitalizedPatients;
    }

    public String getRegion() {
        return region;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public int getConfirmedCases() {
        return confirmedCases;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getIntensiveCareUnit() {
        return intensiveCareUnit;
    }

    public int getHospitalizedPatients() {
        return hospitalizedPatients;
    }
}
