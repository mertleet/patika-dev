package Arrays;

public class ArrayFrequence {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] uniqueElements = new int[array.length];
        int[] elementCounts = new int[array.length];
        int uniqueCount = 0;

        for (int i = 0; i < array.length; i++) {
            int currentElement = array[i];
            boolean elementExists = false;


            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueElements[j] == currentElement) {
                    elementExists = true;
                    elementCounts[j]++;
                    break;
                }
            }


            if (!elementExists) {
                uniqueElements[uniqueCount] = currentElement;
                elementCounts[uniqueCount] = 1;
                uniqueCount++;
            }
        }


        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(uniqueElements[i] + " repeats " + elementCounts[i] + " times");
        }
    }
}
