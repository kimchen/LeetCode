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
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] sa = new int[26];
        int[] ta = new int[26];
        for(int i=0;i<s.length();i++){
            char sc = s.charAt(i);  
            sa[sc-'a'] ++;
        }
        for(int i=0;i<t.length();i++){
            char tc = t.charAt(i);
            ta[tc-'a'] ++;
        }
        
        for(int i=0;i<26;i++){
            if(sa[i]!=ta[i])
                return false;
        }

        return true;
    }
}
