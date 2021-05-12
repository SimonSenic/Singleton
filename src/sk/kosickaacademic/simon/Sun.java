package sk.kosickaacademic.simon;

import java.util.ArrayList;
import java.util.List;

public class Sun {
    private static Sun sun = new Sun();
    private static List<Planet> list = new ArrayList();

    private Sun(){
    }

    public static Sun getInstance(){
        return sun;
    }

    public static void addPlanet(Planet planet){
        list.add(planet);
    }

    public static void printPlanets(){
        for(Planet temp : list) System.out.println(temp.getName());
    }

    public static void findPlanet(String pattern){
        for(Planet temp: list)
            if(temp.getName().toLowerCase().contains(pattern.toLowerCase())) System.out.println(temp.getName());
    }

}
