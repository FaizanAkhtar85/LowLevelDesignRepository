package MyPackage;
import java.util.*;

public class GroupContinuousSequences {

    public static void main(String[] args) {
        Set<Set<Integer>> inputSets = new LinkedHashSet<>();
        inputSets.add(Set.of(35, 39, 40));
        inputSets.add(Set.of(38, 40));
        inputSets.add(Set.of(35, 36, 39, 40));
        inputSets.add(Set.of(36, 37, 38, 39, 40));

        for (Set<Integer> originalSet : inputSets) {
            List<Set<Integer>> result = groupContinuousSequences(originalSet);
            System.out.println("Input Set: " + originalSet);
            for (Set<Integer> group : result) {
                System.out.println("Group: " + group);
            }
            System.out.println();
        }
    }

    private static List<Set<Integer>> groupContinuousSequences(Set<Integer> originalSet) {
        List<Set<Integer>> result = new ArrayList<>();

        // Assuming the elements in the original set are sorted
        Integer[] elements = originalSet.toArray(new Integer[0]);
        Set<Integer> currentGroup = new HashSet<>();

        for (int i = 0; i < elements.length; i++) {
            int current = elements[i];

            if (i < elements.length - 1 && elements[i + 1] == current + 1) {
                // Current element and the next one form a continuous sequence
                currentGroup.add(current);
            } else {
                // Current element is not part of a continuous sequence
                currentGroup.add(current);
                result.add(new HashSet<>(currentGroup));
                currentGroup.clear();
            }
        }

        return result;
    }
}


