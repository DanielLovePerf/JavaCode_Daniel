package code.daniel;
import java.util.Scanner;
/*
 * ���ܣ�Ϊָ���ɼ��ӷ֣�ֱ��60Ϊֹ
 * ʹ��scanner������ʵ���û�����ĳɼ���Ϣ
 * Scanner��λ��Java.util���У���Ҫ����
 * 
 */
public class AddScores {

	public static void main(String[] args) {
		Scanner inputs=new Scanner(System.in);//����Scanner����
		//System.out.println("�����뿼�Գɼ���Ϣ:");
		System.out.print("�����뿼�Գɼ���Ϣ:"); //��println��ȣ�print������
		//��������ɼ�
		int score=inputs.nextInt();//��ȡ�û�����ĳɼ��������ڱ�����
		
		//��������ӷִ���
		int count=0;
		
		//��ӡ����ӷ�ǰ�ɼ�
		System.out.println("�ӷ�Ǯ�ĳɼ�Ϊ��"+ score);
		// ֻҪ�ɼ�С��60����ѭ��ִ�мӷֲ�������ͳ�Ƽӷִ���
		while(score<60){
			score++;
			count++;
		}
		
		//��ӡ����ӷֺ�ɼ����Լ��ӷִ���
		System.out.println("�ӷֺ�ĳɼ���:"+score+"�ӷִ���Ϊ:"+count);
		

	}


}
