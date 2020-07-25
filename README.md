# 实现了公共模块依赖引用和jpa实现数据库增删改查

- 依赖添加
~~~
    <!--公共的依赖-->
    <dependency>
        <groupId>com.example</groupId>
        <artifactId>cluster-common</artifactId>
        <version>0.0.1-SNAPSHOT</version>
        <scope>compile</scope>
    </dependency>

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
        <version>2.2.0.RELEASE</version>
    </dependency>
    <!--Mysql 驱动包-->
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <scope>runtime</scope>
    </dependency>
~~~

- 注解支持
~~~
@EnableJpaRepositories(basePackages = "com.example")
@EntityScan("com.example.common.entity")
~~~

- 接口实现
~~~
    public interface UserRepository extends JpaRepository<User, Integer> {
    }
~~~
