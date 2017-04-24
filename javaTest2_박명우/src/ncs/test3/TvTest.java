package ncs.test3;

public class TvTest {
	public static void main(String[] args) {
		Tv[] tv = new Tv[3];
		int index=0, index2=tv.length-1;
		
		
		{
			tv[0] = new Tv("INIFINIA", 1500000,"LED TV");
			tv[1] = new Tv("XCANVAS", 1000000 ,"LCD TV");
			tv[2] = new Tv("CINEMA", 2000000,"3D TV");
		}
		
		
		for(int i=0; i<tv.length;i++){
			System.out.println(tv[i].toString());

			if(tv[index].getPrice()<tv[i].getPrice()){								// 가장 값이 비싼 제품의 인덱스 값을 저장
				index=i;
			}

			if(tv[index2].getPrice()>tv[i].getPrice()){
				index2=i;															//가장 저렴한 제품의 인덱스 값을 저장
			}
		}
		
		System.out.println("가격이 가장 비싼 제품 : " + tv[index].getName());				//인덱스 값을 통하여 겟터로 불러옴 
		System.out.println("가격이 가장 저렴한 제품 : " + tv[index2].getName());
	}
}
