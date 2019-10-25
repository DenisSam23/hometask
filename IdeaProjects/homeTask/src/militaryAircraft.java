public class militaryAircraft extends BasicAircraft {
    String type;
    String weapon;

    public void getAllInfoM() {
        System.out.println(this.countryOfOrigin + "; " + this.name + "; " + this.model + "; " + this.length + "; " +
                this.weight + "; " + this.materialOfTheFuselage + "; " + this.powerOfEngine + "; " + this.type + ";" + this.weapon);
    }

    public militaryAircraft(String countryOfOrigin, String name, String model, String length, String weight, String materialOfTheFuselage,
                            String powerOfEngine, String type, String weapon) {
        this.countryOfOrigin = countryOfOrigin;
        this.name = name;
        this.model = model;
        this.length = length;
        this.weight = weight;
        this.materialOfTheFuselage = materialOfTheFuselage;
        this.powerOfEngine = powerOfEngine;
        this.type = type;
        this.weapon = weapon;
        countOfObjectsPlusOne();
    }
}
