package org.chens.admin.web.controller;

import com.chens.admin.entity.SysDictType;
import com.chens.admin.service.ISysDictTypeService;
import com.chens.core.web.BaseWebController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 *  字典类型
 *
 * @author chunlei.song@live.com
 * @create 2018-03-23
 */
@Controller
@RequestMapping("/dictTypeController")
public class SysDictTypeController extends BaseWebController<ISysDictTypeService,SysDictType> {


}
