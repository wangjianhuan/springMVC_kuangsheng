###笔记地址
https://blog.csdn.net/qq_33369905/article/details/106647319?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522163897109216780274189667%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=163897109216780274189667&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_positive~default-3-106647319.pc_search_result_control_group&utm_term=springmvc&spm=1018.2226.3001.4187

### 可能遇到启动404

原因为tomcat缺少lib依赖

在idea中添加



##简要分析执行流程

1.DispatcherServlet表示前置控制器，是整个SpringMVC的控制中心。用户发出请求，DispatcherServlet接收请求并拦截请求。

我们假设请求的url为 : http://localhost:8080/SpringMVC/hello


如上url拆分成三部分：

http://localhost:8080服务器域名

SpringMVC部署在服务器上的web站点

hello表示控制器

通过分析，如上url表示为：请求位于服务器localhost:8080上的SpringMVC站点的hello控制器。

2.HandlerMapping为处理器映射。DispatcherServlet调用HandlerMapping,HandlerMapping根据请求url查找Handler。

3.HandlerExecution表示具体的Handler,其主要作用是根据url查找控制器，如上url被查找控制器为：hello。

4.HandlerExecution将解析后的信息传递给DispatcherServlet,如解析控制器映射等。

5.HandlerAdapter表示处理器适配器，其按照特定的规则去执行Handler。

6.Handler让具体的Controller执行。

7.Controller将具体的执行信息返回给HandlerAdapter,如ModelAndView。

8.HandlerAdapter将视图逻辑名或模型传递给DispatcherServlet。

9.DispatcherServlet调用视图解析器(ViewResolver)来解析HandlerAdapter传递的逻辑视图名。

10.视图解析器将解析的逻辑视图名传给DispatcherServlet。

11.DispatcherServlet根据视图解析器解析的视图结果，调用具体的视图。

12.最终视图呈现给用户。