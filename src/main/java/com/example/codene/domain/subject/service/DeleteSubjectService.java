package com.example.codene.domain.subject.service;

import com.example.codene.domain.subject.entity.repository.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DeleteSubjectService {
    private SubjectRepository subjectRepository;

    public void deleteSubject(Long id){
        subjectRepository.deleteById(id);
    }
}
