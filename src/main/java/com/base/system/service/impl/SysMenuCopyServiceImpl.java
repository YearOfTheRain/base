package com.base.system.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.base.system.domain.TestTable;
import com.base.system.mapper.ISysMenuCopyMapper;
import com.base.system.service.ISysMenuCopyService;
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
