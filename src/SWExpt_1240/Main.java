package SWExpt_1240;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-->0){
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			for(int i=0; i<N; i++){
				for(int j=0; j<M; j++){
					byte bi = sc.nextByte();
					byte[] bBuffer = null;
					int cnt = 0;
					if(bi==0b1){
						while(bi==0b1)
							bBuffer[cnt++]=0b1;
						while(bi==0b0)
							bBuffer[cnt++]=0b0;
						while(bi==0b1)
							bBuffer[cnt++]=0b1;
					}else continue;
					switch(bBuffer.){
					
					}
//						0b1101
//						0b11001
//						0b10011
//						0b111101
//						0b100011
//						0b110001a
//						0b101111
//						0b111011
//						0b110111
//						0b1011
				}
			}
		}
	}
}
