package week7;

public class linkedList{
    Node head;

    public void add(int number){
        Node node = new Node();
        node.data = number;
        node.next = null;

        if(head == null){
            head = node;
        }
        else{
            Node n = head;
                while(n.next != null){//do in the data filed while is not null
                    n = n.next;
                }
                n.next = node;
        }

    }// out of add method

    public void tarverse(){
        Node node = head;

        System.out.println(" ::: Linked List ::: ");
        while(node.next!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.print(node.data+"\n");
    }// out of tarverse method

    public void remove(int index){
        if(index==0){
            head = head.next;
        }
        else{
            Node node = head;
            Node new_node = null;

            for(int i=0;i<index-1;i++){
                node = node.next;
            }
            new_node = node.next;
            node.next = new_node.next;
            System.out.println("Node "+new_node.data+" was removed.");
        }
    }

}
