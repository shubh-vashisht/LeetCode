class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        boolean[] ab = new boolean[groupSizes.length];
        for(int i=0;i<groupSizes.length;i++){
            if(ab[i]){
                continue;
            }
            int k = groupSizes[i];
            int eq = groupSizes[i];
            List<Integer> hala = new ArrayList<Integer>();
            for(int j=i;j<groupSizes.length;j++){
                 if(ab[j]||groupSizes[j]!=eq){
                continue;
            }else if(k==0){
                   break;  
                 }else{
                     hala.add(j);
                     ab[j]=true;
                     k--;
                 }
            }
            list.add(hala);
        }
        return list;
    }
}
