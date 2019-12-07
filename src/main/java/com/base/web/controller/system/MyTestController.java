package com.base.web.controller.system;

import com.base.common.core.controller.BaseController;
import com.base.common.core.page.TableDataInfo;
import com.base.system.domain.TestTable;
import com.base.system.service.ISysMenuCopyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Shulin Li
 * @version v1.0
 * @program base
 * @description
 * @date 2019-12-07 16:19
 */
@Controller
@RequestMapping("/system/test1")
public class MyTestController extends BaseController {

    @Autowired
    private ISysMenuCopyService sysMenuCopyService;

    @GetMapping
    @ResponseBody
    public TableDataInfo test() {
        startPage();
        List<TestTable> list = sysMenuCopyService.selectList(null);
        return getDataTable(list);
    }
}
