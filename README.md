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
<img src="https://github.com/Zddkn/community/blob/master/src/main/resources/static/images/wechat.jpg" width="450px" />
