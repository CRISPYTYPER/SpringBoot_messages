package app.messages;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // AppConfig.java 파일이 빈을 정의하기 위한 것임을 스프링에게 알려주기 위함.
@ComponentScan("app.messages") // 어노테이션이 달린 컴포넌트를 스캔할 기본 패키지를 스프링에게 알려주기 위함.
public class AppConfig {

    // 아래의 메소드 들은 빈을 생성하는 역할을 한다.
    // 그리고 메소드의 이름은 빈의 이름이 된다.

    @Bean
    public MessageRepository messageRepository() {
        return new MessageRepository();
    }

    @Bean
    MessageService messageService() {
        return new MessageService(messageRepository()); // MessageRepository 인스턴스를 MessageService 생성자에 전달한다.
    }
}
