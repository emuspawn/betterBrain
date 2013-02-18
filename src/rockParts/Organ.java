package rockParts;

import sun.security.x509.OIDMap;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 2/17/13
 * Time: 1:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class Organ implements Comparable{
    public int OID;
    public int stat;
    public int specMod;
     public Organ(int o, int s, int m){
         OID = o;
         stat = s;
         specMod = m;
     }
    public int compareTo(Object obj){
        Organ tmp = (Organ)obj;
        if(this.stat < tmp.stat)
        {
            return -1;
        }
        else if(this.stat > tmp.stat){
            return 1;
        }
        return 0;
    }
}
