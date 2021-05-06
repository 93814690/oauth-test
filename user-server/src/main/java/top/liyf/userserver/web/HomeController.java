package top.liyf.userserver.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/getName")
    public String getName() {
        return "name";
    }

    @GetMapping("/admin/getName")
    public String getAdminName() {
        return "admin name";
    }
}
