package main;

import java.util.ArrayList;
import java.util.Collections;

public class ComValue {

	public void compareV(ArrayList arr) {
		// TODO Auto-generated method stub
		int sum=0;
		int count1=0,count2=0,count3=0,count4=0,count5=0;
		//ƽ��ֵ
		for(int i=0;i<arr.size();i++) {
			sum+=(int) arr.get(i);		
		}		
		System.out.println("ƽ��ֵ: " + sum/arr.size());
		//�����Сֵ
		System.out.println("���ֵ: " + Collections.max(arr));
		System.out.println("��Сֵ: " + Collections.min(arr));
		//ͳ������
		for(int i=0;i<arr.size();i++) {
			if((int)(arr.get(i))>=0&&(int)(arr.get(i))<20) {
				count1++;
				System.out.println("�ɼ����ڵ���0С��20����:"+count1+"��");
			}else if((int)(arr.get(i))>=20&&(int)(arr.get(i))<40) {
				count2++;
				System.out.println("�ɼ����ڵ���20С��40����:"+count2+"��");
			}else if((int)(arr.get(i))>=40&&(int)(arr.get(i))<60) {
				count3++;
				System.out.println("�ɼ����ڵ���40С��60����:"+count3+"��");
			}else if((int)(arr.get(i))>=60&&(int)(arr.get(i))<80) {
				count4++;
				System.out.println("�ɼ����ڵ���60С��80����:"+count4+"��");
			}else if((int)(arr.get(i))>=80&&(int)(arr.get(i))<100) {
				count5++;
				System.out.println("�ɼ����ڵ���80С��100����:"+count5+"��");
			}
			
		}
	}

}
