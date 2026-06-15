class Solution {
    public boolean isAnagram(String s, String t) {

       if(s.length() != t.length()){
            return false;
        }

//Convert Strings to Char Arrays
char[] arr1 = s.toCharArray();
char[] arr2 = t.toCharArray();

//Sorting the arrays

Arrays.sort(arr1);
Arrays.sort(arr2);

return Arrays.equals(arr1,arr2);




    }
}
