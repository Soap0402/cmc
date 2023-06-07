package com.gtec.cmc.dto;

import com.gtec.cmc.entity.SurveyEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class SurveyDto {
    private Long id;
    private String gender;
    private String age;
    private String marry;
    private String money;
    private String relation;

    public static SurveyDto toSurveyDto(SurveyEntity surveyEntity){
        SurveyDto surveyDto = new SurveyDto();
        surveyDto.setId(surveyEntity.getId());
        surveyDto.setAge(surveyEntity.getAge());
        surveyDto.setGender(surveyEntity.getGender());
        surveyDto.setMarry(surveyEntity.getMarry());
        surveyDto.setMoney(surveyEntity.getMoney());
        surveyDto.setRelation(surveyEntity.getRelation());

        return surveyDto;
    }
}
