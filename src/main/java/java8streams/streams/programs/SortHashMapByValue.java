package java8streams.streams.programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapByValue {
    public static void sortMapByValue(HashMap<String,Integer> hmap){
        LinkedHashMap<String,Integer>  linkhmap =hmap.entrySet().stream()//convert into stream
                .sorted(Map.Entry.comparingByValue())//sort by values
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1, LinkedHashMap::new));
        System.out.println("After Sorting "+linkhmap);
    }
    public static void main(String[] args) {
        // Positive Case: Typical case with different values
        HashMap<String, Integer> positiveCase = new HashMap<>();
        positiveCase.put("Apple", 50);
        positiveCase.put("Banana", 20);
        positiveCase.put("Orange", 30);
        positiveCase.put("Grapes", 40);

        // Negative Case: Map with negative values
        HashMap<String, Integer> negativeCase = new HashMap<>();
        negativeCase.put("Item1", -10);
        negativeCase.put("Item2", -20);
        negativeCase.put("Item3", 0);
        negativeCase.put("Item4", -5);

        // Edge Case: Empty map
        HashMap<String, Integer> edgeCaseEmpty = new HashMap<>();

        // Edge Case: Map with identical values
        HashMap<String, Integer> edgeCaseIdenticalValues = new HashMap<>();
        edgeCaseIdenticalValues.put("Key1", 10);
        edgeCaseIdenticalValues.put("Key2", 10);
        edgeCaseIdenticalValues.put("Key3", 10);


        // Test and print results
        System.out.println("Positive Case:");
        sortMapByValue(positiveCase);

        System.out.println("\nNegative Case:");
        sortMapByValue(negativeCase);

        System.out.println("\nEdge Case (Empty Map):");
        sortMapByValue(edgeCaseEmpty);

        System.out.println("\nEdge Case (Identical Values):");
        sortMapByValue(edgeCaseIdenticalValues);




    }
}
