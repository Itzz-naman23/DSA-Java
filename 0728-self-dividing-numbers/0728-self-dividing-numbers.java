class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> output = new ArrayList<>();

        for(int i=left;i<=right;i++){
            if(helper(i))output.add(i);
        }
        return output;
    }

    public boolean helper(int num){

        int temp = num;
        while(temp>0){
            int curr = temp%10;
            if(curr==0 || num%curr!=0)return false;
            temp/=10;
        }
        return true;
    }
}