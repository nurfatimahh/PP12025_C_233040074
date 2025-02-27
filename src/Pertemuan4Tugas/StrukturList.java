package Pertemuan4Tugas;

public class StrukturList {
		private Node HEAD;
		
		private boolean isEmpty() {
			return HEAD == null;
		}
		
		public void addTail(double data) {
			
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
				posNode.setnext(newNode);
			}
		}
			public void displayElement () {
				Node curNode = HEAD;
				while (curNode != null) {
					System.out.print(curNode.getdata() + " ");
					curNode = curNode.getnext() ;
				}
			}
			public void addHead(double data) {
				Node newNode = new Node(data);
				if (isEmpty()) {
					HEAD = newNode;
				}
				else {
					newNode.setnext(HEAD);
					HEAD = newNode;
				}
			}
			public void addMid(double data, int position) {
				
				Node posNode=null, curNode=null;
				int i;
				Node newNode = new Node(data);
				
				if (isEmpty())
					{
						HEAD= newNode;
					}
				else 
					{
						curNode = HEAD;
						if (position == 1) {
							newNode.setnext(curNode);
							HEAD= newNode;
						} 
						else {
							i = 1;
							while (curNode != null && i < position )
							{
								posNode = curNode;
								curNode = curNode.getnext();
							i++;
							}
							posNode.setnext(newNode);
							newNode.setnext(curNode);
						}
					}
				}
			
	}
