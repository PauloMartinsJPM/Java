import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class SampleTests {

    @Test

    public  void testSomeThing (){
        int a = 4;
        int b = 8;
        int total = a+b;

        Assertions.assertEquals(12, total);
    }

    public void timeBetweenDates (){

        Parking parking3 = new Parking(45, 2022, 07 );
    }

}
