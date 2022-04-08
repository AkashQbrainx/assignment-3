public class Anangrams {

    public static void findAnagrams(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (b.contains(Character.toString(a.charAt(i)))) count++;
        }
        if (count == a.length()) System.out.println("two strings are anagrams");
    }
}
