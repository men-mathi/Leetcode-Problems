class Solution {
    public String reverseVowels(String s) {
        char arr[]=s.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right){
            while(left<right && !vowel(arr[left])){
                left++;
            }
            while(left<right && !vowel(arr[right])){
                right--;
            }
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
    }
    public static boolean vowel(char c){
         c=Character.toLowerCase(c);
        return c=='i'||c=='a'||c=='e'||c=='o'||c=='u';
    }
}