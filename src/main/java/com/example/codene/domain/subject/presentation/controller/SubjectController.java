package com.example.codene.domain.subject.presentation.controller;

import com.example.codene.domain.subject.presentation.dto.CreateSubjectDto;
import com.example.codene.domain.subject.presentation.dto.UpdateSubjectDto;
import com.example.codene.domain.subject.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/subject")
@RestController
public class SubjectController {
    private CreateSubjectSevice createSubjectSevice;
    private DeleteSubjectService deleteSubjectService;
    private UpdateSubjectService updateSubjectService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void createSubject(@RequestBody CreateSubjectDto subjectDto) {
        createSubjectSevice.createSubject(subjectDto);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{subject_id}")
    public void deleteSubjet(@PathVariable("subject_id") Long id) {
        deleteSubjectService.deleteSubject(id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{subject_id}")
    public void UpdateSubject(@PathVariable("subject_id") Long id, @RequestBody UpdateSubjectDto updateSubjectDto) {
        updateSubjectService.updateSubject(id, updateSubjectDto);
    }
}
