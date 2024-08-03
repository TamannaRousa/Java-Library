package Strings;

import java.util.Arrays;

// import java.util.*;
public class annagrams {
    public static void main(String[] args){
        String str1 = "care";
        String str2 = "race";

        //convert string to lowercase so that separately dont have to check for upper &lower
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        

        //1.if same lengths
        if(str1.length() == str2.length()){
          //convert string to character Array(sort)
          char[] str1charArray = str1.toCharArray();
          char[] str2charArray = str2.toCharArray();

          //sort the char array
          Arrays.sort(str1charArray);
          Arrays.sort(str2charArray);

          //if sorted char array are same then annagrams
          boolean result = Arrays.equals(str1charArray, str2charArray);
          if(result){
            System.out.println(str1 + " and " + str2 + " are anagrams of each other");
          }
          else{
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
          }
        }
        else{
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
        }
}
}
