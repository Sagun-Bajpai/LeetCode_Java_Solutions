/*28=Given two strings needle and haystack, return the index of the first occurrence of needle
 in haystack, or -1 if needle is not part of haystack. */
class Index_First_Occurrence_String {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null)
            return -1;
        if (needle.length() == 0)
            return 0;
        int h = haystack.length();
        int n = needle.length();
        if (h < n)
            return -1;
        for (int i = 0; i <= h - n; i++) {
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}