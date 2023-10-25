package ex_01;

public class Mars {
    private static int counter = -1;
    private int id;
    public Mars () {
        counter ++;
        id = counter ;
    }
    public int getId () {
        return id ;
    }
}
