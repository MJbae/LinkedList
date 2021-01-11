package MJ.LinkedList;

public class LinkedList {
    Node header;

    static class Node{
        private String _title;
        public Node next = null;
        // id는 추후 구현 생성자에 random 함수 활용
        // private String id;

        public String get_title() {
            return _title;
        }

        public void set_title(String _title) {
            this._title = _title;
        }
    }

    LinkedList() {
        header = new Node();
    }

    public void add(String title){
        Node end = new Node();
        end.set_title(title);
        Node now = header;
        while(now.next != null){
            now = now.next;
        }
        now.next = end;
    }

    public void delete(String title){
        Node now = header;
        while(now.next != null){
            if(now.next.get_title().equals(title)){
                System.out.println(title + " is deleted");
                now.next = now.next.next;
            }
            else{
                now = now.next;
            }
        }
    }

    public void printAll(){
        Node now = header.next;
        while(now.next != null){
            System.out.println(now.get_title());
            now = now.next;
        }
        System.out.println(now.get_title());
    }

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.add("시작이다");
        linkedList.add("내 꿈을 위한");
        linkedList.add("여행");
        linkedList.add("피카츄");

        linkedList.printAll();
        System.out.println("");

        linkedList.delete("여행");
        linkedList.printAll();
        System.out.println("");

        linkedList.delete("시작이다");
        linkedList.printAll();
    }
}
