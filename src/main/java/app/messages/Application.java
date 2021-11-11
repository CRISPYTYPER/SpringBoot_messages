package app.messages;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application { // 어플리케이션의 시작점이며, 컨테이너를 구동하는 역할
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // AppConfig 클래스를 AnnotationConfigApplicationContext 클래스의 생성자에 전달해 스프링 컨테이너를 생성한다.
        MessageService messageService = context.getBean(MessageService.class);
        // getBean(Class<T>) 메소드를 호출해 MessageService 빈의 인스턴스를 가져온다.
        // 이 시점에서 스프링 컨테이너에서 가져온 messageService 빈은 완전히 인스턴스화 되었다.
        // 특히 MessageRepository의 인스턴스가 주입됐다.
        messageService.save("Hello, Spring!");
    }
}
