package pl.edu.vistula.first_project_java_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping(value = "/")
    public String hello() {
        System.out.println("Hello Vistula, in my first spring controller");
        return "hello";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        System.out.println("Greeting endpoint was called with name: " + name);
        model.addAttribute("name", name);
        return "greeting";
    }
}
