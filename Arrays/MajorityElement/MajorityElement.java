import java.util.*;
class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        int n = arr.length;
        // double x = Math.floor(n/3);
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num : arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for( Map.Entry<Integer,Integer> entry : freq.entrySet()){
            if(entry.getValue() > n/3){
                result.add(entry.getKey());
            } 
        }
        Collections.sort(result);
        return result;
        
    }
}
