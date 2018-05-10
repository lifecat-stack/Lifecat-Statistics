# LifeCat 智能成长相册管理网站
![image](https://img-blog.csdn.net/20180421144930399?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dzaDU5NjgyMzkxOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

## web开发设计
使用Intellijidea进行软件的开发，前端静态页面采用html+css+bootstrap实现，同时采用javascript+jQuery+Ajax进行了页面的动态脚本设置。后端基于MVC架构，表现层采用jsp进行动态页面开发，控制层采用servlet，模型层使用Javabean实现，实现了松耦合的设计，加入了表单验证机制，能够更有效地进行访问控制。Web容器使用tomcat部署，tomcat提供了多线程支持、生命周期管理以及安全性配置等功能，使得web应用具有健壮性。

### 主要页面：

	产品官网：通过WordPress框架进行开发，进行产品的展示及宣传

	相册主页：通过JavaScript进行动态的主页展示和用户的登录/注册功能

	用户界面：通过JavaScript脚本将页面分为“用户信息”“成长寄语”“成长相册”三个模块，根据点击选择每次显示其中一个，用户可以在此进行设置信息、修改密码等操作，并通过链接访问到其他界面。

	相册展示页面：通过访问数据库获取图片url，然后调用IO流将图片显示到界面。

### 主要功能：

	用户登录/注册：通过jdbc操作user数据表，验证及更新用户账户信息

	用户信息修改：通过jdbc操作usermsg数据表，能够设置用户的信息

	图片上传：通过javaIO流，将要上传的图片以二进制流方式写入服务器文件夹，并在upimage数据表中存储图片在服务器上的路径。

	图片展示：根据用户id从upimage数据表获取图片的存储路径，通过javaIO流方式将图片信息传输显示到前端显示页面。

## 版本管理
### version1.x:使用jsp+servlet+jdbc实现
	version1.0
		--初始版本
	version1.1
		--添加了logger
		--添加了图片上传显示的功能
	version1.2
		--添加了相册智能分类界面
		
### version2.x:使用spring+springMVC实现
	version2.0
		--初始spring版本
		
### MVC
![image](https://img-blog.csdn.net/20180510163217454?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dzaDU5NjgyMzkxOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

### 功能简介：
	登录、注册、设置用户个人信息、修改密码、上传日记、上传图片、展示图片、使用python机器学习算法进行相册智能操作......
![image](https://img-blog.csdn.net/20180510163251506?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dzaDU5NjgyMzkxOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
	
### 源代码使用需修改：
	com.wang.util包->HOST接口，修改ip，若为本机tomcat启动修改为localhost，若为云服务tomcat启动修改为对应ip地址  
	com.wang.util包->HOST接口，修改数据库配置，改为自己的数据库配置信息

### 网站预览:
	--->http://47.106.11.84--->点击“进入相册”即可进入相册首页  

### 网站展示：首页为wordpress搭建  

![image](https://img-blog.csdn.net/20180421144930399?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dzaDU5NjgyMzkxOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70) 

![image](https://img-blog.csdn.net/20180510162236159?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dzaDU5NjgyMzkxOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)  

![image](https://img-blog.csdn.net/20180510162329894?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dzaDU5NjgyMzkxOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)  

![image](https://img-blog.csdn.net/20180510162344150?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dzaDU5NjgyMzkxOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70    )  

![image](https://img-blog.csdn.net/20180510162356345?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dzaDU5NjgyMzkxOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)  

![image](https://img-blog.csdn.net/20180510162415759?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dzaDU5NjgyMzkxOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)  

### java目录结构： 
	version1.x
		bean：数据库表结构  
		dao：数据库操作  
		util：数据库连接、时间设置、主机设置  
		filter：字符过滤、表格过滤  
		form：表格验证  
		model：具体操作逻辑  
		service：servlet操作  
	version2.x
		null

### 数据表配置：
	version1.x
		user表  
		usermsg表
		diary表
		upimage表
	version2.x
		null
	
![image](https://img-blog.csdn.net/20180421151810326?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dzaDU5NjgyMzkxOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)    
![image](https://img-blog.csdn.net/20180421151850742?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dzaDU5NjgyMzkxOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)    
![image](https://img-blog.csdn.net/20180421151911221?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dzaDU5NjgyMzkxOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)    
![image](https://img-blog.csdn.net/20180421151922599?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dzaDU5NjgyMzkxOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)    
![image](https://img-blog.csdn.net/20180421151933913?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dzaDU5NjgyMzkxOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)    

------
# PS：[在linux云服务器环境下搭建javaweb开发环境](https://blog.csdn.net/wsh596823919/article/details/79717993) 

