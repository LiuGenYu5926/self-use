//package com.web.work.controller.pc;
//
//
//import com.web.user.system.dto.WorkScheduleModifyRecord;
//import com.web.user.system.service.WorkScheduleModifyRecordService;
//import com.web.user.system.vo.WorkScheduleModifyRecordVo;
//import com.web.work.domain.dto.WorkScheduleModifyRecord;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//
//@RestController
//@Api(value = "/pc/record", tags = {"工作计划历史修改记录"})
//@RequestMapping("/pc/record")
//public class WorkScheduleModifyRecordController {
//    @Autowired
//    private WorkScheduleModifyRecordService workScheduleModifyRecordService;
//
//    @ApiOperation(value = "获取指定历史记录详情", httpMethod = "GET", response = WorkScheduleModifyRecord.class)
//    @GetMapping("/info")
//    public WorkScheduleModifyRecord getInfo(@RequestParam Long recordId) {
//        WorkScheduleModifyRecord workScheduleModifyRecord = workScheduleModifyRecordService.selectWorkScheduleModifyRecord(recordId);
//        return workScheduleModifyRecord;
//    }
//
//
//    @ApiOperation(value = "获取工作事项历史记录列表", response = WorkScheduleModifyRecordVo.class)
//    @GetMapping("/history/info")
//    public List<WorkScheduleModifyRecordVo> getHistoryRecord(@RequestParam Long itemsId) {
//        List<WorkScheduleModifyRecordVo> list = workScheduleModifyRecordService.selectWorkScheduleHistoryRecord(itemsId);
//        return list;
//    }
//
//    @ApiOperation(value = "新增工作事项历史修改记录", httpMethod = "POST")
//    @PostMapping("/add")
//    public int addRecord(@RequestBody WorkScheduleModifyRecord workScheduleModifyRecord) {
//        int id = workScheduleModifyRecordService.insertWorkScheduleModifyRecord(workScheduleModifyRecord);
//        return id;
//    }
//
//
//}
