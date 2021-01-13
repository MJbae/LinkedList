package MJ.LinkedList;

import java.util.HashMap;

public class MediaPrompt {
    public void runPrompt(){
        MediaLinkedList mediaList = new MediaLinkedList();

        // id -> title, id -> runningTime 해쉬 생성
        HashMap<String, String> id2title = new HashMap<>();
        HashMap<String, String> id2runningTime = new HashMap<>();

        for(int i = 1; i < 14; i++){
            String inputID = "ab" + Integer.toString(i);
            String inputTitle = "제목" + Integer.toString(i);
            String inputRunningTime = Integer.toString(i);
            mediaList.add(inputID);
            id2title.put(inputID, inputTitle);
            id2runningTime.put(inputID, inputRunningTime);
        }



    }

    public void showAll(){

    }

    public static void main(String[] args){
        MediaPrompt prompt = new MediaPrompt();
        prompt.runPrompt();
    }
}
