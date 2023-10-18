import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void shuffleArray(arr) {
        int n = arr.length;
        Random random = new Random();

        for (int i = n - 1; i > 0; i--) {
            
			int j = random.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
