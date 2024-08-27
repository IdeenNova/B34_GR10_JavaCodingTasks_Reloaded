package codingTasks.alina.week6;

public class FindMaximum {


    //Write a method that can find the maximum number from an int Array
    public static void main(String[] args){

        int[] nums = {1,5,7,9,17,2};
        int max = 0;

        for(int i =0; i<nums.length;i++ ){
            if(nums[i]>max){
                max=nums[i];

            }
        }
        System.out.println(max);
    }
}