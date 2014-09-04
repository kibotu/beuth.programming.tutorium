package de.bht.programming1.exercise05;

public class XOR {

    public static void swappedFast(int[] swapMe) {
        swapMe[0] = swapMe[0] ^ swapMe[1];
        swapMe[1] = swapMe[0] ^ swapMe[1];
        swapMe[0] = swapMe[0] ^ swapMe[1];
    }

    private static int tmp;

    public static void swappedSlow(int[] swapMe) {
        tmp = swapMe[0];
        swapMe[0] = swapMe[1];
        swapMe[1] = tmp;
    }

    public static void main(String[] args) {

        int loops = Integer.MAX_VALUE;
        for (int loop = 0; loop < loops; ++loop) {

            int[] swapMe = new int[]{0, 1};

            long startTime = System.currentTimeMillis();
            for (int i = 0; i < loops; ++i) {
                swappedFast(swapMe);
            }
            long endTime = System.currentTimeMillis() - startTime;

            long startTime2 = System.currentTimeMillis();
            for (int i = 0; i < loops; ++i) {
                swappedSlow(swapMe);
            }
            long endTime2 = System.currentTimeMillis() - startTime2;

            System.out.println("Fast: " + endTime + " Slow: " + endTime2 + " bei " + loops + " durchlaufen");
        }
    }
}
