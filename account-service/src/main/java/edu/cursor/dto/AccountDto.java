package edu.cursor.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountDto {
    private long accountId;
    private String username;
    private String password;
    private String email;
    private String phone;
}
