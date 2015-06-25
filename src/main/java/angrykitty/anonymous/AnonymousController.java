package angrykitty.anonymous;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnonymousController {

  @RequestMapping("/anonymous")
  public String  anonymous() {
    return "anonymous";
  }

}
