package MJ.LinkedList;

public class LinkedList {
    // 삽입, 삭제 시 바로 접근하는데 사용
    private int size = 0;
    // 첫번째 요소를 가리키는 레퍼런스
    Node head;
    // 마지막 요소를 가리키는 레퍼런스
    Node tail;

    static class Node {
        private String _title;
        private Node _next;

        public Node(String title){
            this._title = title;
            this._next = null;
        }
    }

    public Node searchNode(int index){
        Node tmpNode = head;
        for(int i = 0; i < index; i++){
            tmpNode = tmpNode._next;
        }
        return tmpNode;
    }

    public void insert(int n, String title){
        if(n == 0) add(title);
        else{
            Node preNode = searchNode(n-1);
            Node nxtNode = preNode._next;
            Node nodeForInsert = new Node(title);

            preNode._next = nodeForInsert;
            nodeForInsert._next = nxtNode;
            size++;

            if(nodeForInsert._next == null) tail = nodeForInsert;
        }
    }

    // LinkedList의 맨 앞에 요소 추가
    public void add(String title) {
        Node start = new Node(title);
        // 다음 요소 삽입 시, 다음 요소의 레퍼런스가 현재요소를 가리킴
        start._next = head;
        // 리스트의 첫번째 요소로 현재 삽입한 요소를 가리킴
        head = start;
        size++;
        if(head._next == null){
            tail = head;
        }
    }

    // 리스트 첫번째 요소 삭제
    public void delete(){
        Node nodeForDelete = head;
        head = nodeForDelete._next;
        size--;
    }

    // nth번째 요소 삭제
    public void remove(int n){
        if(n == 0) delete();
        Node temp = searchNode(n-1);
        Node todoDeleted = temp._next;

        temp._next = temp._next._next;

        if(todoDeleted == tail){
            tail = temp;
        }

        size--;
    }

//    public void delete(String title) {
//        Node now = header;
//        while (now.next != null) {
//            if (now.next.get_title().equals(title)) {
//                System.out.println(title + " is deleted");
//                now.next = now.next.next;
//            } else {
//                now = now.next;
//            }
//        }
//    }

    public void printAll() {
        // 첫번째 요소가 없다면 empty 출력
        if(head == null){
            System.out.println("empty");
        }
        // 첫번째 요소부터 마지막 요소까지 순회
        Node nodeForSearching = head;
        while(nodeForSearching._next != null){
            System.out.println(nodeForSearching._title);
            nodeForSearching = nodeForSearching._next;
        }
        System.out.println(nodeForSearching._title);
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insert(0,"내 꿈을 위한");
        linkedList.insert(1,"여행");
        linkedList.insert(2,"시작이다");
        linkedList.insert(3,"피카츄");

        linkedList.printAll();
        System.out.println("");

        linkedList.delete();

        linkedList.printAll();
        System.out.println("");

        linkedList.remove(1);

        linkedList.printAll();
        System.out.println("");

//        linkedList.delete("여행");
//        linkedList.printAll();
//        System.out.println("");
//
//        linkedList.delete("시작이다");
//        linkedList.printAll();
    }
}
