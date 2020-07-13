package guru.springframework.didemo;

import guru.springframework.didemo.controllers.ConstructorInjectedController;
import guru.springframework.didemo.controllers.MyController;
import guru.springframework.didemo.controllers.PropertyInjectedController;
import guru.springframework.didemo.controllers.SetterInjectController;
import guru.springframework.didemo.examplebeans.FakeDataSource;
import guru.springframework.didemo.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
     ApplicationContext ctx= SpringApplication.run(DiDemoApplication.class, args);
        MyController controller=(MyController)ctx.getBean("myController");
/*        controller.hello();*/
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHallo());
        System.out.println(ctx.getBean(SetterInjectController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

        FakeDataSource fakeDataSource=(FakeDataSource)ctx.getBean(FakeDataSource.class);
        System.out.println("UserName:::"+fakeDataSource.getUserName());
        FakeJmsBroker fakeJmsBroker=(FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
        System.out.println("JMS UserName:::"+fakeJmsBroker.getUserName());
    }

}
