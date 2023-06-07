package com.gtec.cmc.entity;

import com.gtec.cmc.dto.SurveyDto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "surveydata")
public class SurveyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String gender;
    @Column
    private String age;
    @Column
    private String marry;
    @Column
    private String money;
    @Column
    private String relation;

    public static SurveyEntity toSurveyEntity(SurveyDto surveyDto){
        SurveyEntity surveyEntity = new SurveyEntity();
        surveyEntity.setId(surveyDto.getId());
        surveyEntity.setGender(surveyDto.getGender());
        surveyEntity.setAge(surveyDto.getAge());
        surveyEntity.setMarry(surveyDto.getMarry());
        surveyEntity.setMoney(surveyDto.getMoney());
        surveyEntity.setRelation(surveyDto.getRelation());

        return surveyEntity;
    }

}
