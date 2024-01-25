package com.web.work.domain.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 工作计划修改记录实体类
 */
@Data
public class WorkScheduleModifyRecord extends BaseEntity {
    /**
     * 记录id
     */
    @ApiModelProperty(value = "记录id")
    private Long recordId;

    /**
     * 事项id
     */
    @ApiModelProperty(value = "事项id")
    private Long itemsId;

    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id")
    private Long userId;

    /**
     * 记录上一次的数据
     */
    @ApiModelProperty(value = "记录上一次的数据")
    private String oldItems;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;
}