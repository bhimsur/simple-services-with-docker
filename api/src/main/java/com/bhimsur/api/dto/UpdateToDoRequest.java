package com.bhimsur.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateToDoRequest implements Serializable {
    private static final long serialVersionUID = 6558032305457057467L;
    private Long id;
    private Boolean status;
}
