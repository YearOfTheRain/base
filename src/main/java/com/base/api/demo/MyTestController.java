package com.base.api.demo;

import com.base.common.core.controller.BaseController;
import com.base.common.core.domain.AjaxResult;
import com.base.common.core.page.TableDataInfo;
import com.base.demo.model.TestTable;
import com.base.demo.service.ISysMenuCopyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Shulin Li
 * @version v1.0
 * @program base
 * @description
 * @date 2019-12-07 16:19
 */
@Api("测试")
@RestController
@RequestMapping("/api/test1")
public class MyTestController extends BaseController {

    @Autowired
    private ISysMenuCopyService sysMenuCopyService;

    @GetMapping
    public TableDataInfo test() {
        startPage();
        List<TestTable> list = sysMenuCopyService.selectList(null);
        return getDataTable(list);
    }

    @ApiOperation("获取列表")
    @GetMapping("/list")
    public AjaxResult list() {
        return AjaxResult.success(sysMenuCopyService.selectList(null));
    }
}
