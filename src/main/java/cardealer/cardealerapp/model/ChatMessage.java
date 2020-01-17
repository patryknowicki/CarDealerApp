package cardealer.cardealerapp.model;

public class ChatMessage {
    private MessageType type;
    private String content;
    private String sender;

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String cezar(String str) {        //metoda szyfrujaca;
        char x[] = str.toCharArray();

        for (int i = 0; i != x.length; i++) {
            int n = x[i];
            n += 5;
            x[i] = (char) n;
        }
        return new String(x);
    }

    public String cezarwroc(String str){     //metoda deszyfrujaca;
        char x[] = str.toCharArray();

        for(int i=0; i != x.length; i++) {
            int n = x[i];
            n -= 5;
            x[i] = (char)n;
        }
        return new String(x);
    }

}