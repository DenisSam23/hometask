public class BasicAircraft {
    String countryOfOrigin;
    String name;
    String model;
    String length;
    String weight;
    String materialOfTheFuselage;
    String powerOfEngine;

    static private int countOfObjects=0;

    public static int getCountOfObjects() {
        return countOfObjects;
    }

    public void setCountOfObjects(int value) {
        countOfObjects=value;
    }
    public void countOfObjectsPlusOne() {
        countOfObjects+=1;
    }
}
