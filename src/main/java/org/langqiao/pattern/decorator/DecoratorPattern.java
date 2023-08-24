package org.langqiao.pattern.decorator;

/**
 * @author:yangmingyang
 * @Date:2023/8/24 9:46 上午
 */
public class DecoratorPattern {

    public static void main(String[] args) {
        System.out.println("原始组件开始执行业务逻辑.......................");
        Component concreteComponent = new ConcreteComponent();
        concreteComponent.operation();

        System.out.println("...............................................................");
        System.out.println("装饰器组件开始执行业务逻辑......................");
        Component decoratorComponent = new ConcreteDecorator(concreteComponent);
        decoratorComponent.operation();
    }
}

//抽象构建角色
interface Component{
    void operation();

}

//具体的构建角色
class ConcreteComponent implements Component{

    @Override
    public void operation() {
        System.out.println("具体的构建角色调用operation方法...............");
    }
}

//抽象装饰器角色
abstract class Decorator implements Component{
    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    public void operation() {
        component.operation();
    }

}

//具体装饰器角色
class ConcreteDecorator extends Decorator{

    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        otherOperation();
    }

    public void otherOperation(){
        System.out.println("具体装饰器角色增加其他额外的功能.........");

    }
}