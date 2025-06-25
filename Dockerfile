FROM openjdk:8-jdk-alpine

WORKDIR /app

# 添加Maven包
COPY target/*.jar app.jar

# 暴露端口
EXPOSE 8080

# 设置时区
RUN apk add --no-cache tzdata && \
    cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && \
    echo "Asia/Shanghai" > /etc/timezone && \
    apk del tzdata

# 启动命令
ENTRYPOINT ["java","-jar","app.jar"] 