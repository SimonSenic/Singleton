package sk.kosickaacademic.simon;

public class Planet {
    private String name;
    private long distance;
    private int n;

    public Planet(String name, long distance){
        this.name = name;
        this.distance = distance;
    }

    public Planet(String name, long distance, int n){
        this(name, distance);
        this.n = n;
    }

    public String getName() {
        return name;
    }

    public long getDistance() {
        return distance;
    }
}
