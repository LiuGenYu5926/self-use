package com.web.work.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * Entity基类
 *
 * @author ruoyi
 */
@ApiModel(description = "Entity基类")
@Data
public class BaseEntity implements Serializable {
    @ApiModelProperty(hidden = true)
    private static final long serialVersionUID = 1L;

    /**
     * 搜索值
     */
    @ApiModelProperty("")
    private String searchValue;

    /**
     * 创建者
     */
    @ApiModelProperty("")
    private String createBy;

    /**
     * 创建时间
     */
    @ApiModelProperty("")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 更新者
     */
    @ApiModelProperty("")
    private String updateBy;

    /**
     * 更新时间
     */
    @ApiModelProperty("")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /**
     * 备注
     */
    @ApiModelProperty("")
    private String remark;

    /**
     * 请求参数
     */
    @ApiModelProperty("")
    private Map<String, Object> params;
}