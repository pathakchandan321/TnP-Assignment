package Sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Gatherer;

public class IterationSet {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        int n=arr.length;
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(arr[i]);
        }
        Iterator itr=s.iterator();
        while(itr.hasNext()){
            //Integer i=(Integer) itr.next();
            System.out.println(itr.next());
        }
    }
}
