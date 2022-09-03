public class MaxMinFinder {
    int max;
    int min;

    public void findMaxMin(int[] array) {

        max = array[0];
        min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }


        }
        System.out.println("max = "+max);
        System.out.println("min = "+min);

    }
}