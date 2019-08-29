package 正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {

	public static void main(String[] args) {
		String[] regEx = {
						   "^^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$",//邮箱
				           "\\d{11}",//手机号码
				           "\\d{3}-\\d{8}|\\d{4}-\\d{7}",//国内座机号码 
				           "^(\\d{6})(\\d{4})(\\d{2})(\\d{2})(\\d{3})([0-9]|X)$",//身份证包括X
				           "((\\d{11})|^((\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1})|(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1}))$)",//电话号码(包括手机座机)
				           "^[a-zA-Z0-9_-]{4,16}$",//帐号是否合法(允许4-16字节，允许字母数字下划线减号)
				           "^[a-zA-Z0-9]{5,16}$",//密码(长度在6~16之间，只能包含字母、数字)
				           "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,10}$",//强密码(必须包含大小写字母和数字的组合，可以使用特殊字符，长度在8-10之间)
				           "^\\d{4}-\\d{1,2}-\\d{1,2}",//日期格式
				           "[1-9][0-9]{4,}",//qq号码
				           "[1-9]\\d{5}(?!\\d)",//邮编
				           "^(?:(?:1[0-9][0-9]\\.)|(?:2[0-4][0-9]\\.)|(?:25[0-5]\\.)|(?:[1-9][0-9]\\.)|(?:[0-9]\\.)){3}(?:(?:1[0-9][0-9])|(?:2[0-4][0-9])|(?:25[0-5])|(?:[1-9][0-9])|(?:[0-9]))$",//IP地址
				           "^[京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领A-Z]{1}[A-Z]{1}[A-Z0-9]{4}[A-Z0-9挂学警港澳]{1}$",//车牌号正则
				           "([0-1][0-9]\\:|2[0-3]\\:)([0-5][0-9]\\:)[0-5][0-9]",//匹配时间
				           "[^\\x00-\\xff]{0,}\\:",//中文
				           "[0-9]{0,}",//匹配數字
				           "",
		};
//		macherString(regEx[0],"tony@erene.com.com");
//		macherString(regEx[1], "17610071266");
//		macherString(regEx[2], "028-25253565");
//		macherString(regEx[3], "51052119900210071X");
//		macherString(regEx[4], "0282-2525256");
//		macherString(regEx[5], "1aA_-@2");
//		macherString(regEx[6], "666_666");
//		macherString(regEx[7], "aA822568");
//		macherString(regEx[8], "2019-02-19");
//		macherString(regEx[9], "383209920");
//		macherString(regEx[10], "626100");
//		macherString(regEx[11], "192.168.1.10");
		macherString(regEx[12], "川A12345");
//		macherString(regEx[13], "18:06:00");
//		macherString(regEx[14], "拉了:");
//		macherString(regEx[15], "1212135");
	}

	private static void macherString(String regEx, String matherString) {
		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher = pattern.matcher(matherString);
		System.out.println(matherString +" 匹配："+matcher.matches());
	}

}
