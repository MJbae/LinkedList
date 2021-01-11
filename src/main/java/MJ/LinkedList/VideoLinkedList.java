package MJ.LinkedList;

import java.util.UUID;

public class VideoLinkedList extends LinkedList {
    Node header;

    VideoLinkedList(){
        header = new Node();
    }

    static class Node {
        private String _title;
        private String _id;
        public Node next = null;

        Node() {
            set_id();
        }

        public void set_id() {
            this._id = UUID.randomUUID().toString();
        }

        public String get_id() {
            return _id;
        }

        public String get_title() {
            return _title;
        }

        public void set_title(String _title) {
            this._title = _title;
        }
    }

    public void printAll(){
        Node now = new Node();
        while (now.next != null) {
            String contents = now.get_title() + "(" + now.get_id() + ")";
            System.out.println(contents);
            now = now.next;
        }
        String contents = now.get_title() + "(" + now.get_id() + ")";
        System.out.println(contents);
    }

    public static void main(String[] args) {
        VideoLinkedList videoList = new VideoLinkedList();
        videoList.add("제목1");
        videoList.add("제목2");
        videoList.add("제목3");

        videoList.printAll();
        System.out.println("");

//        videoList.delete("제목2");
//        videoList.printAll();
//        System.out.println("");
//
//        videoList.delete("제목1");
//        videoList.printAll();
    }

}
