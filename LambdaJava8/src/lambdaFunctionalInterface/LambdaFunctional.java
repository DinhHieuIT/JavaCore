package lambdaFunctionalInterface;

@FunctionalInterface
interface IntroduceYourseft {
	public String say();
}

interface ChooseSong {
	public void tell();
}

@FunctionalInterface
interface yourName{
	public String say(String yourname);
}

public class LambdaFunctional {
	public static void main(String[] args) {
		/*
		 * Để sử dụng biểu thức lambda chúng ta cần tạo Functional Interface hoặc sử
		 * dụng Functional do Java cung cấp .Functional Interface là một interface chỉ
		 * có 1 phương thức trừu tượng duy nhất.
		 * Biểu thức lambda không có tên phương thức và không có kiểu trả về tường minh
		 */
		IntroduceYourseft s = () -> {
			return "Tôi là Đinh Văn Hiệu";
		};
		System.out.println(s.say());

    //Sử dụng anonymous mà không sử dụng lambda có tên phương thức là tell và kiểu trả về void
	ChooseSong choose = new ChooseSong() {
		public void tell() {
			System.out.println("Bài hát con đường tình yêu");
		}
	};
	 choose.tell();
	 //Biểu thức lambda một tham số
	 
	 
	 
	}
}