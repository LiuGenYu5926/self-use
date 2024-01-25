package com.web.work.controller.pc;



import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @date 2023-02-13
 */

@RestController
@Api(value = "/pc/schedule", tags = {"工作事项"})
@RequestMapping("/pc/schedule")
public class WorkScheduleController {


    @Value("${mybatis.mapperLocations}")
    private String mapperLocations;

    @GetMapping("/getSchedule")
    @ApiOperation(value = "查询列表", notes = "查询列表", httpMethod = "GET", response = String.class)
    public String getSchedule(String date) {
        return "成功";
    }


}
