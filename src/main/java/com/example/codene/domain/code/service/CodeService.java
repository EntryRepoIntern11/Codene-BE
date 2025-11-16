package com.example.codene.domain.code.service;

import com.example.codene.domain.code.entity.Code;
import com.example.codene.domain.code.entity.repository.CodeRepository;
import com.example.codene.domain.code.presentation.dto.CreateCodeRequest;
import com.example.codene.domain.code.presentation.dto.UpdateCodeRequest;
import com.example.codene.global.error.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CodeService {

    private final CodeRepository codeRepository;

    public void createCode(CreateCodeRequest request){
        Code code = new Code();
        code.updateCode(request.getTitle(), request.getContents(), request.getLanguage());
        codeRepository.save(code);
    }

    public void deleteCode(Long id){
        codeRepository.deleteById(id);
    }

    public void updateCode(Long id, UpdateCodeRequest updateCodeDto) {
        Code code = codeRepository.findById(id)
                .orElseThrow(()-> new NotFoundException("게시글이 없습니다."));

        code.updateCode(updateCodeDto.getTitle(), updateCodeDto.getContents(), updateCodeDto.getLanguage());
    }
}
