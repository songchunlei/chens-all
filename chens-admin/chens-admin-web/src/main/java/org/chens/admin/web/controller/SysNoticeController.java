package org.chens.admin.web.controller;

import com.chens.admin.entity.SysNotice;
import com.chens.admin.service.ISysNoticeService;
import com.chens.core.web.BaseWebController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 *  控制器
 *
 * @author chunlei.song@live.com
 * @create 2018-03-12
 */
@Controller
@RequestMapping("/noticeController")
public class SysNoticeController extends BaseWebController<ISysNoticeService,SysNotice> {


}
