
public class TheLift {

    public static boolean isEqualOutput(int[] x, int[] y) {
        if (x.length != y.length)
            return false;

        for (int i = 0; i < x.length; i++)
            if (x[i] != y[i])
                return false;

        return true;
    }

    public static int[] theLift(final int[][] queues, final int capacity) {
        // Your code here

        for (int i = 0; i < queues.length; i++) {
            System.out.println(queues[i]);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        final int[][] queues = { new int[0], // G
                new int[0], // 1
                new int[] { 5, 5, 5 }, // 2
                new int[0], // 3
                new int[0], // 4
                new int[0], // 5
                new int[0], // 6
        };
        final int[] result = theLift(queues, 5);
        System.out.println("Valid? : " + isEqualOutput(result, new int[] { 0, 2, 5, 0 }));

    }

}