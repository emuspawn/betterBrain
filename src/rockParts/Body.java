package rockParts;

import Tasks.*;
import Objects.*;

import java.util.*;
import java.util.Arrays.*;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 2/16/13
 * Time: 6:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class Body {
    String name = "Rock";
    int alive = 25;
    Organ HP = new Organ(1,10,0);
    Organ Food= new Organ(2,5,0);
    Organ Sleep= new Organ(3,5,0);
    Organ Thirst= new Organ(4,5,0);
    Organ Fun= new Organ(5,15,0);

    public String getName(){return name;}
    public void setHP(){HP.stat = HP.stat+2;}
    public void setHP(int i){HP.stat = HP.stat +i; System.out.println("HP is now: " + getHP());}
    public int getHP(){return HP.stat;}
    public void killHP(){if(HP.stat<=0){HP.stat=0;}else {HP.stat--;} }
    public void setFood(){Food.stat = Food.stat+2;}
    public void setFood(int i){Food.stat = Food.stat+i;}
    public int getFood(){return Food.stat;}
    public void killFood(){if(Food.stat<=0){Food.stat=0;} else{Food.stat--;} }
    public void setSleep(){Sleep.stat = Sleep.stat+2;}
    public void setSleep(int i){Sleep.stat = Sleep.stat+i;}
    public void killSleep(){if(Sleep.stat<=0){Sleep.stat=0;} else {Sleep.stat--;}   }
    public int getSleep(){return Sleep.stat;}
    public void setThirst(){Thirst.stat = Thirst.stat+2;}
    public void setThirst(int i){Thirst.stat = Thirst.stat+i;}
    public int getThirst(){return Thirst.stat;}
    public void killThirst(){if(Thirst.stat<=0){Thirst.stat=0;} else{Thirst.stat--;} }
    public void setFun(){Fun.stat = Fun.stat+2;}
    public void setFun(int i){Fun.stat = Fun.stat+i;}
    public int getFun(){return Fun.stat;}
    public void killFun(){if(Fun.stat<=0){Fun.stat=0;} else{Fun.stat--;}}

public void bodyCycle(){
     killHP();
    killFun();
    killFun();
    this.alive--;
    System.out.println("thump thump." + this.alive + " many heartbeats left. HP: " + this.getHP() + "Fun: " + this.getFun());
}
public void feedMe(Food f){
    int timeLeft = f.time;
    while(timeLeft>=0){
        this.setHP(f.HP);
        System.out.println(this.getName() + " is eating " + f.name + "(" + timeLeft + "/" + f.time + ")\nHP: " + this.getHP() );
        timeLeft--;
    }
    System.out.println("I've Been fed!");
}
    public void funMe(Toy f){
        int timeLeft = f.time;
        while(timeLeft>=0){
            this.setHP(f.HP);
            System.out.println(this.getName() + " is eating " + f.name + "(" + timeLeft + "/" + f.time + ")\nHP: " + this.getHP() );
            timeLeft--;
        }
        System.out.println("I've Been fed!");
    }

        public void judge(Body b){
            Food pants = new Food();
            Toy ball = new Toy();
            Organ[] needs = {b.Fun, b.HP};
            Arrays.sort(needs);
            System.out.println(needs[0].OID + " " + needs[0].stat);
        }
    }

