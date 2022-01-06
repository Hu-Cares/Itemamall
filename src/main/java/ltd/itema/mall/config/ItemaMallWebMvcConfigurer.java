
package ltd.itema.mall.config;

import ltd.itema.mall.interceptor.*;
import ltd.itema.mall.interceptor.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ItemaMallWebMvcConfigurer implements WebMvcConfigurer {
    @Autowired
    private AdminLoginInterceptor adminLoginInterceptor;
    @Autowired
    private ItemaMallLoginInterceptor itemaMallLoginInterceptor;
    @Autowired
    private ItemaMallCartNumberInterceptor itemaMallCartNumberInterceptor;
    @Autowired
    private RepeatSubmitInterceptor repeatSubmitInterceptor;
    @Autowired
    private ShopLoginInterceptor shopLoginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 添加一个拦截器，拦截以/admin为前缀的url路径（后台登陆拦截）
        registry.addInterceptor(adminLoginInterceptor)
                .addPathPatterns("/admin/**")
                .excludePathPatterns("/admin/login")
                .excludePathPatterns("/admin/dist/**")
                .excludePathPatterns("/admin/plugins/**");
        //增加一个拦截器，拦截以/shop为前缀的url路径(商城登录拦截)
        registry.addInterceptor(shopLoginInterceptor)
                .addPathPatterns("/shop/**");
        // 购物车中的数量统一处理
        registry.addInterceptor(itemaMallCartNumberInterceptor)
                .excludePathPatterns("/admin/**")
                .excludePathPatterns("/register")
                .excludePathPatterns("/login")
                .excludePathPatterns("/logout");
        // 商城页面登陆拦截
        registry.addInterceptor(itemaMallLoginInterceptor)
                .excludePathPatterns("/admin/**")
                .excludePathPatterns("/register")
                .excludePathPatterns("/login")
                .excludePathPatterns("/logout")
                .addPathPatterns("/goods/detail/**")
                .addPathPatterns("/shop-cart")
                .addPathPatterns("/search")
                .addPathPatterns("/couponList")
                .addPathPatterns("/myCoupons")
                .addPathPatterns("/coupon/**")
                .addPathPatterns("/seckill")
                .addPathPatterns("/seckillExecution/**")
                .addPathPatterns("/seckillSettle/**")
                .addPathPatterns("/shop-cart/**")
                .addPathPatterns("/saveOrder")
                .addPathPatterns("/orders")
                .addPathPatterns("/orders/**")
                .addPathPatterns("/personal")
                .addPathPatterns("/personal/updateInfo")
                .addPathPatterns("/selectPayType")
                .addPathPatterns("/shop_register")
                .addPathPatterns("/payPage");
        // 防止重复提交拦截
        registry.addInterceptor(repeatSubmitInterceptor).addPathPatterns("/**");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
       // registry.addResourceHandler("/upload/**").addResourceLocations("file:" + ProjectConfig.getFileUploadPath());
        //registry.addResourceHandler("/goods-img/**").addResourceLocations("file:" + ProjectConfig.getFileUploadPath());
    }
}
