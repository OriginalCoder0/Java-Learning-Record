package edu;

/**
 * @program: ClassesCode
 * @description:
 * @author: OriginalCoder
 * @create: 2020-10-13 20:22
 **/
/**
 * ʵ����
* */
public class Dog extends Animal{
    public Dog() {
        super();
    }
    public Dog(String k) {
        super(k);       //���ø���Ĵ������Ĺ��췽��
    }

    private int size = 0;   //�ߴ�

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if(size<=0) {
            System.out.println("�Ƿ��ߴ�");
            return;
        }
        this.size = size;
    }

    @Override   //ע�⣺��ʾ��д�����ͬ������
    public double move(){
        return 60;
    }

}
