package checkEmailType;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class EmailCheck {
    /* Định dạng email theo tiêu chuẩn sau :
     * Bắt đầu bằng 1 ký tự từ a tới z và chữ cái phải viết hoa
     * Không chứa các ký tự đặc biệt 
     * Có một ký tự @ ngăn cách tên email và domain
     * Domain phải hợp lê
     */
	public static void main(String[] args) {
		
		final String EMAIL_REGEX =   "^[A-Z]+[A-Za-z0-9]*@[a-z]+(\\.[a-z]+)$";
		
        /* ^ : Bắt đầu chuối String hoặc 1 dòng 
         * [A-Z]+ : Email phải bắt đầu chữ hoa từ A tới Z và có ít nhất 1 ký tự
         * [A-Za-z0-9]*@ Sau chữ cái đầu tiên thì email bằng chữ hoặc số nằm từ A đến Z hoặc 0 đến 9
         * không kể chữ hoa hoăc chữ thường.
         * [a-z]+ : Sau @ ký thự phải là chữ thường nằm trong khoảng a đến z.
         * (\\.[a-z]+) : Sau domain là phần mở rộng của domain sau dấu chấm
         * $ Kết thúc chuỗi hoăc kết thúc dòng
         */
		
		String[] arr = {"9caibanh@gmail.com","Dixemay@gmail.com","DiOto@com.vn","Dimaybay@Gmail.com"};
		List<String> list = Arrays.asList(arr);
		for(String element : list) {
			if(Pattern.matches(EMAIL_REGEX, element)) {
				System.out.println(element + " là đúng định dạng");
			}else {
				System.out.println(element + " là không đúng định dạng");
			}
		}
		
		
	}

}
