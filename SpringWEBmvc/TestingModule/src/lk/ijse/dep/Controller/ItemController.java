package lk.ijse.dep.Controller;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("items")
public class ItemController {
    @PutMapping
    public String saveItem(String name){
        return "SaveItem";
    }
    @PostMapping
    public String updateItem(String name){
        return "updateItem";
    }
    @DeleteMapping
    public String deleteItem(String name){
        return "DeleteItem";
    }
    @GetMapping
    public String findItem(String id){
        return "FindItem";
    }
}
