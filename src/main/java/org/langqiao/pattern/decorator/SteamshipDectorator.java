package org.langqiao.pattern.decorator;

/**
 * @author:yangmingyang
 * @Date:2023/8/9 4:02 下午
 */
public abstract class SteamshipDectorator implements Transportate{

    protected Transportate transportate;

    public SteamshipDectorator(Transportate transportate) {
        this.transportate = transportate;
    }

    @Override
    public void run() {
        transportate.run();
    }

}
