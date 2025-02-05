package spring.basic.exception.servlet;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
public class ServletExController {

  // 1. Exception 객체
  @GetMapping("/error-ex")
  public void error() {
    throw new RuntimeException("예외 발생");
  }

  // 2. response.sendError(): 설정한 오류 메시지가 콘솔에 별도로 출려되지 않는다.
  @GetMapping("/error-404")
  public void error404(HttpServletResponse response) throws IOException {
    response.sendError(404, "404 error occurred");
  }
  @GetMapping("/error-500")
  public void error500(HttpServletResponse response) throws IOException {
    response.sendError(500, "500 error occurred");
  }

}


