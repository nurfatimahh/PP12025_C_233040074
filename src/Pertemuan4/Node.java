package Pertemuan4;

public class Node {
		private int data;
		private Node next;

	public Node(int data) {
		this.data = data;
	}
		public void setdata(int data) {
			this.data = data;
			
		}

		public int getdata() {
			return data;
		}
		
		public void setnext(Node next) {
			this.next = next;

		}
		public Node getnext() {
			return next;
		}
		
	}


