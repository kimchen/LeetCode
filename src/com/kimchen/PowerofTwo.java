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
public class PowerofTwo {
    public PowerofTwo(){
        System.out.println(isPowerOfTwo(1024*1024*1024));
    }
    public boolean isPowerOfTwo(int n) {
        if(n<1)
            return false;
        while(n>=2){
            if(n%2!=0)
                return false;
            n/=2;
        }
        return true;
    }
}
