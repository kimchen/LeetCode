/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kimchen;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chenk
 */
public final class PlusOne {
    public PlusOne(){
        
        int[] res = plusOne(new int[]{1,1,7,1,9});
        for(int i:res){
            System.out.println(i);
        }
    }
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            digits[i]+=1;
            if(digits[i]>=10){
                digits[i]%=10;
            }else{
                break;
            }
        }
        return digits;
    }
}
