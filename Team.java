public class Team {
    /*
    import planet .*;
public class Example {
public static void main ( String [] args ) {
Astronaut mutta = new Astronaut ( " Mutta " ) ;
Astronaut hibito = new Astronaut ( " Hibito " ) ;
Astronaut serika = new Astronaut ( " Serika " ) ;
Team spaceBro = new Team ( " SpaceBrothers " ) ;
spaceBro . add ( mutta ) ;
spaceBro . add ( hibito ) ;
spaceBro . add ( serika ) ;
System . out . println ( spaceBro . countMembers () ) ;
planet . Mars titi = new planet . Mars ( " Hill " ) ;
mutta . doActions ( titi ) ;
spaceBro . showMembers () ;
spaceBro . remove ( hibito ) ;
System . out . println ( spaceBro . countMembers () ) ;
}
}
     */
    private String name;
    private Astronaut[] members;
    private int count;

    public Team(String name) {
        this.name = name;
        this.members = new Astronaut[10];
        this.count = 0;
    }

    public void add(Astronaut member) {
        if (this.count < 10) {
            this.members[this.count] = member;
            this.count++;
        }
    }

    public void remove(Astronaut member) {
        int i = 0;
        while (i < this.count) {
            if (this.members[i] == member) {
                this.members[i] = null;
                while (i < this.count - 1) {
                    this.members[i] = this.members[i + 1];
                    i++;
                }
                this.count--;
                break;
            }
            i++;
        }
    }

    public int countMembers() {
        return this.count;
    }

    public void showMembers() {
        String message = this.name + ": ";
        int nb = this.count;
        if (this.count == 0) {
            message += "No member yet.";
        } else {
        for (int i = 0; i < this.count; i++) {
            message += this.members[i].getName();
                if (this.members[i].getDestination() != null) {
                    message += " on mission";
                    if (i < nb) {
                        message += ", ";
                        nb--;
                    }
                } else {
                    message += " on standby";
                    if (i < nb) {
                        message += ", ";
                        nb--;
                    }
                }
            }
        }
        System.out.println(message+".");
    }

    public void doActions(String name) {
        /*
        Add a new method to your Team, doActions.
This method calls all of the Team’s Astronaut’s doActions with the received parameter.
If no parameter is received, it displays [Team name]: Nothing to do.
Display it only once.
If chocolate.Mars is received as parameter, we will admit that the team share the chocolate
but it still count as a full chocolate for each astronauts.
Now that your Astronauts have more experience, they can also go on a mission to Phobos.
You will need to modify your Astronaut class.
         */
        if (name == null) {
            System.out.println(this.name + ": Nothing to do.");
        } else {
            for (int i = 0; i < this.count; i++) {
                this.members[i].doActions(name);
            }
        }
    }
}
