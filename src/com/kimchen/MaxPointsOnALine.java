package com.kimchen;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class MaxPointsOnALine {
	public MaxPointsOnALine(){
		Point[] ps = new Point[]{new Point(2, 3),new Point(3, 3),new Point(-5, 3)};
		maxPoints(ps);
	}
	public int maxPoints(Point[] points){
		if(points.length == 0)
			return 0;
		int result = 0;
		Hashtable<Float, Integer> table = new Hashtable<Float, Integer>();
		for(int i = 0 ; i<points.length ; i++){
			table.clear();
			Point p1 = points[i];
			int sameNum = 0;
			int tempRes = 1;
			for(int j = i+1 ; j <points.length ; j++){
				Point p2 = points[j];
				Point p = new Point(p2.x - p1.x, p2.y - p1.y);
				if(p.x == 0 && p.y == 0){
					sameNum++;
					continue;
				}
				float f = Float.MAX_VALUE;
				if(p.x != 0)
					f = (float)p.y/(float)p.x;
				if(f == -0)
					f = 0;
				int temp = 0;
				if(table.containsKey(f)){
					table.put(f, table.get(f) + 1);
					temp = table.get(f);
				}else{
					table.put(f, 2);
					temp = 2;
				}
				if(temp > tempRes)
					tempRes = temp;
			}
			if((sameNum + tempRes) > result)
				result = sameNum + tempRes;
		}
		return result;
	}
}
class Point{
	int x;
	int y;
	Point(){x=0;y=0;}
	Point(int a,int b){x=a;y=b;}
}
