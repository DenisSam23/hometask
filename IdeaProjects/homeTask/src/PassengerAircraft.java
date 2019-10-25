public class PassengerAircraft extends BasicAircraft {
    String countOfEngines;
    String countOfPassengers;

    public void getAllInfoP() {
        System.out.println(this.countryOfOrigin + "; " + this.name + "; " + this.model + "; " + this.length + "; " +
                this.weight + "; " + this.materialOfTheFuselage + "; " + this.powerOfEngine + "; " + this.countOfEngines + ";" + this.countOfPassengers);
    }

    public PassengerAircraft(String countryOfOrigin, String name, String model, String length, String weight,
                             String materialOfTheFuselage, String powerOfEngine, String countOfEngines, String countOfPassengers) {
        this.countryOfOrigin=countryOfOrigin;
        this.name=name;
        this.model=model;
        this.length=length;
        this.weight=weight;
        this.materialOfTheFuselage=materialOfTheFuselage;
        this.powerOfEngine=powerOfEngine;
        this.countOfEngines=countOfEngines;
        this.countOfPassengers=countOfPassengers;
        countOfObjectsPlusOne();
    }
}
