package planet.moon;

public class Phobos {
    private planet.Mars mars;
    private String landingSite;

    public Phobos(planet.Mars mars, String landingSite){
        this.mars = mars;
        this.landingSite = landingSite;
        if (mars == null)
            System.out.println("No planet given.");
        else
            System.out.println("Phobos placed in orbit.");
    }

    public String getLandingSite(){
        return landingSite;
    }

    public planet.Mars getMars(){
        return mars;
    }
}
