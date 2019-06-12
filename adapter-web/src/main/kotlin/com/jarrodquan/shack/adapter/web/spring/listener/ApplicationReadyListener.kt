package com.jarrodquan.shack.adapter.web.spring.listener

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.support.BeanDefinitionBuilder.genericBeanDefinition
import org.springframework.beans.factory.support.DefaultListableBeanFactory
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.ApplicationListener

class ApplicationReadyListener : ApplicationListener<ApplicationReadyEvent> {
    private val logger: Logger = LoggerFactory.getLogger(ApplicationReadyListener::class.java)

    override fun onApplicationEvent(event: ApplicationReadyEvent) {
        logger.debug("应用进入就绪状态，开始注册指定jar中的Bean...")

        val builder = genericBeanDefinition("com.jarrodquan.shack.application.implementation.ResourceServiceImpl")
        val defaultListableBeanFactory = event.applicationContext.beanFactory as DefaultListableBeanFactory

        defaultListableBeanFactory.registerBeanDefinition("resourceServiceImpl", builder.beanDefinition)
    }
}