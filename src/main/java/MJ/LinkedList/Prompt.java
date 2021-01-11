package MJ.LinkedList;

import java.util.HashMap;
import java.util.Scanner;

public class Prompt {
    public void runPrompt() {
        VideoLinkedList videoList = new VideoLinkedList();
        HashMap<String, String[]> videoMap = new HashMap<>();

        for (int i = 1; i < 14; i++) {
            String title = "제목" + i;
            VideoLinkedList.Node nodeOfAddition = videoList.add(title);
            videoMap.put(nodeOfAddition.get_id(), new String[]{nodeOfAddition.get_title(), nodeOfAddition.get_runningTime()});
        }
        videoList.printAll();

        VideoLinkedList testList = new VideoLinkedList();
        Scanner scanner = new Scanner(System.in);
        System.out.print(">");
        String[] prompt = scanner.nextLine().split(" ");

        String inputID = prompt[1];
        String inputTitle = videoMap.get(inputID)[0];
        String inputRunningTime = videoMap.get(inputID)[1];

        if (prompt[0].equals("add")) {
            testList.add(inputID, inputTitle, inputRunningTime);
        }

        testList.printAll();
    }
//
//    public void showAllMovies() {
//        VideoLinkedList videoList = new VideoLinkedList();
//
//        for (int i = 1; i < 14; i++) {
//            String title = "제목" + i;
//            VideoLinkedList.Node nodeOfAddition = videoList.add(title);
//        }
//        videoList.printAll();
//    }

    public static void main(String[] args) {
        Prompt prompt = new Prompt();
        prompt.runPrompt();
    }
}
