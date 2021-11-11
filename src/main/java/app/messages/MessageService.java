package app.messages;

public class MessageService {
    private MessageRepository repository;
    // MessageRepository를 MessageService의 의존성으로 정의한다.

    public MessageService(MessageRepository repository) { //스프링은 이 생성자를 통해 의존성을 연결한다.
        this.repository = repository;
    }
    public void save(String text) {
        this.repository.saveMessage(new Message(text));
        //클라이언트가 String 타입의 text를 전달해 레포지토리에 저장하는 단순한 API인 save(String) 메소드를 정의한다.
    }
}
