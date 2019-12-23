package com.yzit.demo.config;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yzit.common.shiro.realm.CustomRealm;

@Configuration
public class ShiroConfig {
	
	/**
	 * shiro缓存管理器;
	 * 需要添加到securityManager中
	 * @return
	 */
	@Bean
	public EhCacheManager ehCacheManager(){
	    EhCacheManager cacheManager = new EhCacheManager();
	    cacheManager.setCacheManagerConfigFile("classpath:ehcache-shiro.xml");
	    return cacheManager;
	}

	@Bean
	public CustomRealm getCustomRealm() {
		System.out.println("----------------------------------");
		return new CustomRealm();
	}

	// 创建安全管理器
	@Bean
	SecurityManager securityManager() {
		DefaultWebSecurityManager manager = new DefaultWebSecurityManager();
		manager.setRealm(getCustomRealm());// 注入自定义realm
		 //配置 ehcache缓存管理器 参考博客：
		manager.setCacheManager(ehCacheManager());
		return manager;
	}

	@Bean
	ShiroFilterFactoryBean shiroFilterFactoryBean() {
		ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
		bean.setSecurityManager(securityManager());// 安全管理期
		bean.setLoginUrl("/login");// 设置登录页面
		bean.setSuccessUrl("/index");
		bean.setUnauthorizedUrl("/unauthorizedurl");// 没有权限请求
		Map<String, String> map = new LinkedHashMap<String, String>();
		// anon 匿名 不需要拦截
		map.put("/login", "anon");
		map.put("/doLogin", "anon");
		map.put("/unauthorizedurl", "anon");
		// 需要认证
		map.put("/**", "authc");
		bean.setFilterChainDefinitionMap(map);
		return bean;
	}

	// 开启shiro aop注解支持
	@Bean
	public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager) {
		AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
		authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
		return authorizationAttributeSourceAdvisor;
	}

	/**
	 * DefaultAdvisorAutoProxyCreator，Spring的一个bean，由Advisor决定对哪些类的方法进行AOP代理。
	 */
	@Bean
	public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
		DefaultAdvisorAutoProxyCreator defaultAAP = new DefaultAdvisorAutoProxyCreator();
		defaultAAP.setProxyTargetClass(true);
		return defaultAAP;
	}

}
