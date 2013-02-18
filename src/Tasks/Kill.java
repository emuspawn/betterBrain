package Tasks;

import rockParts.Body;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 2/16/13
 * Time: 6:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class Kill extends Task {

    public  Kill(){
        id = 0;
        name = "dying of boredom";
        duration = 4;
    }
   public void run(Body b){
        b.setHP(-3);
       System.out.println("It's a horrible day to be alive. HP: " + b.getHP());
   }
}
