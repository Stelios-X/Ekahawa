/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.omnera.nerapp;

/**
 *
 * @author brandon
 */
public class Apple 
{
    public void find_sum_array(int[] thearray, int sum)
    {
        
        int length = thearray.length;
        
        if(length!=0 && length>1)
        {
            for (int i = 0; i < length; i++) 
            {
                for (int j = i+1; j < length; j++) 
                {
                    if (sum == thearray[i]+ thearray[j]) 
                    {
                        System.out.println("The values are "+thearray[i]+ " and "+thearray[j]+" of indices "+i+" and "+j+ " respectively.");
                    }
 
                }
            }
        }
    }
}
