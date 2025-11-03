package com.example.codene.domain.subject.service;

import com.example.codene.domain.subject.presentation.dto.CreateSubjectDto;
import com.example.codene.domain.subject.entity.Subject;
import com.example.codene.domain.subject.entity.repository.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CreateSubjectSevice {

    @Autowired
    private SubjectRepository subjectRepository;

    public void createSubject(CreateSubjectDto subjectDto){
        Subject subject = new Subject();
        subject.updateSubject(subjectDto.getTitle(), subjectDto.getContents());
        subjectRepository.save(subject);
    }
}
