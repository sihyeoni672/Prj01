
public class LiteralTest {

	public static void main(String[] args) {
		// Data : Literal 상수
		int num = 1;
		String name = "카리나";
		double height = 167.3; 
		float weight = 48.5f;  // 실수뒤에 f 
		int bYear = 2003;
		int tyear = 2026;
		String address = "집주소";
		char grade = 'A';
		boolean adult = true;
		boolean male = false;
		long lBalance = 12345678900L; // F2 단축키(오류 메시지)
		
		
		System.out.println("번호"+num);
		System.out.println("이름"+name);
		System.out.println("생년"+bYear);
		
		int data =65;
		System.out.printf("문자: %c 숫자: %d",data,data); // char,int
		

	}

}
