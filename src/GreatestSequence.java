import java.util.ArrayList;
import java.util.List;

/**
 * Created by employee on 7/8/16.
 */
public class GreatestSequence {

    public static List<Integer> findSequence(List<Integer> input) {
        List<Integer> result = new ArrayList<Integer>();


        if (input == null || input.size() == 0) {
            return new ArrayList<>();
        }
        if (input.size() == 1) {
            return input;
        }
        int maxSumCurrent = input.get(0);
        int maxSumInNextVariant = input.get(0);
        int firstIndexCurrentMaxSum = 0;
        int lastIndexCurrentMaxSum = 0;
        int firstIndexNextVariantMaxSum = 1;
        int lastIndexNextVariantMaxSum = 0;

        while (firstIndexNextVariantMaxSum <= input.size()) {

            if (firstIndexNextVariantMaxSum != input.size()) {
                for (int i = firstIndexNextVariantMaxSum; i < input.size(); i++) {
                    if (maxSumInNextVariant + input.get(i) >= maxSumInNextVariant) {
                        maxSumInNextVariant += input.get(i);
                        lastIndexNextVariantMaxSum = i;
                    } else {
                        break;
                    }
                }
            } else {
                maxSumInNextVariant = input.get(firstIndexNextVariantMaxSum - 1);
                if (maxSumInNextVariant > maxSumCurrent) {
                    maxSumCurrent = maxSumInNextVariant;
                    firstIndexCurrentMaxSum = firstIndexNextVariantMaxSum - 1;
                    lastIndexCurrentMaxSum = firstIndexCurrentMaxSum;
                }
                break;
            }

            if (maxSumInNextVariant > maxSumCurrent) {
                maxSumCurrent = maxSumInNextVariant;
                firstIndexCurrentMaxSum = firstIndexNextVariantMaxSum - 1;
                lastIndexCurrentMaxSum = lastIndexNextVariantMaxSum;
            }


            firstIndexNextVariantMaxSum++;

            lastIndexNextVariantMaxSum = firstIndexNextVariantMaxSum;
            maxSumInNextVariant = input.get(firstIndexNextVariantMaxSum - 1);

        }
        if (maxSumCurrent < 0) {
            result = input.subList(firstIndexCurrentMaxSum, lastIndexCurrentMaxSum);
        } else {
            result = input.subList(firstIndexCurrentMaxSum, lastIndexCurrentMaxSum + 1);
        }

        return result;
    }
}
