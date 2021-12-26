package com.bhimsur.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddToDoRequest implements Serializable {
    private static final long serialVersionUID = 2163858085806782775L;
    private String subject;
    private Boolean status = Boolean.FALSE;
}
