package com.bhimsur.api.service;

import com.bhimsur.api.dto.AddToDoRequest;
import com.bhimsur.api.dto.CommonResponse;
import com.bhimsur.api.dto.ToDoList;
import com.bhimsur.api.dto.UpdateToDoRequest;
import com.bhimsur.api.model.ToDo;
import com.bhimsur.api.repository.ToDoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class ToDoService {
    @Autowired
    private ToDoRepository repository;

    public ToDoList getToDoList() {
        log.info("start getToDoList");
        return ToDoList.builder().toDoList(repository.findAll()).build();
    }

    public CommonResponse updateToDo(UpdateToDoRequest request) {
        log.info("start updateToDo");
        var todoOpt = repository.findById(request.getId());
        if (todoOpt.isPresent()) {
            var todo = todoOpt.get();
            todo.setStatus(request.getStatus());
            var response = repository.save(todo);
            return CommonResponse.builder().success(response.getId() > 0).build();
        }
        return CommonResponse.builder().success(Boolean.FALSE).build();
    }

    public CommonResponse addToDo(AddToDoRequest request) {
        log.info("start addToDo");
        return CommonResponse.builder().success(repository.save(ToDo.builder().subject(request.getSubject()).status(request.getStatus()).build()).getId() > 0).build();
    }
}
