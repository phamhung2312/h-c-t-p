/*************************************************
 * 
 * Execution: java RandomInt N k
 * 
 * Prints k pseudo-random integers between 0 and N-1.
 * 
 * @version 1.0
 *
 **************************************************/
public class RandomInt {

    /**
     * Print some pseudo-random integers in a given interval
     * 
     * @param args[0] determines the interval of each pseudo-random integer
     * @param args[1] gives the number of generated pseudo-random integers
     */
    public static void main(String[] args) {
        // a positive integer
        int n = 3;
        int k = Integer.parseInt(args[0]);
        int ss0 = 0;
        int ss1 = 0;
        int ss2 = 0;
        int[] count0 = new int[500];
        int[] count1 = new int[500];
        int[] count2 = new int[500];
        for (int j = 0; j < 500; j++) {
            ss0 = 0;
            ss1 = 0;
            ss2 = 0;
            for (int i = 0; i < k; i++) {
                switch (random(n)) {
                    case 0:
                        ss0++;
                        break;
                    case 1:
                        ss1++;
                        break;
                    case 2:
                        ss2++;
                        break;

                }
            }
            count0[j] = ss0;
            count1[j] = ss1;
            count2[j] = ss2;
        }
        System.out.println("so so 0 la:" + ss0);
        System.out.println("so so 1 la:" + ss1);
        System.out.println("so so 2 la:" + ss2);
        System.out.println("count0 la: " + meanArray(count0));
        System.out.println("count1 la: " + meanArray(count1));
        System.out.println("count2 la: " + meanArray(count2));
    }

    /**
     * A function returning a pseudo-random integer
     * 
     * @param n linh tinh
     * @return linh tinh
     */
    public static int random(int n) {
        // a pseudo-random real between 0.0 and 1.0
        double r = Math.random();
        return (int) (r * n);
    }

    public static double meanArray(int mean[]) {
        double sum1 = 0;
        int n = mean.length;
        for (int i = 0; i < n; i++) {
            sum1 += mean[i];
        }
        return sum1 / n;

    }

    /*
     * We can choose to write directly :
     * return (int) (Math.random() * n);
     */

}
