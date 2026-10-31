class Solution {
    public String longestCommonPrefix(String[] strs) {
       StringBuilder sb=new StringBuilder();
       Arrays.sort(strs);
       char c[]=strs[0].toCharArray();
       char c1[]=strs[strs.length-1].toCharArray();
       for(int i=0;i<strs[0].length();i++){
        if(c[i]==c1[i]){
            sb.append(c[i]);
         }
         else{
            break;
         }
       }
       return sb.toString();
        
    }
}