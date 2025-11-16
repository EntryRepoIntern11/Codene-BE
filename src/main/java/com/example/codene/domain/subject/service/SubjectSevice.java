package com.example.codene.domain.subject.service;

import com.example.codene.domain.subject.presentation.dto.CreateSubjectRequest;
import com.example.codene.domain.subject.entity.Subject;
import com.example.codene.domain.subject.entity.repository.SubjectRepository;
import com.example.codene.domain.subject.presentation.dto.UpdateSubjectRequest;
import com.example.codene.global.exception.NotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SubjectSevice {

    private final SubjectRepository subjectRepository;


    public void createSubject(CreateSubjectRequest subjectDto){
        Subject subject = new Subject();
        subject.updateSubject(subjectDto.getTitle(), subjectDto.getContents());
        subjectRepository.save(subject);
    }

    @Transactional
    public void deleteSubject(Long id){
        subjectRepository.findById(id)
                .orElseThrow(()-> new NotFoundException("게시글이 없습니다."));

        subjectRepository.deleteById(id);
    }

    public void updateSubject(Long id, UpdateSubjectRequest updateSubjectDto) {
        Subject subject = subjectRepository.findById(id)
                .orElseThrow(()-> new NotFoundException("게시글이 없습니다."));
        subject.updateSubject(updateSubjectDto.getTitle(), updateSubjectDto.getContents());
        subjectRepository.save(subject);
    }
}
