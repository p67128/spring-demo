package foo.bar.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringDemoController {

  @GetMapping("/auth")
  public void testAuth() {
    System.out.println("AUTHORISED");
  }

}
