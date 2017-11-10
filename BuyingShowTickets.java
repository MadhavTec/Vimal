package com.pack.two;

public class BuyingShowTickets {
public static void main(String[] args) {
	int [] greed={1,3,3};
	System.out.println(time(greed,2));
}
static int time(int greed[], int p){
	int ret=1;
	int l= greed.length;
	ret=greed[p]*l;
	ret-=l-p;
	ret+=1;
	for(int i=0;i<l;i++){
		if(i!=p){
			if(greed[i]<greed[p]){
				ret-=greed[p]-greed[i];
			}
		}
	}
	return ret;
}
}
