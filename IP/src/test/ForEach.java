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
			//System.out.println(i);
		}
		
		for(int p : x) {	//향상된 for문 , for-each루프 
						// x=> 이전에 선언된 배열 int x[]
						// p : x => 각 반복에서 현재 요소값이 p에 할당, 즉 x[1], x,[2]...x[i]
			i--;
			System.out.print(y[i]); // e l i g a
			System.out.print(p+" "); // p => for루프에서 현재 배열의 요소=x x[1],...x[4]
			// for 반복시마다 y[i] i--값 출력+
			// i--는 p값에 영향을 미치지 않음 => for(int p : x) => p = x[0]...x[i]
		}
		
		/*
		 * // 일반 for문
			for (int i = 0; i < x.length; i++) {
			    int p = x[i];
			    // 코드 블록
			}
			
			// for-each문
			for (int p : x) {    => x는 순회할 배열 형태
			    // 코드 블록
			               
			}
		 */
	
	}
}

