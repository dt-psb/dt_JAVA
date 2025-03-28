
public class p129_ex {
	public static void main (String[] args) {
		int a=3, b=4, c=5;
		boolean result;
		
		result = a++ * 2> --b  || c++ ==5;
		System.out.println("result = " + result);
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		/*
		 1. a++ -> a=3 대입 이후 4
		 2. a++ *2-> 3 * 2 = 6
		 3. --b -> b=3
		 4. 6>3 = true
		 5. true || true(false)=> or 연산할 때  앞이 true이면 뒤쪽 확인안하고 바로 true 판정
		 =>즉  a++ * 2> --b 가 true이므로 c++은 계산하지 않으므로 c=5 
		 */ 
		int x = 2;
		int y=3 + x++ *2 - --x/2;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		boolean check = !(a>b && c<a || b==c);
		System.out.println("check = " + check);
		
		System.out.println(c);
		
		/*
		 1. x++ -> x=3
		 2. x++*2 -> 2*2 = 4
		 3. 이때 x는 3 => --x => x=2
		 4. --x/2 -> 2/2 =1
		 5. 3 + 4 - 1 = 6
		 5번까지 진행했을때 x=2, y=6
		 
		 check
		 a>b => a=4, b=3 이므로 true
		 c<a -> c=5, a=4 이므로 false
		 true&&false 이므로 false
		 
		 b==c => b=3, c=5 이므로 false
		 false || false 이므로 false
		 !(false)는 true이므로 최종적으로 check에는 true가 들어감
		 
		 */
	}
}
