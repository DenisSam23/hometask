public class SportAircraft extends BasicAircraft {
    String countOfPilots;

    public void getAllInfoS() {
        System.out.println(this.countryOfOrigin + "; " + this.name + "; " + this.model + "; " + this.length + "; " +
                this.weight + "; " + this.materialOfTheFuselage + "; " + this.powerOfEngine + "; " + this.countOfPilots);
    }

    public SportAircraft(String countryOfOrigin, String name, String model, String length, String weight, String materialOfTheFuselage,
                         String powerOfEngine, String countOfPilots) {
        this.countryOfOrigin=countryOfOrigin;
        this.name=name;
        this.model=model;
        this.length=length;
        this.weight=weight;
        this.materialOfTheFuselage=materialOfTheFuselage;
        this.powerOfEngine=powerOfEngine;
        this.countOfPilots=countOfPilots;
        countOfObjectsPlusOne();
    }
}
