package com.example.codene.domain.subject.service;

import com.example.codene.domain.subject.dto.UpdateSubjectDto;
import com.example.codene.domain.subject.entity.Subject;
import com.example.codene.domain.subject.repository.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UpdateSubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public void updateSubject(Long id, UpdateSubjectDto updateSubjectDto) {
        Subject subject = subjectRepository.findById(id).orElseThrow(); // TODO 예외처리는 언젠가 하겠조?
        subject.updateSubject(updateSubjectDto.getTitle(), updateSubjectDto.getContents());
        subjectRepository.save(subject);
    }
}
