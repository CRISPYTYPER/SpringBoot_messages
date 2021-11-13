## 스프링 MVC

스프링 MVC는 자바 EE 서블릿 API를 기반으로 하는데,<br>
자바 EE 서블릿(Java EE Servlet) 또는 짧게 서블릿은 일반적으로 톰캣과 같은 애플리케이션 서버인 서블릿 컨테이너 내에서 동작한다.

자바 EE에서 모든 HTTP 요청에 대해 HttpServletRequest 인스턴스가 생성된다.<br>
그리고 모든 HTTP 응답에 대해 HttpServletResponse 인스턴스가 생성된다.<br>

여러 요청에서 사용자를 식별하기 위해 애플리케이션 서버는 첫 번째 요청을 받으면 HttpSession 인스턴스를 생성한다.<br>
> 각 HttpSession 인스턴스는 세션 ID(session ID)라고 불리는 ID를 가진다.<br>
> 이 ID는 HTTP 응답 헤더에 담겨 클라이언트에게 쿠키로 전송된다.<br>
> 클라이언트는 그 쿠키를 저장하고 다음 요청 시 다시 서버로 보낸다.<br>
> 이렇게 해서 서버는 쿠키에서 찾은 세션 ID로 HttpSession 인스턴스를 조회해 사용자를 인식할 수 있다.

### DispatcherServlet
스프링 MVC를 사요하면 서블릿을 생성할 필요가 없다.<br>
클래스를 생성해 @Controller 어노테이션을 추가하고 @RequestMapping 어노테이션으로 특정 URI 패턴에 매핑할 수 있다.<br>
규약에 따르면 클래스 이름은 보통 Controller로 끝난다.

스프링은 요청을 받기 위해 핵심 서블릿인 DispatcherServlet을 활용한다.<br>
이 DispatcherServlet은 모든 요청을 처리할 수 있게 설정돼야 하며,<br>
@RequestMapping 어노테이션에 지정된 URI 패턴에 따라 스프링은 요청을 처리할 패턴에 맞는 컨트롤러를 찾는다.

요약하자면 DispatcherServlet이 요청에 따라 알맞는 Controller를 찾아주는 역할을 한다.