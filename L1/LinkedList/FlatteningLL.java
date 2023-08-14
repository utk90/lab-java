class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
*/
/*  Function which returns the  root of 
    the flattened linked list. */
class GfG
{
    Node mergeSorted(Node head1, Node head2){
        Node mergeLL = new Node(-1);
        Node curr = mergeLL;
        
        while(head1!=null && head2!=null){
            if (head1.data>head2.data){
                Node newNode = new Node(head2.data);
                head2 = head2.bottom;
                curr.bottom = newNode;
            } else{
                Node newNode = new Node(head1.data);
                head1 = head1.bottom;
                curr.bottom = newNode;
            }
            curr = curr.bottom;
        }
        
        while(head1!=null){
            Node newNode = new Node(head1.data);
            curr.bottom = newNode;
            curr = curr.bottom;
            head1 = head1.bottom;
        }
        
        while(head2!=null){
            Node newNode = new Node(head2.data);
            curr.bottom = newNode;
            curr = curr.bottom;
            head2 = head2.bottom;
        }
        
        return mergeLL.bottom;
    }
    
    Node flatten(Node root)
    {
	    while(root==null || root.next==null){
	        return root;
	    }
	    
	    // breakup in two parts
	    Node curr = root;
        Node result = null;

        while (curr != null) {
            result = mergeSorted(result, curr);
            curr = curr.next;
        }

        return result;
    }
}