package Extends.demo01;
/**
 * @program: Demo02Person
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/27 20:17
 **/

public class Demo02Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "����";
//        person.age = -20;       //ֱ�ӷ���private���ݣ��Ǵ���д��
        person.setAge(-20);
        //��ӷ���private��setAge��Ա����
        person.show();  //������ʾ-20�����ݲ��Ϸ�
    }
}
