

public class ContainsDuplicates {
    /**
     * Determine if an array of items contains any duplicate values. You should use a Set for this: remember that
     * Sets can not have duplicate values, but you may check if a value is already contained using the .contains method.
     * @param nums an array of ints.
     * @return true if nums contains any duplicate values, false if it does not.
     */
    public boolean containsDuplicate(int[] nums){
        boolean ret = false;

        int check = nums[0];
       for (int i = 0; i < nums.length; i ++){
         if (ret == true){
           for (int test = 1; test < nums.length; test++ )            {
            if (check == nums[test]){
              return ret = true;
             } 
           }
        }else{
            return ret = false;
           }
        
  } 
  return ret;

       
    }
}
