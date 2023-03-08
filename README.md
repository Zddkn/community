## 长大的柯南

## 项目名：研论网

## 功能列表
开源论坛、问答系统，现有功能社交平台登录Github，提问、回复、通知、最新问答等功能。

## 技术栈
|  技术   |  链接   |
| --- | --- |
|  Spring Boot   |  http://projects.spring.io/spring-boot/#quick-start   |
|   MyBatis  |  https://mybatis.org/mybatis-3/zh/index.html   |
|   MyBatis Generator  |  http://mybatis.org/generator/   |
|   MySQL  |   https://www.mysql.com/cn/  |
|   Flyway  |   https://flywaydb.org/getstarted/firststeps/maven  |
|Lombok| https://www.projectlombok.org |
|Bootstrap|https://v3.bootcss.com/getting-started/|
|Github OAuth|https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/|
|UFile|https://github.com/ucloud/ufile-sdk-java|
|Bootstrap|https://v3.bootcss.com/getting-started/|

## 本地运行手册
1. 安装必备工具  
   JDK、Maven、MySQL
2. 克隆代码到本地
```sh
git clone https://github.com/Zddkn/community.git
````
3. 运行数据库脚本，创建本地数据库
```sh
mvn flyway:migrate
```
4. 更改application.properties配置

5. 访问项目
```
http://localhost:8887
```

## 资料
[Spring 指南](https://spring.io/guides)  
[SpringBoot 参考指南](https://docs.spring.io/spring-boot/docs/2.0.3.RELEASE/reference/htmlsingle/#using-boot-starter)  
[Git/gitHub 教程](https://www.bilibili.com/video/BV1n441157Zt?p=1&vd_source=31090873fe5bbaacc7b42c8cd03d5bd0)  
[gitHub 添加ssh密钥](https://docs.github.com/zh/authentication/connecting-to-github-with-ssh/checking-for-existing-ssh-keys)  
[Bootstrap 官网](https://v3.bootcss.com/)  
[GitHub：Building OAuth App](https://docs.github.com/en/developers/apps/building-oauth-apps/creating-an-oauth-app)  
[OkHttp 官网](https://square.github.io/okhttp/)  
[H2快速入门](http://h2database.com/html/quickstart.html)  
[Spring boot Database](https://docs.spring.io/spring-boot/docs/current/reference/html/data.html#data.sql.datasource.configuration)  
[Mybatis-spring boot](http://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/index.html)  
[Flyway](https://developer.aliyun.com/article/842712)  

## 工具
[git下载](https://gitforwindows.org/)

# 脚本
1. 生成数据库的命令
```
mvn flyway:migrate
```
2. 生成 Model 等 MyBatis 配置文件的命令
```
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate

```

## 联系我
![](https://github.com/Zddkn/community/blob/master/src/main/resources/static/images/wechat.jpg)
