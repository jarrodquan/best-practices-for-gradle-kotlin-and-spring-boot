package com.jarrodquan.shack.web.adapter.spring.listener

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.support.BeanDefinitionBuilder.genericBeanDefinition
import org.springframework.beans.factory.support.DefaultListableBeanFactory
import org.springframework.boot.context.event.ApplicationPreparedEvent
import org.springframework.context.ApplicationListener

class ApplicationPreparedListener : ApplicationListener<ApplicationPreparedEvent> {
    private val logger: Logger = LoggerFactory.getLogger(ApplicationPreparedListener::class.java)

    override fun onApplicationEvent(event: ApplicationPreparedEvent) {
        logger.debug("应用进入准备状态，开始注册指定jar中的Bean...")

        val builder = genericBeanDefinition("com.jarrodquan.shack.application.implementation.ResourceServiceImpl")
        val defaultListableBeanFactory = event.applicationContext.beanFactory as DefaultListableBeanFactory

        defaultListableBeanFactory.registerBeanDefinition("resourceServiceImpl", builder.beanDefinition)
    }
}