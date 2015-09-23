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
public class FirstBadVersion {
    public FirstBadVersion(){
        System.out.println(firstBadVersion(2126753390));
    }
    public int firstBadVersion(int n) {
        long res = 0;
        long fir = 1;
        long end = n;
        long temp = (fir+end)/2;
        while(temp>0){
            if(temp == fir){
                if(isBadVersion((int)temp))
                    res = fir;
                else
                    res = end;
                break;
            }
            if(isBadVersion((int)temp)){
                end = temp;
            }else{
                fir = temp;
            }
            
            temp = (fir+end)/2;
        }
        return (int)res;
    }
    
    boolean isBadVersion(long version){
        if(version >= 1702766719)
            return true;
        return false;
    }
}
