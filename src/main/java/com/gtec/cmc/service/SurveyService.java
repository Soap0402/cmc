package com.gtec.cmc.service;

import com.gtec.cmc.dto.SurveyDto;
import com.gtec.cmc.entity.SurveyEntity;
import com.gtec.cmc.repository.SurveyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SurveyService {
    private final SurveyRepository surveyRepository;

    public void save(SurveyDto surveyDto) {
        SurveyEntity surveyEntity = SurveyEntity.toSurveyEntity(surveyDto);
        surveyRepository.save(surveyEntity);
    }

    public List<SurveyDto> findAll(){
        List<SurveyEntity> surveyEntityList = surveyRepository.findAll();
        List<SurveyDto> surveyDtoList = new ArrayList<>();
        for(SurveyEntity surveyEntity : surveyEntityList){
            surveyDtoList.add(SurveyDto.toSurveyDto(surveyEntity));
        }
        return surveyDtoList;
    }
}
