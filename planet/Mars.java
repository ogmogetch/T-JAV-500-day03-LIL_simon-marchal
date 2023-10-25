package planet;

public class Mars {
private static int counter = -1;
    private int id;
    private static String landingSite;


    public Mars(String name) {
        counter ++;
        id = counter ;
        landingSite = name;

    }

    public static String getLandingSite(){
        return landingSite;
    }

    public int getId () {
        return id ;
    }



}
