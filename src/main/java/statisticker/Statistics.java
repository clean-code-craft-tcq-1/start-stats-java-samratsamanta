package statisticker;

import java.util.List;

public class Statistics 
{
    class Stats{
         public Float average,max,min;
    }
   
    public static Stats getStatistics(List<Float> numbers) {
        Stats s=new Stats();
        s.average=avg(numbers);
        s.max=maximun(numbers);
        s.min=minimum(numbers);
        return s;
    }
    private static Float avg(List<Float> numbers){
        return 0.1f;
    }
    private static Float maximun(List<Float> numbers){
        return 0.1f;
    }
    private static Float minimum(List<Float> numbers){
        return 0.1f;
    }
}
