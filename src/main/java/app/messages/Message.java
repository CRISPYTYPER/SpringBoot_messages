package app.messages; //Message 클래스가 있는 패키지를 정의한다.

public class Message {
    private String text;
    public Message(String text) {
        this.text = text;
    }
    // Message 클래스의 생성자를 정의.(매개변수로 text를 받고 private 필드인 text에 할당.
    // this 키워드로 매개변수의 클래스의 필드 구분 할 수 있음.
    public String getText() {
        return text;
    }
    //외부에서 private text 필드에 접근할 수 있도록 getter 메소드 정의.
}
