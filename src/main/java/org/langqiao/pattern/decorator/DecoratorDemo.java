package org.langqiao.pattern.decorator;

/**
 * @author:yangmingyang
 * @Date:2023/8/10 6:55 下午
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        Steamship steamship = new Steamship();
        steamship.run();

        System.out.println("装饰增加开始..........");
        Transportate flightSteamshipDectorator = new FlightSteamshipDectorator(steamship);
        flightSteamshipDectorator.run();
    }
}
