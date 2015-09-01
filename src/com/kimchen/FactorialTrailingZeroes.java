/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kimchen;

/**
 *
 * @author chenk
 */
public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int count = 0;
        long x = 5;
        while(n>=x){
            count+=n/x;
            long newX = x*5;
            if(newX<x)
                break;
            x = newX;
        }
        return count;
    }
}
