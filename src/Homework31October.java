public class Homework31October {
    public static void main(String[] args) {

        //Задача 1

        int countOfPeopleInChina = 1_411_778_724;
        int countOfCountriesInTheWorld = 197;
        long possiblePopulationInTheWorld = (long) countOfPeopleInChina * countOfCountriesInTheWorld;
        System.out.println(possiblePopulationInTheWorld);

        //Задача 2

        long durationOfLifeOfFelixInSeconds = 3_011_456_567L;
        int countOfSecondsInOneMinute = 60;
        int countOfMinutesInOneHour = 60;
        int countOfHoursInOneDay = 24;
        int countOfDaysInOneYear = 365;
        int countOFSecondsInOneYear = countOfSecondsInOneMinute * countOfMinutesInOneHour *countOfHoursInOneDay * countOfDaysInOneYear;

        int durationOfLifeOfFelixInYears = Math.toIntExact(durationOfLifeOfFelixInSeconds / countOFSecondsInOneYear);
        System.out.println(durationOfLifeOfFelixInYears);
    }
}
