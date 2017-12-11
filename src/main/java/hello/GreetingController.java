package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="ACE") String name, Model model) {
        System.out.println("inside greeting controller");
    	model.addAttribute("name", name);
    	System.out.println(model);
        return "greeting";
    }

}