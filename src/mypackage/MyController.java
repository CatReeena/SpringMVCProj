package mypackage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Shera on 03.07.2017.
 */
@Controller
public class MyController {

    @GetMapping("/")
    public String index(Model m) {
        m.addAttribute("someAttribute", "someValue1");
        return "index";
    }
}
