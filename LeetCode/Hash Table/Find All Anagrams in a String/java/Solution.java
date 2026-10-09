class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer>list=new ArrayList<>();
        int left=0;
        int freq[]=new int[26];
        int windowsize[]=new int[26];
        if(p.length()>s.length()){
            return list;
        }
        for(int i=0;i<p.length();i++){
            freq[p.charAt(i)-'a']++;
            windowsize[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq,windowsize)){
            list.add(left);
        }
        for(int right=p.length();right<s.length();right++){
            windowsize[s.charAt(right)-'a']++;
            windowsize[s.charAt(left)-'a']--;
            left++;
            if(Arrays.equals(freq,windowsize)){
                list.add(left);
            }
        }
        return list;
    }
}