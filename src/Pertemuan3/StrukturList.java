package Pertemuan3;

public class StrukturList {
	private Node HEAD;
	
	private boolean isEmpty() {
		return HEAD == null;
	}
	
	public void addTail(int data) {
		
	Node posNode=null, curNode=null;
	Node newNode = new Node(data);
	
	if (isEmpty())
		{
			HEAD= newNode;
		}
	else 
		{
			curNode = HEAD;
			while (curNode != null)
			{
				posNode = curNode;
				curNode = curNode.getnext();
			}
			posNode.setNext(newNode);
		}
	}
		public void displayElement () {
			Node curNode = HEAD;
			while (curNode != null) {
				System.out.print(curNode.getdata() + " ");
				curNode = curNode.getnext() ;
			}
		}
		public void addHead(int data) {
			Node newNode = new Node(data);
			if (isEmpty()) {
				HEAD = newNode;
			}
			else {
				newNode.setNext(HEAD);
				HEAD = newNode;
			}
		}
}

