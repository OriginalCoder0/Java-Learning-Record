/**
 *
 */
package cn;

/**
 * @author Administrator
 *
 */
public class Dog extends Animal {

    /**�޲����Ĺ��췽��*/
    public Dog() {
        super();  // ִ�и���Ĺ��캯��
    }

    /**
     * ���صĴ������Ĺ��캯��
     *
     * @param k ��������Ʒ��
     * */
    public Dog(String k) {
        super();
        this.kind = k;  // �ڴ�������ʱȷ������Ʒ��
    }

    /**
     * ���صĴ������Ĺ��캯��
     *
     * @param k ��������Ʒ��
     * */
    public Dog(float w) {
        super();
        this.setWeight(w);
    }

    /**
     * ���صĴ������Ĺ��캯��
     *
     * @param k ��������Ʒ��
     * @param w ������������
     * */
    public Dog(String k, float w) {
        super();
        this.kind = k;  // �ڴ�������ʱȷ������Ʒ��
        this.setWeight(w);  // ���÷��������¶��������
    }

    /**
     * �������Ļ�����������װ���̳С���̬
     * ��װ�������Ա���˽�л������ܱ�������ֱ�ӷ��ʣ�ͬʱ����¶��д����ֵ�÷�����
     *      ���������Է�����������Բ����ĺϷ�����֤������Ƿ����ݵĴ��롣
     * */


    /**�����ǳ�*/
    private String name;

    /**��������*/
    private String ear;
    /**����*/
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEar() {
        return ear;
    }
    public void setEar(String ear) {
        this.ear = ear;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age<=0) {
            System.out.println("���䲻��С�ڵ��� 0 ��");
            return;
        }
        this.age = age;
    }
    /**�����������ܵ���Ϊ*/
    public void move(double s) {
        System.out.println("������ÿСʱ"+ s +"������ٶȱ��ܣ�");
    }

    /**���������е���Ϊ*/
    public void woof() {
        System.out.println("�ҷ����˿��ɵ��ˣ�������ע���ˣ�");
    }

    @Override
    public String move() {
        return "�ҵ�Ʒ�֣�" + kind + "�����أ�" + weight;
    }

    /**���ط����������������ܵ���Ϊ*/
    public String move(String method, double s) {
        return "������ÿСʱ"+ s +"������ٶȱ��ܣ�";
    }

}
