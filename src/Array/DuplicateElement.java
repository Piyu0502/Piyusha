package Array;

    public class DuplicateElement {
        public static void main(String[] args) {
            int[] arr = new int[]{1, 1, 5, 1, 9, 8, 6, 7, 5, 4};
            System.out.println("Duplicate elements in given array: ");
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 4; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.println(arr[j]);
                        break;
                    }
                }
            }
        }
    }