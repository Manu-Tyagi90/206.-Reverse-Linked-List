class ListNode{
int val;
ListNode next;
ListNode(int val) {
  this.val = val;
}
ListNode(int val, ListNode next ) {
 this.val = val;
 this.next = next;
}
}

public class Solution{
  private static ListNode reverseListNode(ListNode l1) {
      ListNode prev = null;
      ListNode current = l1;
      while(current!=null) {
        ListNode temp = current.next;
        current.next = prev;
        prev = current;
        current = temp;
      }
  return prev;
}
public static void main(String[] manu) {
  ListNode l1 = new ListNode(7,new ListNode(0, new ListNode(8)));
  ListNode res = reverseListNode(l1);
  while(res!=null) {
    System.out.print(res.val+" ");
    res = res.next;
    }
  }
}
// Output : 8 0 7
