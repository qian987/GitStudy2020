package main;

import java.util.ArrayList;

public class Sort {

	public void getSort(ArrayList arr) {
		// TODO Auto-generated method stub
		arr.sort(null);
		for(int i = 0 ; i<arr.size();i++){
			System.out.print(arr.get(i)+" ");
		}
	}
}
