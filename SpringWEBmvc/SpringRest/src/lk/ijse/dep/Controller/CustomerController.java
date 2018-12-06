package lk.ijse.dep.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

    @GetMapping
    public String findAllCustomers(){
        return "find all customers.";
    }

    @GetMapping(params = {"action = search","q"})
    public String findCustomerByName(){
        return "find Customer by name.";
    }

    @GetMapping(params = {"action = count",})
    public String getCustomerCount(){
        return "Customer count.";
    }

//    @GetMapping
//    public String findCustomers( @RequestParam(value = "action",required = false) String action, @RequestParam( value = "q",required = false) String query){
//        if (action != null){
//            switch (action){
//                case "search":
//                    return "find the customer with"+ query ;
//                default:
//                    return "find all customers";
//            }
//        }else {
//            return "find All Customers";
//        }
//
//    }

    @GetMapping(value = "/{id}")
    public String findCustomerByID(@PathVariable("id") String id){
        return "find the customer"+ id +".";
    }

//    @GetMapping(value = "/{id}/{name}")
//    public String findCustomerByIDAndName(@PathVariable("id") String id , @PathVariable("name") String name){
//        return "find the customer whose id is "+ id +" and name is "+name;
//    }   Don't do like this method.we dont use this type of methods in rest API

    @DeleteMapping(value = "/{id}")
    public String deleteCustomer(@PathVariable("id") String id){
        return "Delete this customer "+id ;
    }

    @PutMapping(value = "/{id}")
    public String SaveCustomer(@PathVariable("id") String id){
        return "Save this customer "+id ;
    }

    @PostMapping(value = "/{id}")
    public String UpdateCustomer(@PathVariable("id") String id){
        return "Update this customer "+id ;
    }

}
