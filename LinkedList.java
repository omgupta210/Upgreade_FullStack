package data_structure;

public class LinkedList {

	static class  Node
	{
		 int data;
		 Node next;
		Node(int data)
		{
			this.data=data;
		}
		
	}
	Node head=null;
	
	public void add(LinkedList l,int data)
	{
		
		Node newnode=new Node(data);
		newnode.next=null;
		if(l.head==null)
		{
			l.head=newnode;
		}
		else
		{
			Node temp=l.head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newnode;
			
			
			
		}
		
		
	}
	public void addbefore(LinkedList l, int data, int z)
	{
		Node newnode=new Node(data);
		
		
		Node temp=l.head;
		if(temp.data==z)
		{
			head=newnode;
			newnode.next=temp;
		}
		else {
		while(temp.next.data!=z)
		{
			temp=temp.next;
		}
		newnode.next=temp.next;
		temp.next=newnode;
		}
		
	}
	public void addlast(LinkedList l, int data)
	{
		
		Node newnode=new Node(data);
		newnode.next=null;
		Node temp=l.head;
		
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newnode;
	}
	public void remove(LinkedList l, int d)
	{
		Node t=l.head;
		if(t.data==d)
		{
			head=t.next;
		}
		else
		{
			while(t.next.data!=d)
			{
				t=t.next;
			}
			t.next=t.next.next;
		}
		
	}
	
	public static void display(LinkedList l)
	{
		Node cur=l.head;
		while(cur!=null)
		{
			System.out.print(cur.data+" ");
			cur=cur.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add(l,10);
		l.add(l,20);
		l.add(l,21);
		l.addlast(l,12);
		l.add(l, 123);
		l.addbefore(l, 25, 10);
		l.loop(l,10);
		System.out.println("before removal");
		display(l);
		System.out.println("after removal");
		l.remove(l, 12);
		display(l);
		l.mid(l);

	}

	
	private void loop(LinkedList l, int d) {
		
		
	}
	private void mid(LinkedList l) {
		Node temp=l.head;
		Node middle=l.head;
		while(temp!=null && temp.next!=null)
		{
			temp=temp.next.next;
			middle=middle.next;
			
			
		}
		
		System.out.println(middle.data); 
		
	}

}
