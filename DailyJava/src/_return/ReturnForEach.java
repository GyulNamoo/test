package _return;

public class ReturnForEach {
	
    public static String[] getMembers() {
        String[] members = { "최진혁", "최유빈", "한이람" };
        for(String n : members) {
        	System.out.println(n);
        }
        return members;
    }
 
    public static void main(String[] args) {
        String[] members = getMembers();
        // for-each문
        /* for( type 변수명 : iterate){
        	body-of-loop
        	}  //iterate : 배열을 돌릴 객체 
        */
    }
}
