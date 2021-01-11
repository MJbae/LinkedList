package MJ.LinkedList;

public class Node {
    private String _title;
    private Node next = null;

    // id는 추후 구현 생성자에 random 함수 활용
    // private String id;

    Node(String title){
        this._title = title;
    }

    public String get_title() {
        return _title;
    }

    public void add(String title){
        Node end = new Node(title);
        Node now = this;
        while(now.next != null){
            now = now.next;
        }
        now.next = end;
    }

    public void delete(String title){
        Node now = this;
        while(now.next != null){
            if(now.next.get_title() == title) now.next = now.next.next;
            else now = now.next;
        }
    }

    public void printAll(){
        Node now = this;
        while(now.next != null){
            System.out.println(now.get_title());
            now = now.next;
        }
        System.out.println(now.get_title());
    }

    public static void main(String[] args){
        Node start = new Node("시작이다");
        start.add("내 꿈을 위한");
        start.add("여행");
        start.add("피카츄");

        start.printAll();
        start.delete("여행");

        start.printAll();
    }
}
