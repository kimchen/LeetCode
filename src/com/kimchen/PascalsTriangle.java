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
public class PascalsTriangle {
    public PascalsTriangle(){
        System.out.println(generate(5));
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        int i = 0;
        List<Integer> last = null;
        while(i<numRows){
            List<Integer> temp = new ArrayList<>();
            if(last == null){
                temp.add(1);
                
            }else{
                for(int j=0; j<last.size()+1; j++){
                    if(j == 0 || j == last.size()){
                        temp.add(1);
                    }
                    if(j+1<last.size()){
                        temp.add(last.get(j) + last.get(j+1));
                    }
                }
            }
            list.add(temp);
            last = temp;
            i++;
        }
        return list;
    }
}
