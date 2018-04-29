package java_day01;
// 수정내역 : Switch
public class SungJuk3 {	
	public static void main(String[] args) {
		//변수 선언문
		int jumsu=0;
		char grade='F';		
		jumsu=60;		
		switch (jumsu/10) {
		//십의자리수 10
		case 10:	
		//십의자리수 9(90~99)
		case 9:
			grade= 'A';
			break;
		case 8:
			grade= 'B';
			break;
		case 7:	
			grade= 'C';
			break;
		case 6:	
			grade= 'D';
			break;	
		default:
			grade= 'F';
			break;
		}
		System.out.println(grade);
		
		
			
		
		
		
		
		
		
		
		
		
	}

}
