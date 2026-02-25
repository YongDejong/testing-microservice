package com.app.api.dto.response;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CustomerDto {
    private String id;
    private String name;
    private String contact;
}
