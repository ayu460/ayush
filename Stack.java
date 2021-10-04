// Stack implements
package collection;
public class Stack<E>{
    Node<E> head;

    public void push(E data){
        Node<E> toAdd=new Node<E>(data);
        Node<E> temp=head;
        if(head==null){
            head=toAdd;
            return ;
        }
        while(temp.next !=null){
            temp=temp.next;
        }
        temp.next=toAdd;

    }
   public E peek(){
    Node<E> temp=head;
    if(temp == null){
        return null;
    }
    
    while(temp.next != null){
        temp=temp.next;
    }
    
    return temp.data;
   }
    public E pop(){
        Node<E> temp=head;
        if(temp==null){
            return null;
        }
        if(temp.next == null){
            Node<E> toRemove=head;
            head=null;
            return toRemove.data;
        }
     while(temp.next.next !=null){
         temp=temp.next;
     }
     Node<E> toRemove=temp.next;
     temp.next=null;
     return toRemove.data; //returning data to delete
    }
    public static void main(String args[]){
       Stack<Integer> list=new Stack<Integer>();
       list.push(25);
       list.push(82);
    //    list.push(662);
    //    list.push(26);
    //    list.push(100);
    //    System.out.println(list);
       System.out.println(list.pop());

       System.out.println(list.pop());
    }

    public static class Node<E>{
        E data;
        Node<E> next;
        public Node(E data){
            this.data=data;
            next=null;
        }
    }
}
