public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public Integer remove(){
        if(head == null){
            return null;
        }

        if(head.next == null){
            Integer temp = head.value;
            head = null;
            return temp;
        }

        Node runner = head;
        while(runner.next.next != null){
            runner = runner.next;
        }
        Integer temp = runner.next.value;
        runner.next = null;

        return temp;
    }

    public void printValues(){
        if(head == null){
            System.out.println("Nothing in list");
        }else{
            Node runner = head;
            while(runner != null){
                System.out.println(runner.value);
                runner = runner.next;
            }
        }
    }

    public Node find(int val){
        if(head == null){
            return head;
        }

        Node runner = head;
        while(runner != null){
            if(runner.value == val){
                return runner;
            }
            runner = runner.next;
        }

        return null;

    }

    

    public Node secondMax(){
        if(this.head == null){
            Node newNode = new Node(null);
            return newNode;
        }else if(this.head.next == null){
            return this.head;
        }else{
            Node max;
            Node max2;
            Node current = this.head.next.next;

            if(this.head.value > this.head.next.value){
                max = this.head;
                max2 = this.head.next;
            }else{
                max = this.head.next;
                max2 = this.head;
            }

            while(current != null){
                if(current.value > max.value){
                    max2 = max;
                    max = current;
                }else if(current.value > max2.value){
                    max2 = current;
                }

                current = current.next;
            }

            return max2;

        }
    }

















}