package Animal;

/**
 * @program: demoTest01
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/10 18:42
 **/

//����Animal��
class Animal {
    //����Animal�޲εĹ��췽��
    public Animal() {
        System.out.println("����һֻ�ɲ��ߵ�СС��");
    }
    //����Animal�вεĹ��췽��
    public Animal(String name) {
        System.out.println("����һֻ" + name);
    }
}
//����Bird��̳�Animal��
class Bird extends Animal {
    //�����޲εĹ��췽��
    public Bird() {
    }
}

//���������
public class Demo01 {
    public static void main(String[] args) {
        Bird bird = new Bird();     //����һ��Bird���ʵ������
    }
}

