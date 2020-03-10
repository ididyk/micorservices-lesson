package edu.cursor.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;
    @NonNull private String username;
    @NonNull private String password;
    @NonNull private String email;
    @NonNull private String phone;
}
