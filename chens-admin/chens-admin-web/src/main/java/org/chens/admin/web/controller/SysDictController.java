package org.chens.admin.web.controller;

import com.chens.admin.entity.SysDict;
import com.chens.admin.service.ISysDictService;
import com.chens.core.web.BaseWebController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 *  字典值
 *
 * @author chunlei.song@live.com
 * @create 2018-03-23
 */
@Controller
@RequestMapping("/dictController")
public class SysDictController extends BaseWebController<ISysDictService,SysDict> {


}
