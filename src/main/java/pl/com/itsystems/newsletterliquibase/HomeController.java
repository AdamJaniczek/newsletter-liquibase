package pl.com.itsystems.newsletterliquibase;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    private final UserRepository userRepository;

    public HomeController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "home";
    }

    @GetMapping("/user")
    public String createUser(Model model) {
        model.addAttribute("user", new User());
        return "create-user";
    }

    @PostMapping("/user")
    public String createUser(@ModelAttribute User user, Model model) {
        userRepository.save(user);
        return "redirect:/";
    }
}
