package rockParts;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 2/17/13
 * Time: 8:13 PM
 * To change this template use File | Settings | File Templates.
 */
import java.util.Calendar;
public class Heart {
    int cycles = 4;
    Boolean update = false;
    Calendar heart = Calendar.getInstance();
    long timeNow = heart.getTimeInMillis();
    long lastUpdate=heart.getTimeInMillis();
    long timePassed=0;
    public  Heart(){

    }
    public Heart(int i){
      int cycles = i;
    }

    public boolean beat(){
     Calendar beat = Calendar.getInstance();
     timeNow = beat.getTimeInMillis();
     timePassed = timeNow - lastUpdate;
        if(timePassed<=1500){
            update = false;

            return update;

        }
    else{
            update=true;
            System.out.println(timePassed);
            lastUpdate=timeNow;
            return update;
        }
   }
}