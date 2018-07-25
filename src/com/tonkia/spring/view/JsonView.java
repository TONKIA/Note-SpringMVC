package com.tonkia.spring.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.AbstractView;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonView extends AbstractView {

	// Java下常见的Json类库有Gson、JSON-lib和Jackson等，Jackson相对来说比较高效
	private static ObjectMapper om = new ObjectMapper();

	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest req, HttpServletResponse resp)
			throws Exception {
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("application/json");

		Object obj = model.get("res");
		om.writeValue(resp.getWriter(), obj);
	}

}
