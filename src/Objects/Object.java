package Objects;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 2/17/13
 * Time: 6:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class Object {
    public int FID = 999; //object id
    public String name = "grey goo"; //common name
    public int HP = 0; //HP per 'slice'
    public int time = 1; //how many turns it takes to eat
    public Object() {    }
    public Object(int fid, String objectname, int health, int duration){
        int FID = fid;
        String name = objectname;
        int HP = health;
        int time = duration;
    }


    public int getFID(){return FID;}
}