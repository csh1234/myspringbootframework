#一：学习springboot整合Mybatis
###https://gitee.com/beany/mySpringBoot

#二：配置数据连接池
###http://127.0.0.1:8080/druid

#三：请求结果封装成统一格式
##{
    "code": 200,
    "msg": "success",
    "data": {
        "id": "3",
        "userName": "大大撒",
        "password": null
    }
}
#四：自定义消息转换器
##{
      "code": 200,
      "data": {
          "id": "5",
          "password": "",
          "userName": ""
      },
      "msg": "success"
  }
#五：添加全局异常处理

#六: 添加Swagger2来在线自动生成接口的文档+测试功能
##127.0.0.1:8080/swagger-ui.html
##注意这里需要给他默认的ui页面位置
#七：添加PageHelper分页查询功能
#八：集成通用 Mapper功能
注意，之前user_info表主键为int类型，现修改为varchar;

注意，使用通用mapper需要在实体类的id加上@Id

注意，继承的最好实现一下方法，这样才能确保你的mapper.xml做好映射
#九：集成generator自动生成model，xml，dao功能
插入数据库字段要跟数据库一一对应，大小都要一致
#十：通过freemarker自动生成service，serviceImpl，controller功能
鸡肋，不需要
#十一：reids
注意参数的转换
#十三：添加防止XSS攻击功能

#十四：添加shiro权限保护接口功能****后期在做

#十八：添加项目启动时初始化资源功能
需要注意：数字越小，优先级越高，也就是@Order(1)注解的类会在@Order(2)注解的类之前执行。
#十九：添加拦截器功能

#二十：添加定时任务功能

#二十一：添加aop异步记录日志功能