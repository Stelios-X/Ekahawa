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
//hashmaps collection
public class MapTrick 
{
    public void Telemap()
    {
        HashMap<String, Integer> maplevel = new HashMap<>();
        
        maplevel.put("Car",5);
        maplevel.put("Bank Account", 33738);
        maplevel.put("Home Address", 8888);
        
        System.out.println(maplevel.get("Home Address"));
                
    }
}
