package ncs.test4;

public class TestSort {

	public static void main(String[] args) {
		int[] su = new int[10];
		int tmp=0;
		
		for(int i=0;i<su.length;i++){
			su[i]=(int)(Math.random()*50+51);
		}
		
		for(int i=0;i<su.length;i++){
			for(int j=i; j<su.length;j++){
				if(su[i]>su[j]){
					tmp = su[i];
					su[i]=su[j];
					su[j]=tmp;
				}
			}
			System.out.print(su[i]+", ");
		}		

	}

}
