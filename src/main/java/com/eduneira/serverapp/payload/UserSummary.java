package com.eduneira.serverapp.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserSummary {
    private String id;
    private String username;
    private String fullname;
}
