package io.github.guit4rfre4k.designpatterns.proxy.adapter;

/**
 *
 * @author guit4rfre4k
 */
public class AdapterTargetToInit implements InitialInterface {

    private final TargetInterface targetInterfaceInstance;

    public AdapterTargetToInit(TargetInterface targetInterfaceInstance) {
        this.targetInterfaceInstance = targetInterfaceInstance;
    }

    @Override
    public void initMethod1() {
        targetInterfaceInstance.targetMethod1();
    }

    @Override
    public void initMethod2() {
        targetInterfaceInstance.targetMethod2();
    }

    @Override
    public void initMethod3() {
        targetInterfaceInstance.targetMethod3();
    }

}
