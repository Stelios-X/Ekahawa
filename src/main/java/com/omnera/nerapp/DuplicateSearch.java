/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.omnera.nerapp;

import java.util.*;

/**
 *
 * @author brandon
 */
public class DuplicateSearch 
{
    //This class searches for the existance of duplicates in a given array
    //First on the lineup Brute Force approach comparing each element in the array to all the other eleemts within the array
    
    public boolean HasDuplicate(int[] nums)
    {
        int x = 0;
        
        for(int i  = 0; i<nums.length; i++)
        {
            for(int j = i+1; j<nums.length; j++)
            {
                if (nums[i] == nums[j])
                {
                    x = 1;
                }
            }
        }
        
        if(x == 1)
        {
            return true;
        }
       else
        {
            return false;
        }
    }
    
    //Sorting approach
    //The array is first sorted before brute force is applied. 
    public boolean ContainsDuplicates(int[] nums)
    {
        Arrays.sort(nums);
        int x = 0;
        
        for(int i = 0; i<nums.length; i++)
        {
            for(int j = i+1; j<nums.length; j++)
            {
                if(nums[i] == nums[j])
                {
                    x=1;
                }
            }
        }
        
        if(x == 1)
        {
            return true;
        }
        else
        {
            return false;
        } 
    }
    
    //Hash set method
    //It iterates through an array chcking if a specific element exists within the arry if not, it adds it to the Hash set.
    //If the element in question does exist in the array, it returms true. If it goes throug the entire has set and gets no hits, it returns false
    
    public void HashTester()
    {
        // This is a sidebar
        HashSet<Integer> akrabu = new HashSet<Integer>();
        akrabu.add(8);
        akrabu.add(7);
        akrabu.add(3);
        Iterator<Integer> ret= akrabu.iterator();
        while(ret.hasNext())
        {
            System.out.print("The answer is "+ret.next()+" -- "+ret.next()+" -- " +ret.next());
        }
        
    }
    
    //Impementation of HashSet 
    public void ContainsDup_HS(int[] nums)
    {
        int x = 0;
        HashSet<Integer> numero = new HashSet<>();
        for(int num : nums)
        {
           if(numero.contains(num))
           {
               x = 1;
           }
           numero.add(num);
        } 
        
        if(x == 1)
        {
          System.out.print("+++++That's a positive on duplictes");  
         // return true;
        }
       else
        {
          System.out.print("-----Negative on duplicates");
          //return false;
        }    
    }
    
    //HashMap implementation
    public boolean HashMapper(int[] nums)
    {
        int x = 0;
        HashMap<Integer, Integer> themap = new HashMap<>();
        
        for(int num : nums)
        {
            if(themap.containsKey(num) && themap.get(num)>=1)
            {
              x = 1;   
            }
         themap.put(num, themap.getOrDefault(num, 0) +1);    
        }
       
        if(x == 1)
        {
            //System.out.println("++++++Duplicates are present!");
            return true;
        }
       else
        {
            //System.out.println("-----Duplicates are ABSENT!");
            return false;
        }
        
    }
    
    
        
}
