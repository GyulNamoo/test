package test;

public class ForEach {
	public static void main(String[] args) {
		String str = "agile";
		int x[] = {1,2,3,4,5};
		char y[] = new char[5];
		int i = 0;
		while (i<str.length()) {
			y[i] = str.charAt(i);
			i++;
		}
		
		for(int p:x) {	//향상된 for문 , for-each루프 
						// x=> 이전에 선언된 배열 int x[]
						// p : x => 각 반복에서 현재 요소값이 p에 할당
			i--;
			System.out.println(y[i]);
			System.out.println(p+" ");
		}
	
	}
}

