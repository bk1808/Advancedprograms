package tp_sortingZerosAndIntegers;

import java.util.Arrays;

public class pushZeroToEnd {

	public static void main(String[] args) {
		int a[]= {0,3,0,1,2,0,4,0,5,0,0,9,9,8};
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				for(int j=i+1;j<a.length;j++) {
					if(a[j]!=0) {
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
						break;
					}
				}
			}
			
		}
		System.out.println(Arrays.toString(a));
	}
}
