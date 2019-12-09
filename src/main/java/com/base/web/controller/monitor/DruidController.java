package com.base.web.controller.monitor;

import com.base.common.core.controller.BaseController;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * druid 监控
 *
 * @author administrator
 */
@Controller
@RequestMapping("/monitor/data")
public class DruidController extends BaseController {
    private String prefix = "/druid";

    @RequiresPermissions("monitor:data:view")
    @GetMapping()
    public String index() {
        return redirect(prefix + "/index");
    }
}
