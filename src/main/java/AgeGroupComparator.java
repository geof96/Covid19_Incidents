import java.util.Comparator;

public class AgeGroupComparator implements Comparator <Covid19Data> {
@Override
public int compare(Covid19Data d1, Covid19Data d2){
    return d1.getAgeGroup().compareTo(d2.getAgeGroup());
}

}
