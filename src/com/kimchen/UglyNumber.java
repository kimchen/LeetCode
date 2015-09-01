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
public class UglyNumber {
    public boolean isUgly(int num) {
        if(num == 0)
            return false;
        if(num == 1)
            return true;
        if(num%2 == 0)
            return isUgly(num/2);
        if(num%3 == 0)
            return isUgly(num/3);
        if(num%5 == 0)
            return isUgly(num/5);
        return false;
    }
}
