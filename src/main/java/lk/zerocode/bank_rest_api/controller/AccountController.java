package lk.zerocode.bank_rest_api.controller;

import lk.zerocode.bank_rest_api.controller.request.AccountDepositRequest;
import lk.zerocode.bank_rest_api.model.Account;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {

//    Account ac = new Account("wish",1000.00,1L);

    @PostMapping(value = "/deposit")
    void depositAmount(@RequestBody AccountDepositRequest adr){

        System.out.println("wada "+ adr.getAmount());

    }

    @GetMapping(value = "/deposit")
    void depositAmount1(@RequestBody AccountDepositRequest adr){

        System.out.println("wada1 "+ adr.getAmount());

    }

}
