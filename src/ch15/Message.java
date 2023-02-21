package ch15;

import java.util.LinkedList;
import java.util.Queue;

public class Message {
    public String command;
    public String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }

    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendSNS", "신용권"));
        messageQueue.offer(new Message("sendKaKaoTalk", "김자바"));

        while (!messageQueue.isEmpty()) {
            Message m = messageQueue.poll();
            switch (m.command) {
                case "sendMail":
                    System.out.println(m.to + "에게 메일");
                    break;
                case "sendSNS":
                    System.out.println(m.to + "에게 SNS");
                    break;
                case "sendKaKaoTalk":
                    System.out.println(m.to + "에게 카카오톡");
                    break;
            }
        }
    }
}
