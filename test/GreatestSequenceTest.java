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
        assertThat(GreatestSequence.findSequence(new ArrayList<>()), is(new ArrayList<Integer>()));
    }

    @Test
    public void oneDigitInSequenceTest() throws Exception {
        ArrayList<Integer> testSequence = new ArrayList<>(Arrays.asList(new Integer[]{1}));
        ArrayList<Integer> expectedSequence = new ArrayList<>(Arrays.asList(new Integer[]{1}));
        assertThat(GreatestSequence.findSequence(testSequence), is(expectedSequence));
    }

    @Test
    public void twoDigitsInSequenceTest() throws Exception {
        ArrayList<Integer> testSequence = new ArrayList<>(Arrays.asList(new Integer[]{2, 5}));
        ArrayList<Integer> expectedSequence = new ArrayList<>(Arrays.asList(new Integer[]{2, 5}));
        assertThat(GreatestSequence.findSequence(testSequence), is(expectedSequence));
    }

    @Test
    public void treeDigitsInSequenceTest() throws Exception {
        ArrayList<Integer> testSequence = new ArrayList<>(Arrays.asList(new Integer[]{-1, 1, 8}));
        ArrayList<Integer> expectedSequence = new ArrayList<>(Arrays.asList(new Integer[]{1, 8}));
        assertThat(GreatestSequence.findSequence(testSequence), is(expectedSequence));
    }

    @Test
    public void tenDigitsInSequenceTest() throws Exception {
        ArrayList<Integer> testSequence = new ArrayList<>(Arrays.asList(new Integer[]{-1, 1, 8, 2, -2, -3, 0, 1, 2, 0}));
        ArrayList<Integer> expectedSequence = new ArrayList<>(Arrays.asList(new Integer[]{1, 8, 2}));
        assertThat(GreatestSequence.findSequence(testSequence), is(expectedSequence));
    }

    @Test
    public void timeTest() throws Exception {
        ArrayList<Integer> testSequence = new ArrayList<>(Arrays.asList(new Integer[]{-1, 1, 8, 2, -2, -3, 0, 1, 2, 0}));
        ArrayList<Integer> expectedSequence = new ArrayList<>(Arrays.asList(new Integer[]{1, 8, 2}));
        assertThat(GreatestSequence.findSequence(testSequence), is(expectedSequence));
    }
}
