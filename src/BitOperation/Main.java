package BitOperation;

public class Main {
	static boolean getBit(int num, int i){
		return (num & (1<<i)) != 0;
	}
	static int setBit(int num, int i){
		return (num | (1<<i));
	}
	static int clearBit(int num, int i){
		return (num & ~(1<<i));
	}
	static int clearLeftBit(int num, int i){
		return (num & ~(-1<<(i+1)));
	}
	static int clearRightBit(int num, int i){
		return (num & (-1<<i));
	}
	public static void main(String[] args){
		// 0000 1001
		System.out.println(getBit(9, 3));
		System.out.println(getBit(5, 3));

		// 0000 0101 --> 0000 1101
		System.out.println(setBit(5, 3));

		// 0000 1001 --> 0000 0001
		System.out.println(clearBit(9, 3));
		
		//1111 1111 --> 0000 1111
		System.out.println(clearLeftBit(255-1, 3));

		//1111 1111 --> 1111 1000
		System.out.println(clearRightBit(255-1, 3));

	}
}
