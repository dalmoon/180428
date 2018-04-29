package oop;

//MP3p실체 제조사
public class MP3pMain {
	
	public static void main(String[] args) {
		//4. new는 MP3p클래스에 메모리 할당해서 실체 생성 
		//메모리 주소(=참조) 리턴
		//클래스(참조자료형) 참조변수 = 실체;
		// m3에 실체주소가 저장(4바이트) 
		//인스턴스 셍성시 생성자로 필수 초기값 입력변수 전부를 한번에 강제 초기화
		//MP3p m3= new MP3p("Black",10);
		MP3p m3= new MP3p();
		//5. 참조변수.멤버로 접근
		//m3.color="Black";
		//m3.setColor("Black");		
		//m3.color="Grexxxxxx";
		//System.out.println(m3.color);
		//System.out.println("색=" + m3.getColor());
		///////////////////////////////////
		//m3.memory=-10;
		//m3.setMemory(-10);
		//System.out.println("메모리=" + m3.getMemory());
		m3.memoryUp(100);
		System.out.println("증가메모리=" + m3.getMemory());
		//----------------------------
		System.out.println(m3.toString());
		
	}

}
