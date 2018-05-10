# LifeCat 智能成长相册管理网站
![image](https://img-blog.csdn.net/20180421144930399?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dzaDU5NjgyMzkxOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

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

### 功能简介：
	登录、注册、设置用户个人信息、修改密码、上传日记、上传图片、展示图片、使用python机器学习算法进行相册智能操作......
	
### 源代码使用需修改：
	com.wang.util包->HOST接口，修改ip，若为本机tomcat启动修改为localhost，若为云服务tomcat启动修改为对应ip地址  
	com.wang.util包->HOST接口，修改数据库配置，改为自己的数据库配置信息

### 网站预览:
	--->http://47.106.11.84--->点击“进入相册”即可进入相册首页  

### 网站展示：首页为wordpress搭建  

![image](https://img-blog.csdn.net/20180421144930399?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dzaDU5NjgyMzkxOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70) 

![image](https://img-blog.csdn.net/2018042114501570?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dzaDU5NjgyMzkxOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)  

![image](https://img-blog.csdn.net/20180421152057903?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dzaDU5NjgyMzkxOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)  

### java目录结构：
![image](https://img-blog.csdn.net/20180421144900116?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dzaDU5NjgyMzkxOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)  
	bean：数据库表结构  
	dao：数据库操作  
	util：数据库连接、时间设置、主机设置  
	filter：字符过滤、表格过滤  
	form：表格验证  
	model：具体操作逻辑  
	service：servlet操作  

### jsp目录结构：

![image](https://img-blog.csdn.net/2018042115305452?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dzaDU5NjgyMzkxOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)  
![image](https://img-blog.csdn.net/20180421153106924?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dzaDU5NjgyMzkxOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)  

### 数据表配置：
	user表  
	usermsg表
	diary表
	upimage表
	
![image](https://img-blog.csdn.net/20180421151810326?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dzaDU5NjgyMzkxOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)    
![image](https://img-blog.csdn.net/20180421151850742?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dzaDU5NjgyMzkxOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)    
![image](https://img-blog.csdn.net/20180421151911221?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dzaDU5NjgyMzkxOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)    
![image](https://img-blog.csdn.net/20180421151922599?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dzaDU5NjgyMzkxOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)    
![image](https://img-blog.csdn.net/20180421151933913?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dzaDU5NjgyMzkxOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)    

------
# PS：在linux云服务器环境下搭建javaweb开发环境
[CSDN教程](https://blog.csdn.net/wsh596823919/article/details/79717993) 

