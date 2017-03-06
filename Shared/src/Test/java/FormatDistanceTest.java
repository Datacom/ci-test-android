/**
 * Created by khodasisodia on 3/03/17.
 */

import com.example.android.xyztouristattractions.common.Utils;
import com.google.android.gms.maps.model.LatLng;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;



public class FormatDistanceTest {

    @Test
    public void testDistanceFormatter() {
        LatLng p1 = new LatLng (50.06638888888889, -5.714722222222222);
        LatLng p2 = new LatLng (58.64388888888889, -3.0700000000000003);

        String actual = Utils.formatDistanceBetween(p1, p2);

        String expected = "968.9km";
        String expectedFail = "1968.9km";

        //assertEquals(expected, actual);
        assertEquals(expectedFail, actual);


    }
}
