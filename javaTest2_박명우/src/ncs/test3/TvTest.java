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

			if(tv[index].getPrice()<tv[i].getPrice()){
				index=i;
			}

			if(tv[index2].getPrice()>tv[i].getPrice()){
				index2=i;
			}
		}
		
		System.out.println("������ ���� ��� ��ǰ : " + tv[index].getName());
		System.out.println("������ ���� ������ ��ǰ : " + tv[index2].getName());
	}
}
