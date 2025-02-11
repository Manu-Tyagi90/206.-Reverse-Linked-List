class ListNode {
int val;
ListNode next;
ListNode(int x, ListNode y){
val = x;
next = y;
}
}

public class Practice1 {
public static ListNode reverse(ListNode l1){
ListNode prev = null;
ListNode current = l1;
while(current!=null){
ListNode nextNode = current.next;
current.next = prev;
prev = current;
current = nextNode;
}
return prev;
}
}
