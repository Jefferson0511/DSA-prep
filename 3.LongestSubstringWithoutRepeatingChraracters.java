class Solution {
    /*
    Brute force: 
    1. Check for every single subsrting
    2. Use hashset to check for duplicates easily
    3. if the current substring length is greater than the max observed before, then update
    */
    
    public int lengthOfLongestSubstring(String s) {
        // int max=0;
        // for(int i=0;i<s.length();i++){
        //     Set<Character> seen= new HashSet<>();
        //     for(int j=i;j<s.length();j++){
        //         if(seen.contains(s.charAt(j))){
        //             break;
        //         }
        //         seen.add(s.charAt(j));
                
        //     }
        //     if(seen.size()>max){
        //         max=seen.size();
        //     }
        // }
        // return max;

        int left=0;
        Set<Character> seen= new HashSet<>();
        int max=0;

        for(int right=0;right<s.length();right++){
            while (seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));

            if(seen.size()>max){
                max=seen.size();
            }
        }
        return max;
    }
}