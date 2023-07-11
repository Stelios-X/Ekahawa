/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.omnera.nerapp;

import java.util.HashMap;

/**
 *
 * @author brandon
 */
//This approach entails the use of HashMaps in solving the two sum problem. Where given a target of a sum and an array
//Determine whether or not there is a pair within the array that adds up to that sum
public class TwoSum 
{
    public boolean FindTwoSum(int[] arr, int target)
    {
        int x = 0;
        //Definition of a HashMap
        HashMap<Integer, Integer> newmap = new HashMap<>();
        //Assignment of the Hash Map
        for(int i = 0; i < arr.length; i++)
        {
            newmap.put(i, arr[i]); 
        }
        
        //Search for target
        for(int element : arr)
        {
            int compliment = target - element;
             if(newmap.containsValue(compliment))
             {
                 x = 1;
             }
        }
        

        if(x == 1)
        {
         //System.out.print("Target exists");   
         return true;
        }
       else
       {
        //System.out.print("Negative on the target");
        return false;
       }

    }
}
