package string;
/**
 * char charAt(int index)
 * 返回当前字符串中指定位置处对应的字符
 * @author adminitartor
 *
 */
public class CharAtDemo {
	public static void main(String[] args) {
		//            0123456789012345
		String str = "thinking in java"; 
		
		char c = str.charAt(9);
		System.out.println(c);
		
		
		/*
		 * 检测回文
		 * 上海自来水来自海上
		 * 
		 * 规则：正数位置上的字符与倒数位置上的字符都
		 * 一样的则是回文
		 */
		String line = "上海自来水来海自上";
		for(int i=0;i<line.length()/2;i++){
			char c1 = line.charAt(i);
			char c2 = line.charAt(line.length()-1-i);
			if(c1!=c2){
				System.out.print("不");
				break;
			}
		}
		System.out.println("是回文!");
		
	}
}










