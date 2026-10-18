class Solution {
    public String minWindow(String s, String t) {
        int freq[]=new int[128];
        int left=0;
        int start=0;
        int count=t.length();
        int min=Integer.MAX_VALUE;
        for(char c:t.toCharArray()){
            freq[c]++;
        }
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(freq[ch]>0){
                count--;
            }
            freq[ch]--;
            while(count==0){
                int len=right-left+1;
                if(len<min){
                    min=len;
                    start=left;
                }
                char chh=s.charAt(left);
                freq[chh]++;
                if(freq[chh]>0){
                    count++;
                }
                left++;
            }
        }
        if(min==Integer.MAX_VALUE){
            return "";
        }
        else{
            return s.substring(start,start+min);
        }
    }
}