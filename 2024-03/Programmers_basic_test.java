

public class Programmers_basic_test {

	//알파벳으로 이루어진 문자열 myString이 주어집니다. 모든 알파벳을 소문자로 변환하여 return 하는 solution 함수를 완성해 주세요.
	public String solution1(String myString) {
		String answer = "";
		char c;
		for(int i = 0 ; i < myString.length();i++) {
			c = myString.charAt(i);
			if(Character.isUpperCase(c)) {
				answer += Character.toLowerCase(c);
			} else {
				answer += Character.toLowerCase(c);
			}
		}
		return answer;
	}

	//정수 n이 주어질 때, n을 문자열로 변환하여 return하도록 solution 함수를 완성해주세요.
    public String solution2(int n) {
        String answer = "";
        answer = n + "";
        return answer;
    }

	//문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 앞의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
    public String solution3(String my_string, int n) {
        String answer = "";
		char[] my_stringC = my_string.toCharArray();

        for(int i=0; i<n; i++){
            answer += my_stringC[my_stringC.length-n+i];
        }
        return answer;
    }

	//문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 앞의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
   public String solution4(String my_string, int n) {
        String answer = "";
	     answer = my_string.substring(0, n);
        return answer;
    }

	//숫자로만 이루어진 문자열 n_str이 주어질 때, n_str을 정수로 변환하여 return하도록 solution 함수를 완성해주세요.
	public int solution5(String n_str) {
        int answer = 0;
		answer = Integer.parseInt(n_str);
        return answer;
    }

}



}
