package statisticker;

import java.util.*;

public class Statistics 
{
 class Stats{
     public Float average,max,min;
 }
 public Stats getStatistics(List<Float> numbers) {
        Stats s=new Stats();
        s.average=avg(numbers);
        s.max=maximun(numbers);
        s.min=minimum(numbers);
        return s;
    }
    private static Float avg(List<Float> marks){
        Float sum = 0f;
        if(!marks.isEmpty()) {
            for (Float mark : marks) {
                sum += mark;
            }
            return sum/marks.size();
        }
        return sum;
    }
    private static Float maximun(List<Float> numbers){
        return Collection.max(numbers);
    }
    private static Float minimum(List<Float> numbers){
        return Collection.min(numbers);
    }
}
