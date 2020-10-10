package main;

import java.util.ArrayList;

public class Rate {
	public  void getRate(ArrayList arr) {
		// TODO Auto-generated method stub
		int count = 0;
		double rate = 0;
		for(int i = 0 ; i < arr.size();i++) {
			if((int)arr.get(i)>=60)
				 count++;
			
		}
		rate =(double)count/arr.size();
		System.out.println("及格率为："+rate);
	}

}
