import planet.*;
import chocolate.*;

public class Astronaut {
    /*
    It is time for your Astronaut to start working!
Create a new method doActions taking an optional parameter.
This method displays:
3 [Name]: Nothing to do., if no parameter is given ;
3 [Name]: Started a mission!, if the parameter is a planet.Mars ;
3 [Name]: Thanks for this Mars number [Mars id], if the parameter is a chocolate.Mars ;
Depending on the case, you will need to:
3 store the planet landing site as your Astronaut’s new destination ;
3 or increment his snacks attribute by one.
After each previous sentence, if the astronaut has no destination, it will also display:
[Name]: I may have done nothing, but I have [x] Mars to eat at least!
     */
    private static int counter = -1;
    private int id, snack;
    private String destination;
    private String name;
public Astronaut() {
        counter ++;
        id = counter ;
    }
    public Astronaut(String name) {
        counter ++;
        id = counter ;
        snack = 0;
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
            // cast mars to chocolate.Mars
            chocolate.Mars chocolateMars = (chocolate.Mars) mars;
            System.out.println(this.name + ": Thanks for this Mars number " + chocolateMars.getId());
            if (this.destination == null) {
                System.out.println(this.name + ": I may have done nothing, but I have " + this.snack + " Mars to eat at least!");
            }
            this.snack++;

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
            System.out.println(this.name + ": I may have done nothing, but I have " + this.snack + " Mars to eat at least!");
        }
    }

    public String getName(){
        return name;
    }
    public int getId () {
        return id ;
    }

    public int getSnack(){
        return snack;
    }
    public String getDestination(){
        return destination;
    }
}
