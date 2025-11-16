package com.example.codene.domain.code.presentation.controller;

import com.example.codene.domain.code.presentation.dto.CreateCodeRequest;
import com.example.codene.domain.code.presentation.dto.UpdateCodeRequest;
import com.example.codene.domain.code.service.CodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/code")
public class CodeController {

    private final CodeService createCodeSevice;

    @PostMapping("/post")
    public void createCode(@RequestBody CreateCodeRequest request){
        createCodeSevice.createCode(request);
    }

    @DeleteMapping("/{code_id}")
    public void deleteCode(@PathVariable("code_id") Long id){
        createCodeSevice.deleteCode(id);
    }

    @PutMapping("/{code_id}")
    public void updateCode(@PathVariable("code_id") Long id, @RequestBody UpdateCodeRequest request){
        createCodeSevice.updateCode(id, request);
    }
}
