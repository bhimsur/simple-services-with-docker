package com.bhimsur.api.dto;

import com.bhimsur.api.model.ToDo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ToDoList implements Serializable {
    private static final long serialVersionUID = 1261946247618694047L;
    private List<ToDo> toDoList;
}
