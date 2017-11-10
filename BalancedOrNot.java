package com.pack.two;

import java.util.Arrays;

public class BalancedOrNot {

	public static void main(String[] args) {
		// its mentioned that > can be replaced by <> but its not mentioned that < can also be replaced by <>.
		//So i am considering this scenario <<<> ,1 to be not balanced
//		String exp[]={"<><"};
//		int mc[]={1};
//		int[] res=bon(exp,mc);
//		for(int i=0;i<mc.length;i++){
//			System.out.print(res[i]);
//		}
		
	}
	static int[] bon(String [] exp, int[] mc){
		int l=mc.length;
		int [] ret=new int[l];
		Arrays.fill(ret, -1);
		int lc=0;
		int gc=0;
		for(int i=0;i<l;i++){
			String s= exp[i];
			int lim= mc[i];
			for(int j=0;j<s.length();j++){
				if(s.charAt(j)=='<'){
					lc++;
				}
				else if(s.charAt(j)=='>'){
					gc++;
				}
				if(gc>lc){
					if(lim<1)
						ret[i]=0;
					else{
						lim--;
						gc--;
						continue;
					}
						
				}
			}
			if(ret[i]!=0 && gc==lc){
				ret[i]=1;
			}
			else{
				ret[i]=0;
			}
		}
		return ret;
	}

	
}
