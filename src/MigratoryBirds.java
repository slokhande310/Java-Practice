import java.util.Arrays;

// https://www.hackerrank.com/contests/mountblue-technologies/challenges/migratory-birds
import java.util.HashMap;
import java.util.Map;

public class MigratoryBirds {

    public static int findMostFrequentBird(int[] sightings) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int birdType : sightings) {
            frequencyMap.put(birdType, frequencyMap.getOrDefault(birdType, 0) + 1);
        }

        int maxNoOfBirds = 0;
        int frequentBirdType = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int birdType = entry.getKey();
            int noOfBirds = entry.getValue();

            if (noOfBirds > maxNoOfBirds || (noOfBirds == maxNoOfBirds && birdType < frequentBirdType)) {
                maxNoOfBirds = noOfBirds;
                frequentBirdType = birdType;
            }
        }
        return frequentBirdType;
    }

    public static void main(String[] args) {
        int[] sightings = {1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4}; // Example array
        int mostFrequentBird = findMostFrequentBird(sightings);
        System.out.println("The most frequently sighted bird type is: " + mostFrequentBird);
    }
}



