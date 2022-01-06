package filter;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * filter 공부 1
 * 2022.01.06
 * init메소드가 맨 밑 - 알파벳 순
 */
@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
					, urlPatterns = { "/first" })
public class FlowFilter implements Filter {
	
    public FlowFilter() {
    	System.out.println("FlowFilter 객체 생성");
    }
	public void destroy() {
		
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("---- 서블릿 수행 전 생성");
		chain.doFilter(request, response);
		System.out.println("---- 서블릿 수행 후 생성");
	}
	// 필터가 객체 생성할 때 - 서버가 기동할 때(서버 죽을 때까지 유지)
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("FlpwFilter 객체 초기화");
	}

}
