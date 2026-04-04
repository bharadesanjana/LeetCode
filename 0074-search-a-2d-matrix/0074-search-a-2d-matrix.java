class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m= matrix.length;
        int n= matrix[0].length;
        if(m==0) return false;
        int start =0, end=m*n-1;
        while(start<=end){
            int mid=(start+end)/2;
            int ele =matrix[mid/n][mid%n];
            if(target==ele){
                return true;
            }else if(target < ele){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return false;
    }
}