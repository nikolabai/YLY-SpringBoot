package com.yly.config;

import java.util.LinkedHashMap;

import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yly.shiro.ShiroRealm;



/**
 * 
 * @author Gavin
 * @2017年11月21日
 */
@Configuration
public class ShiroConfig {

    private static final Logger logger = LoggerFactory.getLogger(ShiroConfig.class);

    @Bean
    public EhCacheManager getEhCacheManager() {  
        EhCacheManager em = new EhCacheManager();  
        em.setCacheManagerConfigFile("classpath:ehcache-shiro.xml");  
        return em;  
    }  

    @Bean(name = "AuthShiroRealm")
    public ShiroRealm authShiroRealm(EhCacheManager cacheManager) {  
    	ShiroRealm realm = new ShiroRealm(); 
        realm.setCacheManager(cacheManager);
        return realm;
    }  

    

    @Bean(name = "securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(ShiroRealm authShiroRealm) {
        DefaultWebSecurityManager dwsm = new DefaultWebSecurityManager();
        dwsm.setRealm(authShiroRealm);
//      <!-- 用户授权/认证信息Cache, 采用EhCache 缓存 --> 
        dwsm.setCacheManager(getEhCacheManager());
        return dwsm;
    }
    /**
     * ShiroFilter<br/>
     * 注意这里参数中的 StudentService 和 IScoreDao 只是一个例子，因为我们在这里可以用这样的方式获取到相关访问数据库的对象，
     * 然后读取数据库相关配置，配置到 shiroFilterFactoryBean 的访问规则中。实际项目中，请使用自己的Service来处理业务逻辑。
     *
     * @param myShiroRealm
     * @param stuService
     * @param scoreDao
     * @return
     * @author SHANHY
     * @create  2016年1月14日
     */
    @Bean(name = "shiroFilter")
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(DefaultWebSecurityManager securityManager) {

        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        // 必须设置 SecurityManager  
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        // 如果不设置默认会自动寻找Web工程根目录下的"/login.jsp"页面
        shiroFilterFactoryBean.setLoginUrl("/login");
        // 登录成功后要跳转的连接
        shiroFilterFactoryBean.setSuccessUrl("/user");
        shiroFilterFactoryBean.setUnauthorizedUrl("/403");

      //配置访问权限
        LinkedHashMap<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
        filterChainDefinitionMap.put("/pages/login.jsp*", "anon"); //表示可以匿名访问
        filterChainDefinitionMap.put("/loginIn", "anon");
        filterChainDefinitionMap.put("/logout*", "anon");
        filterChainDefinitionMap.put("/pages/error/**", "anon");
        filterChainDefinitionMap.put("/component/**", "anon");
        filterChainDefinitionMap.put("/css/**", "anon");
        filterChainDefinitionMap.put("/images/**", "anon");
        filterChainDefinitionMap.put("/js/**", "anon");
        filterChainDefinitionMap.put("/static/**", "anon");
        filterChainDefinitionMap.put("/*", "authc");//表示需要认证才可以访问
        filterChainDefinitionMap.put("/*.*", "authc");
        filterChainDefinitionMap.put("/**", "authc");//表示需要认证才可以访问
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;
    }
    @Bean(name = "lifecycleBeanPostProcessor")
    public LifecycleBeanPostProcessor getLifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }

    @Bean
    public DefaultAdvisorAutoProxyCreator getDefaultAdvisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator daap = new DefaultAdvisorAutoProxyCreator();
        daap.setProxyTargetClass(true);
        return daap;
    }
    @Bean
    public AuthorizationAttributeSourceAdvisor getAuthorizationAttributeSourceAdvisor(DefaultWebSecurityManager securityManager) {
    	AuthorizationAttributeSourceAdvisor aasa = new AuthorizationAttributeSourceAdvisor();
    	aasa.setSecurityManager(securityManager);
    	return aasa;
    }

}
