package itwcn.edu.com.demo02;

/**
 * @program: Demo06Practice
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/18 12:12
 **/

/**
 * ��Ŀ��
 * ����һ��������������{1,2,3}����ָ����ʽƴ�ӳ�һ���ַ�������ʽ���£�[word1#word2#word3]
 * ������
 * 1.����׼��int[] ���� ��������1,2,3
 * 2.����һ���������������������ַ���
 * ��Ҫ�أ�
 * ����ֵ���ͣ�String
 * ��������:fromArrayToString
 * �����б�int[]
 * 3.��ʽ��[word1#word2#word3]
 * �õ���forѭ�����ַ���ƴ�ӣ�ÿ������Ԫ��֮ǰ����һ��word�������ָ�ʹ�õ���#������һ���ǲ������һ��
 * 4.���÷������õ�����ֵ������ӡ����ַ���
 *
 *
 * @author ���Ѻ�
 */
public class Demo06Practice {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        String result = fromArrayToString(array);
        System.out.println(result);
    }

    public static String fromArrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str += "word" + array[i] + "]";
            } else {
                str += "word" + array[i] + "#";
            }
        }
        return str;
    }

}
