package Zadanie2;

public class Ad {
    String content;
    SendMethod sendMethod;

    public Ad(String content, SendMethod sendMethod) {
        this.content = content;
        this.sendMethod = sendMethod;
    }

    public Ad(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public SendMethod getSendMethod() {
        return sendMethod;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSendMethod(SendMethod sendMethod) {
        this.sendMethod = sendMethod;
    }
}
