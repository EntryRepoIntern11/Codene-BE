package com.example.codene.domain.subject.repository;

import com.example.codene.domain.subject.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
