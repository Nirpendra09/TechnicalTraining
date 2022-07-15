package DSA.Arrays;

public class FrequencyOfInSortedArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 20, 30, 30, 30, 40, 40, 50, 50, 50, 50};

        int cur = arr[0];
        int freq = 1;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == cur) {
                freq++;
            }
            else {
                System.out.println(cur + " " + freq);
                cur = arr[i];
                freq = 1;
            }
        }
        System.out.println(cur + " " + freq);
    }
}
