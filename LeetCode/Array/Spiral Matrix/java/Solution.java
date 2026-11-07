class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
       ArrayList<Integer> list=new ArrayList<>();
       int sr=0,er=mat.length-1;
       int sc=0,ec=mat[0].length-1;
       while(sr<=er && sc<=ec){
        for(int i=sc;i<=ec;i++){
            list.add(mat[sr][i]);
        }
        sr++;
        for(int i=sr;i<=er;i++){
            list.add(mat[i][ec]);
        }
        ec--;
        if(sr<=er){
            for(int i=ec;i>=sc;i--){
                list.add(mat[er][i]);
            }
            er--;
        }
        if(sc<=ec){
            for(int i=er;i>=sr;i--){
                list.add(mat[i][sc]);
            }
            sc++;
        }
       }
       return list;

    }
}