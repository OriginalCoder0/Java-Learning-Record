/**
 * 
 */
package cn.edu;

/**
 * ������߶���ĳ����Ļ������ܵ����룬�Դ���ķ�ʽȷ��������
 * ͨ��Լ��ʵ����ı��룬���淶������ƣ�
 * ���൱��ʹ�� implements �ؼ�����Լ���ࣺ����ʵ��û��Ĭ��ʵ�ֵķ�����
 * ������д��Ĭ��ʵ�ֵķ�����
 */
public interface ICircle {
	
	public abstract double getCircleArea();  // ������һ���������ɰ汾�Ľӿڣ�
	
	public default double getCircleLength() {  // 1.8 �汾�Ժ���ӿڵķ�ʽ
		return 0.00;
	} 
	
}
