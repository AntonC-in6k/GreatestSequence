/**
 * Created by employee on 7/8/16.
 */
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class GreatestSequenceTest {

    @Test
    public void nullTest() throws Exception {
        assertThat(GreatestSequence.findSequence(null), is(new ArrayList<Integer>()));
    }

    @Test
    public void emptyLitTest() throws Exception {
        assertThat(GreatestSequence.findSequence(new ArrayList<Integer>()), is(new ArrayList<Integer>()));
    }
}
