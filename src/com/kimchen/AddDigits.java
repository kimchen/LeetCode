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
public class AddDigits {
    public int addDigits(int num) {
        if(num < 10)
            return num;
        int res = 0;
        while(num >= 10){
            res += num%10;
            num /= 10;
        }
        res += num;
        return addDigits(res);
    }
}
