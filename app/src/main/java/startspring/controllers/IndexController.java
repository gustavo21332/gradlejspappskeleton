package startspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller

public class IndexController {
    @RequestMapping ("/")
    public String home(@RequestParam("nome") String nome, Model Model) {
        Model.addAttribute("nome", nome);
        return "index.jsp";
    }
}
