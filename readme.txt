 基于Transactional注解的事务管理:
    ①配置文件
        <!--事务管理器 -->
        <bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
            <property name="dataSource" ref="dataSource"/>
        </bean>
        <!-- 使用注解事务，需要添加Transactional注解属性 -->
        <tx:annotation-driven transaction-manager="transactionManager"/>
        <!--启用最新的注解器、映射器-->
        <mvc:annotation-driven/>
    ②在service层需要事务的方法上加上 @Transactional注解即可