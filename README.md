# 考试系统后端

基于Spring Boot开发的在线考试系统后端API，提供学生考试、教师组卷、管理员管理等功能的接口服务。

## 功能特点

- 用户认证与授权
- 题库与试卷管理
- 考试记录与成绩管理
- 系统管理功能

## 技术栈

- Spring Boot
- Spring Security
- MyBatis-Plus
- Redis
- MySQL

## 部署运行

### 环境要求
- JDK 8+
- Maven 3.6+
- MySQL 5.7+
- Redis

### 数据库配置
1. 创建数据库 `exam_db`
2. 导入 `bank.sql` 文件

### 启动应用
```bash
# 打包
mvn clean package

# 运行
java -jar target/exam-admin-0.0.1-SNAPSHOT.jar
```

## 配合前端

本项目需要配合前端项目使用，前端仓库地址：[exam-frontend](https://github.com/zkn688/exam-frontend)

## API文档

启动应用后，访问 http://localhost:8080/swagger-ui.html 查看API文档 