package _return;

import java.util.*;

public class ForEach_new{
	private static final String[] members={"a","b","c"};
//   캡슐화          =====			
	public static String[] getMembers(){
	   return members;
	   // members 반환 (members배열 참조 반환)
	   }
	public static void main(String[] args){
	   		String members[] = getMembers();
	   		System.out.println(getMembers());
	   		System.out.println(Arrays.toString(getMembers()));
	   		System.out.println(members);
	   		System.out.println(Arrays.toString(members));
    }
}

