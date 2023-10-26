import planet.*;
import chocolate.*;

public class Astronaut {
    private static int counter = -1;
    private int id, snacks;
    private String destination, name;

    public Astronaut(String name) {
        counter ++;
        id = counter ;
        snacks = 0;
        destination = null;
        this.name = name;
        System.out.println(name + " ready for launch!");

    }
    public void doActions(Object mars) {
        if(mars instanceof planet.Mars) {
            // cast mars to planet.Mars
            planet.Mars planetMars = (planet.Mars) mars;
            this.destination = planetMars.getLandingSite();
            System.out.println(this.name + ": Started a mission!");
        }
        else if (mars instanceof chocolate.Mars) {
            this.snacks++;
            // cast mars to chocolate.Mars
            chocolate.Mars chocolateMars = (chocolate.Mars) mars;
            System.out.println(this.name + ": Thanks for this mars number " + chocolateMars.getId());
            if (this.destination == null) {
                System.out.println(this.name + ": I may have done nothing, but I have " + this.snacks + " Mars to eat at least!");
            }

        } else if (mars instanceof planet.moon.Phobos) {
            // cast mars to planet.moon.Phobos
            planet.moon.Phobos phobos = (planet.moon.Phobos) mars;
            this.destination = phobos.getLandingSite();
            System.out.println(this.name + ": Started a mission!");
        }
    }

    public void doActions() {
        System.out.println(this.name + ": Nothing to do.");
        if (this.destination == null) {
            System.out.println(this.name + ": I may have done nothing, but I have " + this.snacks + " Mars to eat at least!");
        }
    }

    public String getName(){
        return name;
    }
    public int getId () {
        return id ;
    }

    public int getSnacks(){
        return snacks;
    }
    public String getDestination(){
        return destination;
    }
}
