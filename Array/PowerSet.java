package Array;

import java.util.ArrayList;
import java.util.List;
public class PowerSet {
    public static void powerSet(List<Integer> l,
                                List<Integer> ans,
                                List<List<Integer>> result,
                                int i){

        if(i==l.size()){
            result.add(new ArrayList<>(ans));
            return;
        }
        powerSet(l,ans,result,i+1);
        ans.add(l.get(i));
        powerSet(l,ans,result,i+1);
        ans.remove(ans.size()-1);
    }
    public static void main(String[] args) {
        List<Integer> ans=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        powerSet(l,ans,result,0);
        System.out.println(result);
    }
}
