package lk.Bookme.controller;

import lk.Bookme.dto.Customer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cust")
public class CustomerController {

    @GetMapping("save_customer")
    public Customer saveCustomer(){
        System.out.println("customer save");
        Customer customer=new Customer("shehan",25);
        return customer;
    }

    @PostMapping
    public void recived_customer(@RequestBody Customer customer){
        System.out.println(customer);
    }

}
