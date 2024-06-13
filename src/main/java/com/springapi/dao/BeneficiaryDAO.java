package com.springapi.dao;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BeneficiaryDAO {
    private int beneficiaryId;
    private String firstName;
    private String lastName;
}
