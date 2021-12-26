package com.bhimsur.api.controller;

import com.bhimsur.api.dto.AddToDoRequest;
import com.bhimsur.api.dto.CommonResponse;
import com.bhimsur.api.dto.ToDoList;
import com.bhimsur.api.dto.UpdateToDoRequest;
import com.bhimsur.api.service.ToDoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ToDoController {
    @Autowired
    private ToDoService service;

    @GetMapping("/list")
    public ToDoList getToDoList() {
        return service.getToDoList();
    }

    @PostMapping("/update")
    public CommonResponse updateToDo(@RequestBody UpdateToDoRequest request) {
        return service.updateToDo(request);
    }

    @PostMapping("/add")
    public CommonResponse addToDo(@RequestBody AddToDoRequest request) {
        return service.addToDo(request);
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
