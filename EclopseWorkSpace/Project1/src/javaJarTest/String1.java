package javaJarTest;

public class String1 {

	//usage of charAt
	public void strOccur(){
			// 定义一个字符串
			String s = "aljlkdsflkjsadjfklhasdkjlflkajdflwoiudsafhaasdasd";
	        
	        // 出现次数
			int num = 0;
//	        byte[] a=s.getBytes();
	         // 循环遍历每个字符，判断是否是字符 a ，如果是，累加次数
			for (int i=0;i<s.length();i++)
			{
	            // 获取每个字符，判断是否是字符a
				if (s.charAt(i)=='a') {
	                // 累加统计次数
					num++; 
				}
			}
			System.out.println("字符a出现的次数：" + num);
		}
	//useage of StringBuilder
	public void strbuilder(){
		// 创建一个空的StringBuilder对象
		StringBuilder str=new StringBuilder();
        
		// 追加字符串
		str.append("jaewkjldfxmopzdm");
		
        // 从后往前每隔三位插入逗号
		int len=str.length();
		for(int i=(len-3);i>0;i=i-3){
			str.insert(i, ",");
		}     
		
        // 将StringBuilder对象转换为String对象并输出
		System.out.print(str.toString());
	}
	//装箱，拆箱
	public void caseConvert(){
		 // 定义double类型变量
		double a = 91.5;
        
         // 手动装箱
		Double b = new Double(a);       
        
        // 自动装箱
		Double c = a;      

        System.out.println("装箱后的结果为：" + b + "和" + c);
        
        // 定义一个Double包装类对象，值为8
		Double d = new Double(87.0);
        
        // 手动拆箱
		double e = d.doubleValue();
        // 自动拆箱
		double f = d ;
        
         System.out.println("拆箱后的结果为：" + e + "和" + f);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String1 str=new String1();
//		str.strOccur();
//		str.strbuilder();
		str.caseConvert();

	}

}
