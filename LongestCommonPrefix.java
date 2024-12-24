public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (String str : strs) {
            // Укорачиваем префикс, пока он не совпадает с началом текущей строки
            while (!str.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix solution = new LongestCommonPrefix();

        // Примеры
        System.out.println(solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"})); // "fl"
        System.out.println(solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));   // ""
        System.out.println(solution.longestCommonPrefix(new String[]{"interspecies", "interstellar", "interstate"})); // "inter"
    }
}
