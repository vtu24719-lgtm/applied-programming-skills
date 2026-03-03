class Solution {
    
    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || 
               c == 'o' || c == 'u';
    }
    
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int count = 0;
        
        for (int i = 0; i < n / 2; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }
        
        for (int i = n / 2; i < n; i++) {
            if (isVowel(s.charAt(i))) {
                count--;
            }
        }
        
        return count == 0;
    }
}
