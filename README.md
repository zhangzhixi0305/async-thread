# async-thread
@Async注解默认的执行器是：SimpleAsyncTaskExecutor，据此，每次都会启动一个新线程来执行被@Async注解的方法，也就是说，默认情况下是对每个请求都会创建一个新的线程。

​	然而，在很多实际应用中，我们可能需要使用线程池来管理这些被@Async注解的方法，以达到复用线程、合理管理资源的目的。这时我们可以在Spring配置中定义一个ThreadPoolTaskExecutor，然后在@Async注解中通过value参数来指定使用这个自定义的线程池。

