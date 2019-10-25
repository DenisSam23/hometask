import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Program {
    static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main (String[]args){
        militaryAircraft Yak201 = new militaryAircraft("Russia", "Yak", "201", "18,3",
                "19,5", "metal", "-", "fighter", "ГШ-301");
        militaryAircraft NorthropB2Spirit = new militaryAircraft("USA", "Northrop", "B-2",
                "21", "-", "metal", "-","stealth-bomber", "Mk.82");
        militaryAircraft JAS39 = new militaryAircraft("UK", "JAS", "39", "14,1", "14000",
                "metal", "80500 H", "Multi-purpose combat aircraft", "Mauser BK27");
        PassengerAircraft AirbusA319 = new PassengerAircraft("France", "Airbus", "A319", "33,8",
                "75,5", "Composite material", "-", "2", "144");
        PassengerAircraft Boeing737800 = new PassengerAircraft("USA", "Boeing", "737-800", "39,47",
                "41,4","-", "-", "2", "176");
        PassengerAircraft Embraer170 = new PassengerAircraft("Brazil", "Embraer", "170",
                "29,9", "35,9", "-", "-", "2", "72");
        SportAircraft AeroitbaPetrel912i = new SportAircraft("Argentina", "Aeroitba", "Petrel 912i",
                "6,1", "0,535", "-", "80", "1");
        SportAircraft Yak52 = new SportAircraft("USSR", "Yak", "52","7,7", "1,315",
                "-", "-", "1");
        SportAircraft PZL104Wilga = new SportAircraft("Poland", "PZL", "104 Wilga", "8,1",
                "0.9", "-", "260","1");
        Yak201.getAllInfoM();
        NorthropB2Spirit.getAllInfoM();
        JAS39.getAllInfoM();
        AirbusA319.getAllInfoP();
        Boeing737800.getAllInfoP();
        Embraer170.getAllInfoP();
        AeroitbaPetrel912i.getAllInfoS();
        Yak52.getAllInfoS();
        PZL104Wilga.getAllInfoS();
    }
}
