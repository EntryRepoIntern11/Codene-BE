package com.example.codene.domain.subject.presentation.controller;

import com.example.codene.domain.subject.presentation.dto.CreateSubjectRequest;
import com.example.codene.domain.subject.presentation.dto.UpdateSubjectRequest;
import com.example.codene.domain.subject.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/subject")
@RestController
public class SubjectController {
    private SubjectSevice subjectSevice;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void createSubject(@RequestBody CreateSubjectRequest subjectDto) {
        subjectSevice.createSubject(subjectDto);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{subject_id}")
    public void deleteSubjet(@PathVariable("subject_id") Long id) {
        subjectSevice.deleteSubject(id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{subject_id}")
    public void UpdateSubject(@PathVariable("subject_id") Long id, @RequestBody UpdateSubjectRequest updateSubjectDto) {
        subjectSevice.updateSubject(id, updateSubjectDto);
    }
}
