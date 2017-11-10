package com.pack.two;

public class ConsecutiveSum {
	public static void main(String[] args) {
		System.out.println(cs(15));
	}

	private static int cs(int num) {
		if (num <= 0 || (num & (num - 1)) == 0) {return 0;}
		int ret = 0;int sp=1;int ep=0;
		ep=num/2;
		if(num%2==0)ep-=1;
		else ep+=1;
		while(sp!=ep){
			int t=0;
			for(int i=sp;i<=num;i++){
				t+=i;
				if(t==num){
					ret++;
					break;
				}
				else if(t>num){
					break;
				}
			}
			sp++;
			
		}
		return ret;
	}
}