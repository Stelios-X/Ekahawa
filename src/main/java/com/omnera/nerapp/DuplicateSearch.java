/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.omnera.nerapp;

/**
 *
 * @author brandon
 */
public class DuplicateSearch 
{
    //This class searches for the existance of duplicates in a given array
    //First on the lineup Brute Force approach
    
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
    
}
