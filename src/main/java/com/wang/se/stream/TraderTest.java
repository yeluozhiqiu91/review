package com.wang.se.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by wang on 2018/4/10.
 */
public class TraderTest {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        /*(1) 找出2011年发生的所有交易，并按交易额排序（从低到高）。
        (2) 交易员都在哪些不同的城市工作过？
        (3) 查找所有来自于剑桥的交易员，并按姓名排序。
        (4) 返回所有交易员的姓名字符串，按字母顺序排序。
        (5) 有没有交易员是在米兰工作的？
        (6) 打印生活在剑桥的交易员的所有交易额。
        (7) 所有交易中，最高的交易额是多少？
        (8) 找到交易额最小的交易。*/
        List<Transaction> list1=transactions.stream().filter(t->t.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
        System.out.println("1.找出2011年发生的所有交易，并按交易额排序（从低到高）:"+list1);
        List<String> list2=transactions.stream().map(d->d.getTrader().getCity()).distinct().collect(Collectors.toList());
        System.out.println("2.交易员都在哪些不同的城市工作过:"+list2);
        List<Trader> list3=transactions.stream().filter(d->d.getTrader().getCity().equals("Cambridge")).map(d->d.getTrader()).sorted(Comparator.comparing(Trader::getName)).distinct().collect(Collectors.toList());
        System.out.println("3.查找所有来自于剑桥的交易员，并按姓名排序："+list3);
        List<String> list4=transactions.stream().map(d->d.getTrader().getName()).distinct().sorted().collect(Collectors.toList());
        System.out.println("4.返回所有交易员的姓名字符串，按字母顺序排序："+list4);
        Optional<Trader> trader=transactions.stream().filter(d->d.getTrader().getCity().equals("Milan")).map(d->d.getTrader()).findAny();
        System.out.println("5.有没有交易员是在米兰工作的："+trader.get());
        List<Integer> list6=transactions.stream().filter(d->d.getTrader().getCity().equals("Cambridge")).map(d->d.getValue()).collect(Collectors.toList());
        System.out.println("6.打印生活在剑桥的交易员的所有交易额:"+list6);
        Optional<Integer> max=transactions.stream().map(d->d.getValue()).reduce(Integer::max);
        System.out.println("7.所有交易中，最高的交易额是多少:"+max.get());
        Optional<Integer> min=transactions.stream().map(d->d.getValue()).reduce(Integer::min);
        System.out.println("8.找到交易额最小的交易："+min.get());
    }
}
