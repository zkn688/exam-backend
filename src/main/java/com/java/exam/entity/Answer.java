package com.java.exam.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("答案表实体")
@TableName(value = "answer")
public class Answer implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "所有的选项信息", example = "2,3,4,5(代表ABCD四个选项)")
    private String allOption;

    @ApiModelProperty(value = "答案解析", example = "1+1=2")
    private String analysis;

    @ApiModelProperty(value = "问题id", example = "1")
    private Integer questionId;

    @ApiModelProperty(value = "正确的答案的索引", example = "allOption[index]")
    private String trueOption;

}
