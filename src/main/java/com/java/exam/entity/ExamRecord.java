package com.java.exam.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("考试记录")
@TableName(value = "exam_record")
public class ExamRecord implements Serializable {

    @TableId(type = IdType.AUTO)
    @ApiModelProperty(value = "主键 考试主键的id", example = "1")
    private Integer recordId;

    @ApiModelProperty(value = "考试用户id", example = "1")
    private Integer userId;

    @ApiModelProperty(value = "用户考试中的答案", example = "1")
    private String userAnswers;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "考试时间", example = "2020-10-20")
    private Date examTime;

    @ApiModelProperty(value = "考试逻辑得分", example = "69")
    private Integer logicScore;

    @ApiModelProperty(value = "考试的id", example = "1")
    private Integer examId;

    @ApiModelProperty(value = "考试的题目id", example = "1")
    private String questionIds;

    @ApiModelProperty(value = "考试总得分", example = "100")
    private Integer totalScore;

    @ApiModelProperty(value = "考试错题id", example = "1,2,3")
    private String errorQuestionIds;

}
