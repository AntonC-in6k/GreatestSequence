/**
 * Created by employee on 7/8/16.
 */
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class GreatestSequenceTest {

    @Test
    public void nullSequenceTest() throws Exception {
        assertThat(GreatestSequence.findSequence(null), is(new ArrayList<Integer>()));
    }

    @Test
    public void emptySequenceTest() throws Exception {
        assertThat(GreatestSequence.findSequence(new ArrayList<Integer>()), is(new ArrayList<Integer>()));
    }

    @Test
    public void oneDigitInSequenceTest() throws Exception{
        ArrayList<Integer> testSequence = new ArrayList<Integer>(Arrays.asList(new Integer[]{1}));
        ArrayList<Integer> expectedSequence = new ArrayList<Integer>(Arrays.asList(new Integer[]{1}));
        assertThat(GreatestSequence.findSequence(testSequence),is(expectedSequence));
    }
}
