import java.util.*;
class Node
{
	int data;
	Node next;
	Node(int num)
	{
		this.data=num;
		this.next=null;
	}
}
class SinglyLinkedList1
{
	Node head=null;
	Node temp=null;
	Node prev=null;
	public void insertNode(int num)
	{
		Node newNode=new Node(num);
		if(head==null)
		{
			head=temp=newNode;
		}
		else
		{
			temp.next=newNode;
			temp=newNode;
		}
	}
	public void reversePrint(Node node)
	{
	    if(node==null)
	    {
	        return;
	    }
	    reversePrint(node.next);
	    System.out.println(node.data);
	}
	public void display()
	{
		temp=head;
		while(temp.next!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.print(temp.data+"\n");
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t =s.nextInt();
		for(int i=1;i<=t;i++)
		{
			SinglyLinkedList1 list=new SinglyLinkedList1();
			int num;
			System.out.println("Enter the list"+" "+i);
			while(true)
			{
				num = s.nextInt();
				if(num == -1)
				{
					break;
				}
				list.insertNode(num);
			}
            list.reversePrint(list.head);
		}
	}
}
