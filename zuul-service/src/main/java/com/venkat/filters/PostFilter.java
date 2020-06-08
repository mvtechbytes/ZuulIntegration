package com.venkat.filters;

import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.common.io.CharStreams;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class PostFilter extends ZuulFilter {

	@Override
	public String filterType() {
		return "post";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		System.out.println("  ############# In Post Filter ################## ");
	/*	try {
			System.out.println(
					"Response Status Code : " + ctx.getResponseStatusCode() + " Response Body : " + CharStreams.toString(new InputStreamReader(ctx.getResponseDataStream(), "UTF-8")));
		} catch (IOException e) {
			e.printStackTrace();
		}*/

		return null;
	}

}