package mypackage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Shera on 03.07.2017.
 */
@Controller
public class MyController {

    @GetMapping("/h")
    public String index(Model m) {
        m.addAttribute("someAttribute", "someValue1");
        return "hello";
    }

    @GetMapping("/m")
    public String index2(Model m) {
        m.addAttribute("someAttribute", "someValue2");
        return "hello";
    }
}
