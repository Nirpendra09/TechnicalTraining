package DSA.Arrays;

public class FrequencyInUnsortedArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,2,1,5,6,5,3,2,8,2,5,6,7,8,4};

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i])
                max = arr[i];
        }

        int freq[] = new int[max+1];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if(freq[i] != 0) {
                System.out.println(i + " - " + freq[i]);
            }
        }
    }
}
