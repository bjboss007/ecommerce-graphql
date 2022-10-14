package com.smart.ecommerceql.core;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractEntity {
    @Id
    private String id;

//    @CreatedDate
//    private LocalDateTime createdDate;
//    @LastModifiedDate
//    private LocalDateTime updatedDate;

}
