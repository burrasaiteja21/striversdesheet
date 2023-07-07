package hashtable;
import java.util.Hashtable;
import java.util.Iterator;
public class hashexa1
{
    public  static void main(String[] args)
    {
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(1,"A");
        ht.put(2,"B");
        ht.put(3,"C");
        ht.put(4,"D");
        System.out.println(ht+" ");
        String val=ht.get(3);
        System.out.println(val+" ");
        ht.remove(2);
        Iterator<Integer> tr= ht.keySet().iterator();
        while(tr.hasNext())
        {
            Integer ky=tr.next();
            System.out.print(ky+" ");
            String map=ht.get(ky);
            System.out.print(map+" ");
        }

    }
}
