package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		/*
		 <<배열>>
		 -int[] number = new int[5]; //기본값으로 초기화된다.
		 -int[] number = new int[]{10, 20, 30, 40, 50};
		 -int[] number = {10, 20, 30, 40, 50};
		 
		*/
		//변수는 값을 하나만 저장할 수 있지만 배열은 값을 여러개 저장할 수 있다. 
		//똑같은 변수인데 값을 여러개 저장할 수 있음.
		//값을 효율적으로 다룰 수 있게 됩니다.
		//선언방법: 데이터타입 붙여주고 [] 타입 뒤, 변수이름 뒤에 붙여도 됨. 위치는 상관 없다. 보통은 타입 뒤에 붙임.
		
		//초기화 할 때 new 하고 타입 그대로 쓰고 대괄호 안에 숫자를 하나 넣는데, 
		//그 숫자는 배열의 크기를 지정하는 것이다. 숫자를 몇 개 저장할것인지. 갯수를 지정한것.
		//숫자 5를 적은건 총 5개의 숫자를 넣을 수 있다는 것이다.
		// -int[] number = new int[5];   --> 이렇게 할 결우 5개의 공간에 기본값인 0이 저장된 채로 생성된다.
		//-int[] number = new int[]{10, 20, 30, 40, 50};  --> 대괄호안에 숫자를 넣지 않고 값을 콤마로 구분지어 넣음.
		// 이 배열의 크기는 5가 됨. (5개 넣었으니까.)
		//int[] number = {10, 20, 30, 40, 50}; --> 뉴 인트 생략하고 바로 값을 넣는다.
		
		//배열은 참조형 타입입니다.
		//값이 저장되어있는 주소를 저장.
		int [] array; //배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; //배열이 생성되고 그 주소가 저장된다.
		//new : 새로운 저장공간 생성 및 주소 반환.
		//int[5] : int 를 저장할 수 있는 5개의 공간.
		//이 방식으로 배열 초기화시 기본값 = 0 이 저장된다.
		
		System.out.println(array); //실행결과 : 알수없는 값들이 나옴.
		//array 라는 변수(배열)에 저장된 주소가 출력된 것이다.
		System.out.println(array[4]); // 실제 저장된 값에 접근하기 위해서는 index를 지정해줘야 한다.
		//index : 몇번째 숫자냐? 배열에 저장되어있는 값들은 순서가 있다. 저장된 순서가 1,2,3,4,5 번.
		//이 순서는 0번부터 시작. 0~4 의 인덱스를 가짐 위의 배열은.
		//인덱스로 사용될 수 있는 것 : int 타입만 사용할 수 있다. (리터럴, 변수, 상수, 연산 등.)
		
		//모든 값을 출력하고싶을때는?
		Arrays.toString(array);
		//배열의 모든 인덱스에 모든 저장된 값을 콤마로 구분된 문자열로 반환한다.
		System.out.println(Arrays.toString(array));
		String arrayStr = Arrays.toString(array);
		//String 에 담을 수 있다.
		System.out.println(arrayStr);
		
		
		int[] iArray1 = new int[]{1,2,3};
		//배열 이름 : iArray1, 배열안에 1,2,3 을 담아서 크기 3.
		//값의 개수로 배열의 크기가 정해진다.
		//배열의 크기는 한 번 정해지면 변경할 수 없다. 왱 ㅜㅜ
		//배열의 크기는 고정되는 것. 수정시 더 저장하고싶으면 새로 더 큰 배열을 만들어야함.
		
		int[] iArray2 = {1,2,3};
		//이 방법은 선언과 초기화를 동시에 해야한다. 
		//변수들은 중괄호에 넣었넹.
		/*
		int[] iArray3;
		iArray3 = {1,2,3};
		--> 이렇게 따로하면 컴파일 에러 발생. 동시에 해야함.*/
		
		array[0] = 10;
		//배열에 값을 넣는 방법. 배열[인덱스값] = 값;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50; //마지막 인덱스는 "배열의 길이-1" 이다.
		//변수랑 사용하는거 똑같은데 인덱스번호만 지정해주면 돼. 대괄호랑!!!대애과알호
		
		//정수를 저장할 수 있는 길이가 10인 배열을 생성 및 초기화 해주세요.
		
		int[] iArr = new int[10];
		//위 배열의 모든 인덱스에 있는 값을 변경해주세요.
		iArr[0] = 100;
		iArr[1] = 11;
		iArr[2] = 22;
		iArr[3] = 33;
		iArr[4] = 44;
		iArr[5] = 55;
		iArr[6] = 66;
		iArr[7] = 77;
		iArr[8] = 88;
		iArr[9] = 99;
		
		//모든 인덱스에 있는 값의 합계를 출력해주세요.
		System.out.println(iArr[0] + iArr[1] + iArr[2] +iArr[3] + iArr[4] + iArr[5] + iArr[6] + iArr[7] + iArr[8] + iArr[9]);
		
		int sum =0;
		sum += iArr[0];
		sum += iArr[1];
		sum += iArr[2];
		sum += iArr[3];
		sum += iArr[4];
		sum += iArr[5];
		sum += iArr[6];
		sum += iArr[7];
		sum += iArr[8];
		sum += iArr[9];
		System.out.println(sum);
		
		
		//배열의 합계를 반복문으로 작성해보자.
		//index는 1씩 증가하는 규칙이 있어 for문과 함께사용하기 좋다.
		
		for(int i = 0; i < iArr.length; i++){
			System.out.println(iArr[i]);
		}
		//인데스는 0부터 시작하니 변수 i 는 0부터. 배열의 길이 : .length 보다 작을때까지 1씩 증가해가며 반복문 실행.
		//그 변수를 인덱스로 사용했으니 0~length-1 까지 돌아가며 값을 적을것임.
		
		//배열의 길이를 알고있다고 숫자를 사용하는 것을 하드코딩이라고 한다.
		//길이를 알더라도 .length 를 사용하는 것이 더 좋은 코드이다.
		//근데 어차피 배열 크기 변경 안된다고했으니까 상관없지 않을까
		//배열의 크기가 수정될 수도 있으니까!
		//한군데가 변경되면 다른데 또 변경해야하는게 불편.
		
		//배열에담긴 내용을 변경하기위해 포문을 사용해보자.
		for (int i = 0 ; i < iArr.length; i++){
			iArr[i] = i + 1;
		}
		System.out.println(Arrays.toString(iArr));
	//	수정해따
		
		
		//배열에 숫자를 담고 함계와 평균을 구해보자.
		int[] numbers = new int[10];
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = (int)(Math.random()*100) +1;
		}
		System.out.println(Arrays.toString(numbers));
		//랜덤한 변수를 가지는 배열 number 를 만들었다.
		
		
		sum = 0;
		double avg = 0;
		for (int i = 0; i < numbers.length; i ++){
			sum += numbers[i]; //sum = sum + numbers[i]
		}
		avg  = (double)sum / numbers.length;
		System.out.println("합계 :  " + sum + "  /   평균 :  " +  avg);
		
		//향상된 for 문
		for(int number : numbers){ //배열에 있는 값을 차례대로 변수에 넣는다.
			System.out.println(number);
		} ///for wich 문이라고도 부름.
		//number 는 이 포문안에서 사용할 변수임.
		//넘버스 배열의 0번 인덱스부터 차례대로 너버인덱스에 넣는데, 0번넣고 중괄호 실행, 1번넣고 중괄호실행, 2번넣고 중괄호실행 .....반복.
		//배열에있는 값을 차례대로 앞에있는 변수에 넣고 중과호 실행.
		//얘는 배열에 있는 내용을 읽을 수는 있지만, 배열에 저장을 하려면 배열의 인덱스에 접근해 저장을 해야해서 배열안 값저장은 못한다.
		//

		//인덱스번호를 꼭 지정하자! 배열사용시에는!!
		
		//numbers 배열에 저장된 숫자들 중 최소값과 최대값을 찾아주세요.
		//1. 변수 2개만들어. 최소값, 최대값 담을 용.
		//최소값에 일단 0번부터 저장. 그리고 그 값들을 비교한다.
		//큰수만나면 넘어가고 작은수만나면 저장한다. 
		//최댓값에는 반대로.
		
		/*		int[] numbers = new int[10];
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = (int)(Math.random()*100) +1;
		}*/
		
		
		
		int nmax = numbers[0];
		int nmin = numbers[0];
		
		for (int i = 0; i < numbers.length ; i++){
			if (nmin > numbers[i]) {
				nmin = numbers[i];
			}
		}
		
		for (int i = 0; i < numbers.length ; i++){
			if (nmax < numbers[i]){
				nmax = numbers[i];
			}
		}

		System.out.println("최소값 : " + nmin + "  /  최대값 : " + nmax);
		
		//------------------------------------------------------------
		
		System.out.println(Arrays.toString(numbers));
		//로또번호 자동인가
		
		
		
		//문제
		int[] shuffle = new int[30];
		for(int i = 0; i < shuffle.length; i++){
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle));
		//순서대로 있는 값들을 섞을것이다.
		//랜덤한 숫자 0~29까지 발생시킨다. 7이 나왔다고치면, 7번인덱스에 있는 값 과 0번인덱스의 값 자리를 바꾼다.
		//다시 랜덤 돌려서 13이 나왔다고 치면, 다시 0번인덱스 값 자리랑 바꾼다.
		//그렇게해서 배열의 값을 섞어주세요.
		
		
		//x=2 y=1  x=1 y=2 ,int tmp;
		//temp=x;
		//x=y;
		
		//y=tmp;
		
		int temp = 0;
		int i = 0;
		while (i < 1000){
			
			int r = (int)(Math.random()*30);			 
			temp = shuffle[0]; 
			shuffle[0] = shuffle[r]; 
			shuffle[r] = temp;
			i++;			
		
		}
		System.out.println(Arrays.toString(shuffle));
	//----------------------------------------------------------------------------
	//선생님 답안
		for(int i1 = 0; i1 < shuffle.length * 10; i1++){
			int random = (int)(Math.random()*shuffle.length);
			int temp1 = shuffle[0];
			shuffle[0] = shuffle[random];
			shuffle[random] = temp1;
		}
		System.out.println(Arrays.toString(shuffle));
		
		
		//복습하기!*
		
		//마지막문제 
		//1~10 사이의 난수를 500번 생성하고, 각 숫자가 생성된 획수를 출력해주세요.(1은 몇개, 2는 몇개, 3은 몇개 ...)
		
		int ra[] = new int[500]; 
		
		for(i = 0; i < 500; i++){
			 ra[i] = (int)(Math.random()*10 + 1);
		}
		System.out.println(Arrays.toString(ra));
		//--------------------------------------------------------------
		
		/*
		int ran[] = new int[10];
		
		for ( i = 0; i< ra.length; i++){
			if(ra[i] == 1){
				ran[1] ++;
			} else if(ra[i] == 2){
				ran[2] ++;
			} else if(ra[i] ==3){
				ran[3] ++;
			} else if(ra[i] == 4){
				ran[4] ++;
			} else if(ra[i] == 5){
				ran[5] ++;
			} else if(ra[i] == 6){
				ran[6] ++;
			} else if(ra[i] == 7){
				ran[7] ++;
			} else if(ra[i] == 8){
				ran[8] ++;
			} else if(ra[i] == 9){
				ran[9] ++;
			} else if(ra[i] == 10){
				ran[10] ++;
			} 
		}*/
		//----------------------------------------------------이걸 반복문으로 만들자.
		int ran[] = new int[10];
				
		for ( i = 0; i < ra.length; i++){
			
			for (int j = 1; j <= 10; j ++){
				if (ra[i] == j ){
					ran[j-1] ++;
				} 
			}
		}
						
		for (i = 0; i < ran.length; i ++){
			System.out.println(i+1 + "개수 : " + ran[i] );
		}
				
	//-----------------------------------------------------언니답안-------------	
	/*
		int[] random = new int[10];
		for(int i = 0; i <500; i++){
			int n = (int)(Math.random() * random.length) +1;
			
			random[n-1]++;
		} System.out.println(Arrays.toString(random));
		*/
		
		//자꾸자꾸 뭘 만들어봐야 익숙해진대!
		
	

		
	}

}
