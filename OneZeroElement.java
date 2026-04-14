public class OneZeroElement {
    public static void main(String[] args) {

        int[] a = {7, 3, 48, 101, 100, 40, 38};

        for (int num : a) {
            String s = String.valueOf(num);
            int count = 0;

            for (char c : s.toCharArray()) {
                if (c == '0') {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(num);
            }
        }
    }
}