package org.chens.admin.web.controller;

import com.chens.admin.entity.SysLog;
import com.chens.admin.service.ISysLogService;
import com.chens.core.web.BaseWebController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 *  系统日志控制器
 *
 * @author chunlei.song@live.com
 * @create 2018-03-24
 */
@Controller
@RequestMapping("/sysLogController")
public class SysLogController extends BaseWebController<ISysLogService,SysLog> {


}
