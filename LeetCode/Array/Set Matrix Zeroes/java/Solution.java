class Solution {
    public void setZeroes(int[][] arr) {
         int m = arr.length;
        int n = arr[0].length;
        boolean row[] = new boolean[m];
        boolean col[] = new boolean[n];

        // Find zero positions
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {

                if(arr[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // Set entire rows and columns to zero
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {

                if(row[i] || col[j]) {
                    arr[i][j] = 0;
                }
            }
        }
          for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}