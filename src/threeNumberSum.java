import java.util.HashSet;

/**
 * Created on 08/Jan/2021 to Three-Number-Sum
 */
public class threeNumberSum {

    //Time Complexity: O(n^2)
    private static void threeSum(int[] nums){

        boolean found = false;
        for(int i = 0; i < nums.length - 1; i++){

            HashSet<Integer> hashMap = new HashSet<Integer>();

            for(int j = i + 1; j < nums.length; j++){
                int x = -(nums[i] + nums[j]);
                if(hashMap.contains(x)){
                    System.out.printf("%d %d %d\n", x,nums[i],nums[j]);
                    found = true;
                }
                else{
                    hashMap.add(nums[j]);
                }
//                System.out.println(hashMap);
            }
        }
        if(found == false){
            System.out.println("No triple found");
        }
    }

    public static void main(String args[]){
        int arr[] = {0, -1, 2, -3, 1, 0};
        threeSum(arr);
    }

}
