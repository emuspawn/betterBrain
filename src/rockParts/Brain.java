package rockParts;

import Objects.*;
import Objects.Object;
import Tasks.*;
import rockParts.Body;
import java.util.*;

import  java.util.Arrays.*;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 2/16/13
 * Time: 6:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class Brain {

    public static void main(String[] args){

      Body body = new Body();  //make the mind a body
      int alive = 10;  //timer for now. Boolean in future


     /*  while(body.alive>0){
            body.bodyCycle();          //die slowly
            body.judge(body);
            }
      */
        /* Heartbeat debug */
        Heart heart = new Heart();
        while(alive<=0){
            if(heart.beat()){
        System.out.println("Ka Thump thump");
            alive--;
        }
            else{System.out.println("nope");}
        }
        }



    public void judge(Body b){
        Food pants = new Food();
        Toy ball = new Toy();
        Organ[] needs = {b.Fun, b.HP};
        List<Organ> organs = new ArrayList<Organ>();
        Collections.sort(organs, new organSorter());
    }
    class organSorter implements Comparator<Organ>{
        public int compare(Organ organ, Organ organ2){
            return organ.stat -  organ2.stat;
        }
    }
}

