package com.jarrodquan.shack.web.adapter.spring

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory
import org.springframework.beans.factory.support.BeanDefinitionBuilder
import org.springframework.beans.factory.support.BeanDefinitionRegistry
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor

class CustomBeanDefinitionPostProcessor : BeanDefinitionRegistryPostProcessor {
    private val logger: Logger = LoggerFactory.getLogger(CustomBeanDefinitionPostProcessor::class.java)

    override fun postProcessBeanFactory(beanFactory: ConfigurableListableBeanFactory) {

    }

    override fun postProcessBeanDefinitionRegistry(registry: BeanDefinitionRegistry) {
        logger.debug("应用进入准备状态，开始注册指定jar中的Bean...")

        val builder = BeanDefinitionBuilder.genericBeanDefinition("com.jarrodquan.shack.application.implementation.ResourceServiceImpl")

        registry.registerBeanDefinition("resourceServiceImpl", builder.beanDefinition)
    }
}