/**
 *
 * @author User
 *
 */
public class Sort {
    /**
     *
     * @param args ignored
     */
    public static void main(String[] args) {
        int[] arr = new int[args.length - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(args[i + 1]);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    arr[j] += arr[i];
                    arr[i] = arr[j] - arr[i];
                    arr[j] = arr[j] - arr[i];
                }
            }
        }
        if (args[0].equals("asc")) {
            for (int i = 0; i < arr.length; i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(arr[i]);
            }
        } else {
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i]);
                if (i > 0) {
                    System.out.print(" ");
                }
            }
        }
    }
}