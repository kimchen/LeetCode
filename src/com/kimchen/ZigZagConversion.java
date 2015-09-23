package com.kimchen;

import com.sun.corba.se.impl.copyobject.ORBStreamObjectCopierImpl;
import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {

    public ZigZagConversion() {
        System.out.println(convert("A", 1));
    }

    public String convert(String s, int numRows) {
        String res = "";
        if(numRows == 1)
            return s;
        for (int i = 0; i < numRows; i++) {
            int j = 0;
            int index;
            while (true) {
                index = j * (numRows * 2 - 2) + i;
                if (index >= s.length()) {
                    break;
                }
                res += s.charAt(index);

                if (i != 0 && i != numRows - 1) {
                    index = (numRows - i - 1) * 2 + index;
                    if (index >= s.length()) {
                        break;
                    }
                    res += s.charAt(index);
                }

                j++;
            }

        }
        return res;
    }
}
