package guru.springframework.didemo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class LifeCycleDemoBean  implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("I am in LifeCycleBean Constructor");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## My Bean name is"+name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## The LifeCycleBean has bean determined");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The LifeCycleBean has its properties");
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("## Post Construct annotation method");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("## Pre Destroy annotation method");
    }
    public void beforeInit(){
        System.out.println("## Before Init - called by Bean Post Processor ");
    }
    public void afterInit(){
        System.out.println("## After Init - called by Bean Post Processor ");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## ABeanFactory  has been set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## ApplicationContext has been set ");
    }
}
