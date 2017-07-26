public class LinkedList<E> {
public Node<E> head;
public LinkedList() {
    head = null;
}
public void insert(Node<E> n) {
    if (head == null) {
        head = n;
    } else {
        insert(n, head);
    }
}
public Node find(E x){
    if (head == null)
        return head;
    return find(x, head.getNext());
}
private Node find(E x, Node<E> nose) {
    if (nose.getData().equals(x))
        return nose;
    return find(x, nose.getNext());
}
public void delete(Node<E> n){
    //delete(n, head);
	if(head.equals(n)){
		head=head.getNext();
	}
	Node temp=head;
	Node prev = temp;
	while(temp!=null && !temp.getData().equals(n.getData())){
		prev=temp;
		temp=temp.getNext();
	}
	if(temp==null){
		System.out.println("Not found");
	}
	else{
		prev.setNext(temp.getNext());
	}
}
//public void delete(E e){
   // delete(e, head);
//}
//private void delete(E e, Node<E> nose) {
//    if (nose.getData().equals(e)){
//        nose=nose.getNext();
//    }else{
//        delete(e, nose.getNext());
//    }
//}
//private void delete(Node n, Node<E> nose) {
//    if (nose.equals(n)){
//        nose=nose.getNext();
//    }else{
//        delete(n, nose.getNext());
//    }
//}
private void insert(Node<E> n, Node<E> nose) {
    if (nose.getNext() == null) {
        nose.setNext(n);
    } else {
        insert(n, nose.getNext());
    }
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
    return "LinkedList [head=" + head + ", getClass()=" + getClass()
            + ", hashCode()=" + hashCode() + ", toString()="
            + super.toString() + "]";
}}
