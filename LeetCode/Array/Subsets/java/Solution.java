class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>>result=new ArrayList<>();
      List<Integer>list=new ArrayList<>();
      findsubset(nums,0,list,result);
      return result;
    }
    public static void findsubset(int arr[],int index,List<Integer>list,List<List<Integer>>result){
        if(arr.length==index){
            result.add(new ArrayList<>(list));
            return;
        }
        findsubset(arr,index+1,list,result);
        list.add(arr[index]);
        findsubset(arr,index+1,list,result);
        list.remove(list.size()-1);
    }
}