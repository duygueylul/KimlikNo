package KimlikNo;

public class Kimlik {

	public static void main(String[] args) {
		 
		String kimlikNo = "01234567894";
		char sonRakam = kimlikNo.charAt(10);
		
		

		switch(sonRakam) {
		
		
		case '0' :
			System.out.println("01.01.2024");
			break;
			
		case '2' :
			System.out.println("02.01.2024");
			break;
			
		case '4' :
			System.out.println("03.01.2024");
			break;
			
		case '6':
			System.out.println("04.01.2024");
			break;
			
		case '8':
			System.out.println("05.01.2024");
			break;
			default:
				System.out.println("Bir Hata Oluştu...");
				break;
			
		}
	
		

	}

}
