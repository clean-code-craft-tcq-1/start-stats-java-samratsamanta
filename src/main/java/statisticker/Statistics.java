package statisticker;

import java.util.List;

public class Statistics 
{
    static class Stats{
         public Float average,max,min;
    }
   
    public static Stats getStatistics(List<Float> numbers) {
        Stats.average=avg(numbers);
        Stats.max=maximun(numbers);
        Stats.min=minimum(numbers);        
    }
    private static Float avg(List<Float> numbers){
        return 0.1;
    }
    private static Float maximun(List<Float> numbers){
        return 0.1;
    }
    private static Float minimum(List<Float> numbers){
        return 0.1;
    }
}
