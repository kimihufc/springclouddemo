package com.hjl.zuul.fiter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import java.nio.charset.Charset;
import java.util.Base64;

/**
 * @author: HJL
 * @create: 2018-12-08 12:50
 */
public class AuthorizedRequestFilter extends ZuulFilter {

    @Override
    public Object run() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        String auth = "hello:hello";
        byte[] encodedAuth = Base64.getEncoder()
            .encode(auth.getBytes(Charset.forName("US-ASCII"))); // 进行一个加密的处理
        // 在进行授权的头信息内容配置的时候加密的信息一定要与“Basic”之间有一个空格
        String authHeader = "Basic " + new String(encodedAuth);
        currentContext.addZuulRequestHeader("Authorization", authHeader);
//        currentContext.setSendZuulResponse(false);  不进行路由
        return null;
    }

    @Override
    public boolean shouldFilter() {    // 该Filter是否要执行
        return true ;
    }

    @Override
    public int filterOrder() {
        return 0;    // 设置优先级，数字越大优先级越低
    }

    @Override
    public String filterType() {
        // 在进行Zuul过滤的时候可以设置其过滤执行的位置，那么此时有如下几种类型：
        // 1、pre：在请求发出之前执行过滤，如果要进行访问，肯定在请求前设置头信息
        // 2、route：在进行路由请求的时候被调用；
        // 3、post：在路由之后发送请求信息的时候被调用；
        // 4、error：出现错误之后进行调用
        return "pre";
    }
}
