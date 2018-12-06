package lk.ijse.dep.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customers")
public class CustomerController {
    @PutMapping
    public String saveCustomer(String name){
        return "SaveCustomer";
    }
    @PostMapping
    public String updateCustomer(String name){
        return "UpdateCustomer";
    }
    @DeleteMapping
    public String deleteCustomer(String name){
        return "DeleteCustomer";
    }
    @GetMapping
    public String findCustomer(String id){
        return "FindCustomer";
    }
}
