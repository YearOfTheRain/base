package com.base.demo.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.base.demo.model.TestTable;
import com.base.demo.mapper.ISysMenuCopyMapper;
import com.base.demo.service.ISysMenuCopyService;
import org.springframework.stereotype.Service;

/**
 * @author Shulin Li
 * @version v1.0
 * @program base
 * @description xxx
 * @date 2019-12-07 16:14
 */
@Service("sysMenuCopyService")
public class SysMenuCopyServiceImpl extends ServiceImpl<ISysMenuCopyMapper, TestTable>
        implements ISysMenuCopyService {

}
