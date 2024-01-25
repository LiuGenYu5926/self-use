package com.web.work.domain.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 工作事项对象 work_schedule
 *
 * @author ruoyi
 * @date 2023-02-13
 */

@ApiModel(description = "工作事项对象 work_schedule")
@Data
public class WorkSchedule extends BaseEntity {
    @ApiModelProperty(hidden = true)
    private static final long serialVersionUID = 1L;

    /**
     * 事项ID
     */
    @ApiModelProperty(name = "事项ID")
    private Long itemId;

    /**
     * 用户ID
     */
    @ApiModelProperty("用户ID")

    private Long userId;

    /**
     * 部门ID
     */
    @ApiModelProperty("部门ID")

    private Long deptId;

    /**
     * 用户账号
     */
    @ApiModelProperty("用户账号")

    private String userName;

    /**
     * 用户昵称
     */
    @ApiModelProperty("用户昵称")

    private String nickName;

    /**
     * 工作事项
     */
    @ApiModelProperty("工作事项")

    private String workItems;

    /**
     * 工作开始时间
     */
    @ApiModelProperty("工作开始时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    /**
     * 工作结束时间
     */
    @ApiModelProperty("工作结束时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")

    private Date endTime;

    /**
     * 是否导出全部，是则导出全部，否则导出勾选
     */
    @ApiModelProperty("是否导出全部，是则导出全部，否则导出勾选")
    private boolean isExportAll;

    /**
     * 事项ID数组
     */
    @ApiModelProperty("事项ID数组")
    private Long[] itemList;
}
