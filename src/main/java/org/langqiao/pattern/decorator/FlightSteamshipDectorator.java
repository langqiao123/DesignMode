package org.langqiao.pattern.decorator;

/**
 * @author:yangmingyang
 * @Date:2023/8/9 4:02 下午
 */
public class FlightSteamshipDectorator extends SteamshipDectorator{

    public FlightSteamshipDectorator(Transportate transportate) {
        super(transportate);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("还能飞..........");
    }

}
