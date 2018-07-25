package com.tonkia.spring.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tonkia.spring.service.ProductService;
import com.tonkia.spring.vo.ProductInfo;

@Controller
@RequestMapping(value = "/product")
public class ProductController {
	@Resource
	private ProductService productService;

	// @RequestMapping(value = "/getInfoById")
	// public ModelAndView getPrdInfo(int prdId) {
	// ProductInfo pi = productService.getInfoById(prdId);
	// ModelAndView mav = new ModelAndView();
	// mav.getModel().put("res", pi);
	// mav.setViewName("jsonView");
	// return mav;
	// }

	@RequestMapping(value = "/getInfoById")
	@ResponseBody
	public ProductInfo getPrdInfo(int prdId) {
		ProductInfo pi = productService.getInfoById(prdId);
		return pi;
	}

}
