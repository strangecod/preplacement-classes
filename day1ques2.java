import java.util.*;
public class day1ques2 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> v = new ArrayList<>();
        List<Integer> v2 = new ArrayList<>();
        v2.add(1);
        v.add(v2);
        if(numRows == 1) return v;
        v2 = new ArrayList<>();
        v2.add(1);
        v2.add(1);
        v.add(v2);
        if(numRows == 2) return v;

        for(int i = 0; i<numRows-2; i++){
            v2 = new ArrayList<>();
            v2.add(1);
            // List<Integer> v3 = new ArrayList<>();
            // v.get(v.size()-1)
            for(int j =0; j<=v.get(v.size()-1).size()-2;j++){
                v2.add(v.get(v.size()-1).get(j)+v.get(v.size()-1).get(j+1));
            }
            v2.add(1);
            v.add(v2);
        }
        return v;
}
}