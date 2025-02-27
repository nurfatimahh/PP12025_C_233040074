package Pertemuan4Tugas;

public class List2b {
	public static void main(String []args) {
		StrukturList List = new StrukturList ();
		List.addTail(5.5);
		List.addHead(3.4);
		List.addMid(2.1, 2);
		List.addMid(1.1, 3);
		List.addMid(4.5, 4);
		
		
		List.displayElement();
	}
}
