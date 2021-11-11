package app.messages;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MessageRepository {
    private final static Log log = LogFactory.getLog(MessageRepository.class);
    //static으로 선언된 변수는 메모리 공간에 하나만 존재하며, 어디서나 접근이 가능한 변수이다.
    //final은 변수를 상수화 시킨다. 즉, 값의 변경이 불가능하다.

    public void saveMessage(Message message) {
        // 데이터베이스에 메시지를 저장한다.
        log.info("Saved message: " + message.getText());
    }
}
