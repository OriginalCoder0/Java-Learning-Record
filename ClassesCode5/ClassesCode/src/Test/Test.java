package Test;

/**
 * @program: ClassesCode
 * @description:
 * @author: OriginalCoder
 * @create: 2020-10-13 21:39
 **/
public class Test {
    public static void main(String[] args) {
        Dog dog  = new Dog();
        dog.setKind("�л���԰Ȯ");
        dog.setWeight(8);

        Dog dog2 = dog;
        dog2.setKind("��ëȮ");
        System.out.println("dog�������õĶ���Ʒ�֣�" + dog.getKind());
        dog.setKind("�л���԰Ȯ");
        System.out.println("dog2�������õĶ���Ʒ�֣�" + dog2.getKind());

        System.out.println("����" + dog2.getKind() + ";����ÿСʱ" + dog2.move() + "������ٶ��˶�");

        Fish f1 = new Fish();
        f1.setKind("����");
        f1.setWeight(3000);
        System.out.println("����" + f1.getKind() + ";����ÿСʱ" + f1.move() + "�����ٶ��˶���");
    }
}
