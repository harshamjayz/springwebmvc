package lk.ijse.dep.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customers")
public class MyController {
    @GetMapping("/{id: ^[Cc]\\d{3}$}")
    public String findCustomer(@PathVariable("id")String id){
        return id;

    }
}
