public class DivisionString {

    public static void isPossible(String str) {

        int n = str.length();
        int i;
        for (i =2; i<n/2; i++) {
            if (n % i == 0) {
                System.out.println("division is possible");
                break;
            }
        }
        if (i ==n/2) {
            System.out.println("division is not possible");
        }


    }
}
