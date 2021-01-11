package MJ.LinkedList;

import java.util.Random;
import java.util.UUID;

public class VideoLinkedList{
    Node header;

    VideoLinkedList(){
        header = new Node();
    }

    static class Node {
        private String _title;
        private String _id;
        private String _runningTime;
        public Node next = null;

        Node() {
            set_id();
            set_runningTime();
        }
        Node(String id, String runningTime) {
            set_id(id);
            set_runningTime(runningTime);
        }

        public void set_id() {
            this._id = UUID.randomUUID().toString().split("-")[1];
        }

        public void set_id(String id) {
            this._id = id;
        }

        public void set_runningTime(String runningTime) {
            this._runningTime = runningTime;
        }

        public String get_id() {
            return _id;
        }

        public String get_title() {
            return _title;
        }

        public void set_title(String title) {
            this._title = title;
        }

        public void set_runningTime() {
            Random random = new Random();
            int validNum = random.nextInt(14) + 1;
            this._runningTime = Integer.toString(validNum);
        }

        public String get_runningTime() {
            return _runningTime;
        }
    }

    public void add(String title) {
        Node end = new Node();
        end.set_title(title);
        Node now = header;
        while (now.next != null) {
            now = now.next;
        }
        now.next = end;
    }

    public void delete(String title) {
        Node now = header;
        while (now.next != null) {
            if (now.next.get_title().equals(title)) {
                System.out.println(title + " is deleted");
                now.next = now.next.next;
            } else {
                now = now.next;
            }
        }
    }

    public void printAll(){
        Node now = header.next;
        while (now.next != null) {
            String contents = now.get_title() + "(" + now.get_id() + "):" + now.get_runningTime();
            System.out.println(contents);
            now = now.next;
        }
        String contents = now.get_title() + "(" + now.get_id() + "):" + now.get_runningTime();
        System.out.println(contents);
    }

    public static void main(String[] args) {
        VideoLinkedList videoList = new VideoLinkedList();
        for (int i = 1; i < 14; i++) videoList.add("제목"+i);
        videoList.printAll();
    }

}
