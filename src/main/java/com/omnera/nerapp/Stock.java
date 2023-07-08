/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.omnera.nerapp;

/**
 *
 * @author brandon
 */
public class Stock 
{
    public int MaxProfit(int[] prices)
    {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        int maxProfit = 0;
        
        for(int i = 0; i < prices.length; i++ )
        {
            if(prices[i] < minPrice)
            {
                minPrice = prices[i];
            }
            profit = prices[i] - minPrice;
            
            if(profit > maxProfit)
            {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
