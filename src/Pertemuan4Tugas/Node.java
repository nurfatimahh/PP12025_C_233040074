package Pertemuan4Tugas;

public class Node {
			private double data;
			private Node next;

		public Node(double data) {
			this.data = data;
		}
			public void setdata(double data) {
				this.data = data;
				
			}

			public double getdata() {
				return data;
			}
			
			public void setnext(Node next) {
				this.next = next;

			}
			public Node getnext() {
				return next;
			}
			
		}
