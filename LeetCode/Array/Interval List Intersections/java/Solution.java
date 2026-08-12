class Solution {
    public int[][] intervalIntersection(int[][] fl, int[][] sl) {
        int i=0;
        int j=0;
        ArrayList<int[]>ans=new ArrayList<>();
        while(i<fl.length && j<sl.length){
            int start=Math.max(fl[i][0],sl[j][0]);
            int end=Math.min(fl[i][1],sl[j][1]);
        
        if(start<=end){
            ans.add(new int[]{start,end});
        }
        if(fl[i][1]<sl[j][1]){
             i++;
        }
        else{
            j++;
        }
    }
    return ans.toArray(new int[ans.size()][]);
    }
}