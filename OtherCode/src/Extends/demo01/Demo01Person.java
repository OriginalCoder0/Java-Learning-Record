package Extends.demo01;



/**
 * @program: demo
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/27 19:33
 **/

/**
 * ��������������������װ���̳С���̬
 * ��װ����Java�е����֣�
 * 1.��������һ�ַ�װ
 * 2.�ؼ���privateҲ��һ�ַ�װ
 * ��װ�����ǽ�һЩϸ����Ϣ��������������粻�ɼ�
 */
public class Demo01Person {
    public static void main(String[] args) {
        int[] array = {5,15,20,25,30};
        int max = getMax(array);
        System.out.println(max);
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}