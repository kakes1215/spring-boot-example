package hello;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    @Value("${test}")
    String name;

    @GetMapping(value = {"/greeting"})
    public String index(Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}