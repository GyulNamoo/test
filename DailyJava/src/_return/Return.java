package _return;

public class Return {
    public static String num(int i) {
        if(i==0){
            return "zero";
        } else if(i==1){
            System.out.println("one"); 
        } else if(i==2){
            return "two";
        }
        return "none";// String으로 반환해주어야함
        // void가 아닌 메소드는 반드시 값을 반환해야함
        // return문은 메소드 실행을 즉시 종료한다
        
    }
 
    public static void main(String[] args) {
        System.out.println(num(1));
        // one
        // none
    }
	
}
