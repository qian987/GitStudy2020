package main;

import java.util.ArrayList;
import java.util.Collections;

public class ComValue {

	public void compareV(ArrayList arr) {
		// TODO Auto-generated method stub
		int sum=0;
		int count1=0,count2=0,count3=0,count4=0,count5=0;
		//平均值
		for(int i=0;i<arr.size();i++) {
			sum+=(int) arr.get(i);		
		}		
		System.out.println("平均值: " + sum/arr.size());
		//最大、最小值
		System.out.println("最大值: " + Collections.max(arr));
		System.out.println("最小值: " + Collections.min(arr));
		//统计区间
		for(int i=0;i<arr.size();i++) {
			if((int)(arr.get(i))>=0&&(int)(arr.get(i))<20) {
				count1++;
				System.out.println("成绩大于等于0小于20的有:"+count1+"个");
			}else if((int)(arr.get(i))>=20&&(int)(arr.get(i))<40) {
				count2++;
				System.out.println("成绩大于等于20小于40的有:"+count2+"个");
			}else if((int)(arr.get(i))>=40&&(int)(arr.get(i))<60) {
				count3++;
				System.out.println("成绩大于等于40小于60的有:"+count3+"个");
			}else if((int)(arr.get(i))>=60&&(int)(arr.get(i))<80) {
				count4++;
				System.out.println("成绩大于等于60小于80的有:"+count4+"个");
			}else if((int)(arr.get(i))>=80&&(int)(arr.get(i))<100) {
				count5++;
				System.out.println("成绩大于等于80小于100的有:"+count5+"个");
			}
			
		}
	}

}
