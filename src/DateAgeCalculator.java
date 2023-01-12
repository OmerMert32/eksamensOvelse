public class DateAgeCalculator {
    int yourAge;
    int dateAge;

    public DateAgeCalculator(int yourAge, int dateAge){
        this.yourAge = yourAge;
        this.dateAge = dateAge;
    }

    public static int beregner(DateAgeCalculator alder){
        int lowest = alder.yourAge / 2 + 7;

        return lowest;
    }
    public static boolean tjek(int lowest, DateAgeCalculator dateage){
        if (dateage.dateAge < lowest){
            return false;
        }
        return true;
    }
}
