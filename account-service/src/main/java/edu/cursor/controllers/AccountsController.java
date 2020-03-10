package edu.cursor.controllers;


import edu.cursor.dto.AccountDto;
import edu.cursor.services.AccountsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/accounts")
@AllArgsConstructor
public class AccountsController {


    private final AccountsService accountsService;

    @GetMapping
    public List<AccountDto> accounts(){
        return accountsService.allAccounts();
    }



}
