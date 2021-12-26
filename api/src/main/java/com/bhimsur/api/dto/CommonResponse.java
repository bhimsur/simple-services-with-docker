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
public class CommonResponse implements Serializable {
    private static final long serialVersionUID = -2011803981710869690L;
    private Boolean success;
}
