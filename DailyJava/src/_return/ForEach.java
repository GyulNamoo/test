package _return;
import java.util.*;

public class ForEach {
	public static String[] getMembers() {
		int i = 0;
        String[] members = { "최진혁", "최유빈", "한이람" };
        for(String e : members) {
        	System.out.println(members[i]); 
        	i++;	// 최진혁, 최유빈, 한이람
        }
        return members; // members변수의 배열 반환 
        
    }
 
    public static void main(String[] args) {
        String[] members = getMembers();
        //getMembers()메소드 실행후 배열자체 반환 
        //System.out.println(getMembers());
        System.out.println(Arrays.toString(members));
        //[최진혁, 최유빈, 한이람] 배열 요소 출력
    }
}
