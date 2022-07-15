package DSA.Arrays;

public class SpanOfAnArray {
    public static void main(String[] args) {
        int arr[] = {10,15,23,75,69,56};

        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
        }

        System.out.println("Span is " + (max - min));
    }
}
