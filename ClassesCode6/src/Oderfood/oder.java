package Test;

/**
 * @program: ClassCode
 * @description:
 * @author: OriginalCoder
 * @create: 2020-10-23 22:39
 **/
import java.util.Scanner;

public class oder {

    Scanner input = new Scanner(System.in);

    String[] names = new String[5];// 保存订餐人姓名
    String[] dishMegs = new String[5];// 保存所选菜品名
    int[] dishNums = new int[5];// 保存所选菜品份数
    int[] times = new int[5];// 保存送餐时间
    String[] addresses = new String[5];// 保存送餐地址
    int[] states = new int[5];// 保存订单状态：0表示已预订，1表示已完成
    double[] sumPrices = new double[5];// 保存订单的总金额

    int[] praiseNums = new int[5];

    String[] dishNames = { "大盘鸡", "干锅鸭", "水煮鱼", "麻婆豆腐", "油焖大虾" };
    double[] prices = { 20.0, 25.0, 10.0, 30.0, 20.0 };

    public void init() {
// 初始化3条订单信息
// 第1条
        names[0] = "张三";
        dishMegs[0] = "大盘鸡";
        dishNums[0] = 3;
        times[0] = 12;
        addresses[0] = "北京路";
        states[0] = 0;
        sumPrices[0] = 60.0;
// 第2条
        names[1] = "李四";
        dishMegs[1] = "麻婆豆腐";
        dishNums[1] = 2;
        times[1] = 19;
        addresses[1] = "南京路";
        states[1] = 1;
        sumPrices[1] = 60.0;
// 第3条
        names[2] = "王五";
        dishMegs[2] = "水煮鱼";
        dishNums[2] = 1;
        times[2] = 19;
        addresses[2] = "天津路";
        states[2] = 1;
        sumPrices[2] = 15.0;
    }

    public void display() {
        System.out.println("***查看餐袋***");
        System.out
                .println("序号\t\t订餐人\t\t餐品名称\t\t餐品数量\t\t送餐时间\t\t送餐地址\t\t总金额\t\t订单状态");
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                String state = (states[i] == 0) ? "已预订" : "已完成";
                System.out.println((i + 1) + "\t\t" + names[i] + "\t\t"
                        + dishMegs[i] + "\t\t" + dishNums[i] + "份" + "\t\t"
                        + times[i] + "\t\t" + addresses[i] + "\t\t"
                        + sumPrices[i] + "元" + "\t\t" + state);
            }
        }
    }

    public void add() {
        System.out.println("***我要订餐***");
        boolean isAdd = false;// 记录是否可以点餐
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                isAdd = false;
                System.out.print("请输入订餐人姓名：");
                String name = input.next();
                System.out.println("序号" + "\t\t" + "菜名" + "\t\t" + "单价"
                        + "\t\t" + "点赞数");
                for (int j = 0; j < dishNames.length; j++) {
                    System.out.println((j + 1) + "\t\t" + dishNames[j] + "\t\t"
                            + prices[j] + "元" + "\t\t" + praiseNums[j]);
                }
                System.out.print("请选择您要点的菜品编号：");
                int chooseDish = input.nextInt();
                String dishMeg = dishNames[chooseDish - 1];
                System.out.print("请选择您需要的份数：");
                int number = input.nextInt();
                System.out.print("请输入送餐时间（送餐时间是10点至20点间整点送餐）：");
                int time = input.nextInt();
                while (time < 10 || time > 20) {
                    System.out.print("您的输入有误，请输入10-20间的整数");
                    time = input.nextInt();
                }
                System.out.print("请输入送餐地址：");
                String address = input.next();
// 默认可以预定，不用写订单状态
                System.out.println("订餐成功！");
                System.out.println("您定的是：" + dishNames[chooseDish - 1] + number
                        + "份");
                System.out.println("送餐时间：" + time + "点");
                double sumPrice = prices[chooseDish - 1] * number;// 计算餐费
                double sendMoney = (sumPrice >= 50) ? 0 : 5;// 计算送餐费
                System.out.println("餐费：" + sumPrice + "元，" + "送餐费" + sendMoney
                        + "元，" + "总计：" + (sumPrice + sendMoney) + "元。");
// 添加数据
                names[i] = name;
                dishMegs[i] = dishMeg;
                times[i] = time;
                dishNums[i] = number;
                addresses[i] = address;
                sumPrices[i] = sumPrice + sendMoney;
                break;
            }
            if (isAdd) {
                System.out.println("对不起，您的餐袋已满！");
            }
        }
    }

    public void delete() {
        System.out.println("***删除订单***");
        boolean isDelFind = false;
        System.out.print("请输入要删除的订单序号：");
        int delID = input.nextInt();
        for (int i = 0; i < names.length; i++) {
// 根据状态值判断能不能删除，只有已完成的才能删除
            if (names[i] != null && states[i] == 1 && delID == i + 1) {
                isDelFind = true;
                for (int j = delID - 1; j < names.length - 1; j++) {
                    names[j] = names[j + 1];
                    dishMegs[j] = dishMegs[j + 1];
                    dishNums[j] = dishNums[j + 1];
                    times[j] = times[j + 1];
                    addresses[j] = addresses[j + 1];
                    states[j] = states[j + 1];
                    sumPrices[j] = sumPrices[j + 1];
                }
// 将最后一位清空
                names[names.length - 1] = null;
                dishMegs[names.length - 1] = null;
                dishNums[names.length - 1] = 0;
                times[names.length - 1] = 0;
                addresses[names.length - 1] = null;
                states[names.length - 1] = 0;
                sumPrices[names.length - 1] = 0;
                System.out.println("删除订单成功！");
                break;
            } else if (names[i] != null && states[i] == 0 && delID == i + 1) {
                isDelFind = true;
                System.out.println("您选择的订单未签收，不能删除！");
                break;
            }
        } // 未找到的订单不能删除
        if (!isDelFind) {
            System.out.println("您要删除的订单不存在！");
        }
    }
}