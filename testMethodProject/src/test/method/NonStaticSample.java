package test.method;

public class NonStaticSample {
	
	public void printLottoNumbers(){
		int[] lott = new int[6];
		int cnt =0;

		for(int i=0; i<lott.length;){
			lott[i]=(int)(Math.random()*45+1);

			for(int j = 0; j<lott.length;j++){
				if(lott[i]==lott[j])
					cnt++;
			}

			if(cnt==1){
				System.out.print(lott[i]+", ");
				i++;
			}
			cnt=0;
		}
		System.out.println();
	}
	
	
	public void outputChar(int i, char j){
		for(int k=0;k<i;k++ )
			System.out.print(j);
		System.out.println();
	}

	public char alphabette(){
		char k = ((int)((Math.random()*20+1)%2)==0)?(char)(Math.random()*23+65):(char)(Math.random()*23+97);
		
		return k;
	}
	
	public String mySubstring(String s, int beg, int end){
		if(beg>end || end-beg==1)
			return null;
		
		return s.substring(beg, end);
	}
	

}
