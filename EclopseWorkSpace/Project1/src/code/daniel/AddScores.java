package code.daniel;
import java.util.Scanner;
/*
 * 功能：为指定成绩加分，直到60为止
 * 使用scanner工具类实现用户输入的成绩信息
 * Scanner类位于Java.util包中，需要导入
 * 
 */
public class AddScores {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);//创建Scanner对象
		//System.out.println("请输入考试成绩信息:");
		System.out.print("请输入考试成绩信息:"); //和println相比，print不换行
		//变量保存成绩
		int score=input.nextInt();//获取用户输入的成绩并保存在变量中
		
		//变量保存加分次数
		int count=0;
		
		//打印输出加分前成绩
		System.out.println("加分钱的成绩为："+ score);
		// 只要成绩小于60，就循环执行加分操作，并统计加分次数
		while(score<60){
			score++;
			count++;
		}
		
		//打印输出加分后成绩，以及加分次数
		System.out.println("加分后的成绩是:"+score+"加分次数为:"+count);
		

	}


}
