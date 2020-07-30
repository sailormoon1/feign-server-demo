# feign-server-demo
结合另外两个项目一起搭建一个eureka server 
一个feign-server,一个feign-client,通过调用feignClient调用feign-server中的http请求（就像调自己的接口service一样）
客户端在写服务端feign接口时一定要指定全url，否则404
feign客户端调用url:http://127.0.0.1:8080/api/get
