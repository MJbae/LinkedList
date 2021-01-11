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
}
