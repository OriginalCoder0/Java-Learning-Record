/**
 *
 */
package cn;

/**
 * @author Administrator
 *
 */
public class TestExample {

    private String strB = null;



    /**自定义方法：进行冒泡排序*/
    private static void SortBob() {
        int N = 0;
        int i = 0;
        int[] iA = new int[] {8,3,1,5,2};
        int n = iA.length;   // 数组对象的长度属性值记录了元素的个数
        for(N=0;N<n-1;N++) { // 控制比较的轮次
            for(i=0;i<n-1-N;i++) { // 相邻数据的两两比较的次数
                if(iA[i]>iA[i+1]) {
                    // 置换相邻两个数据的位置：
                    int t = iA[i];
                    iA[i] = iA[i+1];
                    iA[i+1] = t;
                }
            }
        }
        for(i=0;i<n;i++) {
            System.out.print(iA[i] + "  ");
        }
        System.out.println();
    }

    /**自定义静态方法*/
    private static void ArrayExam() {
        // 存储100名员工的工资：
        float[] fPay = new float[100]; // 创建新对象，100是元素的个数
        for (int i = 0; i < 100; i++) {
            if (i < 10) {
                fPay[i] = 5800;
            } else {
                fPay[i] = 3800;
            }
        }
        float fMax = 0.0f; // 保存最大值
        double dSum = 0.00; // 保存累加值
        // 计算平均工资，并找出最大值：
        for (int i = 0; i < 100; i++) {
            dSum = dSum + fPay[i];
            if (fPay[i] > fMax) {
                fMax = fPay[i]; // 暂时作为最大值
            }
        }
        double dAve = dSum / 100; // 计算平均值
        System.out.println("最高工资 = " + fMax + ";平均工资 = " + dAve);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        Bird b = new Bird();  // 创建鸟对象
        b.setKind("喜鹊");
        b.setColor("黄色");
        System.out.println(b.say());
        System.out.println("我是一只" + b.getKind() + ",花色是：" + b.getColor());

        //---
        b = new Bird();  // 创建鸟对象
        b.setKind("乌鸦");
        b.setColor("黑色");
        System.out.println("我是一只" + b.getKind() + ",花色是：" + b.getColor());

        //SortBob();    // 执行排序

		/*
		//使用自定义类创建对象：
		Dog dog = new Dog();  // 创建Dog对象，并赋值给 dog 变量

		dog.setKind("泰迪");
		dog.setColor("棕色");
		dog.setSex("母");
		//dog.weight = -2.5f;  // 直接设置属性变量的值！
		dog.setWeight(-5);

		dog.move(50);
		String strA = dog.toString();
		System.out.println(strA);

		dog = new Dog();  // 创建Dog对象，并赋值给 dog 变量
		dog.setKind("中华田园犬");
		dog.setColor("白色");
		dog.setSex("公");
		dog.setWeight(15);

		dog.move(60);
		strA = dog.toString();
		System.out.println(strA);

		dog = null;  // 变量不再以引用任何对象。
		             // java垃圾回收机会自动删除内存中的对象属性变量的值

		//ArrayExam();  // 执行自定义方法
		*/
    }

}
