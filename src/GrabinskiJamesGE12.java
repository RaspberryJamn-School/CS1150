
public class GrabinskiJamesGE12 {
	public static int sumOneToMax(int max) {
		int ret = 0;
		for (int i = 0;i <= max; i++) {
			ret+=i;
		}
		return ret;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 10; i++) {
			System.out.println(sumOneToMax(i));
		}
	}

}
