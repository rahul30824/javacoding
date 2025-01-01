import java.util.HashMap;

class Main {
    public static boolean solution(String s1, String s2) {
        if (s1.length() > s2.length()) {
            System.out.println("No permutation of s1 found in s2");
            return false;
        }

        // Maps to track character frequencies
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> have = new HashMap<>();

        // Populate the `need` map
        for (char c : s1.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int start = 0;
        int end = 0;

        while (end < s2.length()) {
            char c = s2.charAt(end);

            if (!need.containsKey(c)) {
                end++;
                start = end;
                have.clear();
                continue;
            }

            // Update the `have` map
            have.put(c, have.getOrDefault(c, 0) + 1);

            // Shrink the window if needed
            while (have.get(c) > need.get(c)) {
                char startChar = s2.charAt(start);
                have.put(startChar, have.get(startChar) - 1);
                start++;
            }

            // Check for valid permutation
            if (end - start + 1 == s1.length()) {
                System.out.println("Found permutation of s1 in s2");
                return true;
            }

            end++;
        }

        System.out.println("No permutation of s1 found in s2");
        return false;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        solution(s1, s2);
    }
}
