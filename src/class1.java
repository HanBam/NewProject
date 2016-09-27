class MyTestLinkedList {
    public static void main(String[] args) {
   
        LinkedList list1 = new LinkedList();       
        list1.print();
       
        list1.addToHead(5);  list1.print();
        list1.addToHead(2);  list1.print();
        list1.addToHead(7);  list1.print();
        list1.addToHead(10);  list1.print();
        list1.addToHead(3);  list1.print();
        list1.addToHead(7);  list1.print();
       
    }
}

///////////////////////////////////////////////////////////////////////////////

class LinkedList {  // simple list that adds items to the head
    
    ListNode head;
    int numNodes;
    
    // constructor
    LinkedList() {  // create empty list
        head = null;
        numNodes = 0;
    }
        
    // add an item to the head of list (create item of value v)
    int addToHead(int v) {
        ListNode item = new ListNode(v,head);
        head = item;
        return (++numNodes);
    }
    
    // print list from the head to the tail
    void print() {
        String str = "H->";
        for(ListNode i = head; i!=null; i=i.next) {
            str = str + "[" + i.val + "]->";
        }
        str = str + "X (#items=" + numNodes + ")";
        System.out.println(str);
    }
    
    boolean search(int v){
    	for(ListNode i = head; i != null; i = i.next){
    		if(i.val==v)
    			return true;
    	}
		return false;
    }
    
    int findMax() {
    	int currentMax = -99999;
    	for(ListNode i = head; i!=null; i=i.next){
    		if(i.val > currentMax)
    			currentMax = i.val;
    	}
		return currentMax;
    	
    }
    
    int findMin() {
		return numNodes;
    	
    }
}

///////////////////////////////////////////////////////////////////////////////

class ListNode {
    
    int val;
    ListNode next;
    
    ListNode(int val) { this.val = val;  this.next = null; }
    ListNode(int val, ListNode next) { this.val = val;  this.next = next; }
    
} 
