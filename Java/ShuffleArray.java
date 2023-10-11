package array;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};

        
        shuffleArray(array);

        
        System.out.println(Arrays.toString(array));
    }

    public static void shuffleArray(Integer[] array) {
        Random rand = new Random();

        for (int i = array.length - 1; i > 0; i--) {
           
            int randomIndex = rand.nextInt(i + 1);

            // Swap the elements at randomIndex and i
            int temp = array[randomIndex];
            array[randomIndex] = array[i];
            array[i] = temp;
        }
    }
}
