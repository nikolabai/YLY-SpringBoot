1 建立springboot工程
2 整合Mybatis
	1 datasource
	2 sqlSessionFactory
	3 MapperScannerConfigurer
	4 transactionManager
3 整合shrio
	3.1
		3.1.1 EhCacheManager
		3.1.2 Realm
		3.1.3 securityManager
		3.1.4 shiroFilter
		3.1.5 lifecycleBeanPostProcessor
		3.1.6 DefaultAdvisorAutoProxyCreator
		3.1.7 AuthorizationAttributeSourceAdvisor
4 EasyUI
	4.1引入文件
		<!-- 1、引入JQuery -->
  		<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.4.1/jquery.min.js"></script>
  		<!-- 2、引入EasyUI -->
  		<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
  		<!-- 3、引入EasyUI的中文国际化js，让EasyUI支持中文 -->
  		<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
  		<!-- 4、引入EasyUI的样式文件-->
  		<link rel="stylesheet" href="${pageContext.request.contextPath}/jquery-easyui-1.4.1/themes/default/easyui.css" type="text/css"/>
  		<!-- 5、引入EasyUI的图标样式文件-->
  		<link rel="stylesheet" href="${pageContext.request.contextPath}/jquery-easyui-1.4.1/themes/icon.css" type="text/css"/>
5 Quartz
6 Redis
7 中间件