package com.tonkia.spring.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tonkia.spring.data.ProductMapper;
import com.tonkia.spring.vo.ProductInfo;

@Service(value = "productService")
public class ProductServiceImpl implements ProductService {
	@Resource
	private ProductMapper productMapper;

	@Override
	public ProductInfo getInfoById(int prdId) {
		return productMapper.getPrdById(prdId);
	}

}
