class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length(), len=0;
        boolean untilspace=false;

        for(int i=n-1;i >=0;i--){
            if(s.charAt(i)!=' '){
                len++;
                untilspace=true;

            }else if(untilspace){
                break;
            }
        }
        return len;
    }
}