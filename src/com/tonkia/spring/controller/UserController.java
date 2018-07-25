package com.tonkia.spring.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tonkia.spring.service.UserService;
import com.tonkia.spring.vo.UserInfo;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping(value = "/login")
	public ModelAndView login(String account, String pwd, HttpServletRequest resp) {
		ModelAndView mav = new ModelAndView();
		UserInfo ui = userService.getUserInfoByAccount(account);
		if (ui != null) {
			if (ui.getPwd().equals(pwd)) {
				resp.getSession().setAttribute("user", ui);
				// �ض����ǰ׺
				mav.setViewName("redirect:/home.jsp");
			} else {
				mav.getModel().put("msg", "�������");
				mav.setViewName("/index.jsp");
			}
		} else {
			mav.getModel().put("msg", "�û������ڣ�");
			mav.setViewName("/index.jsp");
		}
		return mav;
	}

	@RequestMapping(value = "/register")
	public ModelAndView register(UserInfo ui) {
		ModelAndView mav = new ModelAndView();
		int i = userService.registerUserInfo(ui);
		mav.setViewName("/index.jsp");
		if (i > 0) {
			mav.getModel().put("msg", "ע��ɹ���");
		} else {
			mav.getModel().put("msg", "ע��ʧ�ܣ�");
		}
		return mav;
	}
}
