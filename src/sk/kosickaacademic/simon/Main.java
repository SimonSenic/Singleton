package sk.kosickaacademic.simon;

public class Main {
    public static void main(String[] args) {
        Sun sun = Sun.getInstance();
        Planet earth = new Planet("Earth", 149600000);
        Planet mercury = new Planet("Mercury", 57910000);
        Planet zolik22 = new Planet("Pluto", 22);
        Sun.addPlanet(earth);
        Sun.addPlanet(mercury);
        Sun.printPlanets();
        Sun.findPlanet("ercUr");
        Sun.findPlanet("art");
    }
}
