package Extends.demo02;

/**
 * @program: Person
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/27 20:54
 **/

/**
 * �������ľֲ���������ĳ�Ա����������ʱ�򣬸��ݾͽ�ԭ������ʹ�þֲ�����
 * �����Ҫ���ʱ��൱�еĳ�Ա��������Ҫʹ�ø�ʽ��
 * this.��Ա������
 */

/**
 * ͨ��˭���õķ�����˭����this
 */
public class Person {
    String name;    //����
    //����who�ǶԷ�������
    //��Ա����name�Լ�������
    public void sayHello(String name) {
        System.out.println(name + ",��ã����ǣ�" + this.name);
        System.out.println(this);
    }
    //�ڳ�Ա�����е�person������sayHello(),ͨ��person���÷�������ôperson����this,
    //this.name��ʵ�͵ȼ���person.name

}
