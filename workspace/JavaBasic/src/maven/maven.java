package maven;

public class maven {
/*	Maven기반의 프로젝트
	Maven : 프로그램 ( 빌드 도구 )
	--> 1. 배포!(deploy)
	
	web / 안드로이드
	자바 : jvm이 있으면 소스코드 수정하지않아도 윈도우/리눅스 등등에서 모두 잘 돌아간다.
	원래는 가전기구를 제어하기위해 만들어졌지만 요즘은 웹을 다루는데 사용한다.
	자바 = 웹 (안드로이드) 라고 해도됨. 
	웹 : 쓰레드사용빈도가 낮다.
	안드로이드 : 쓰레드 사용 빈도 높다. (쓰레드파트를 잘 읽어봅시다.)
	
	war 확장자로 생성. 후 서버에 올려놓으면 알아서 서버에 배포를 해준다.
	(와르)
	그래서 와르파일을 만들어주면되는데 어렵지 않다. 
	
	익스큐터블 자르파일?
	
	--> 1. 프로젝트
	- 프로젝트에서 사용되는 라이브러리 관리(jar) / 라이브러리(자르. 아카이브? 로 배포가된다.) -> 2000년대 초반에는 라이브러리관리자가 지정되어있었다.(PL)
		. 웹에디터(만들기어려움) 가져다써라. 프레임워크만들기?
		. 버전관리가 어렵다. (ibatis 2.x -> mybatis 3.x)
		. 하나의 라이브러리가 다른 라이브러리에 의존하고 있는 경우
		. 라이브러리 관리해주는 프로그램 : Maven
	- 프로젝트의 진행단계 비슷.
		. java 컴파일 단계. (실제 운영될 파일)
		. 리소스(설정파일을 담은 properties, xml) 복사 단계.
		. 이제 프로퍼티만 수정하면된다?
		. 운영될 파일이 정상적인지 테스트할 수 있는 java code 컴파일(개발단계에서 사용할 파일들)
		. 배포파일 ( 자르(자바아카이브), 와르(웹아카이브) aar (안드로이드아카이브) 로 만든다.) 아카이브 : 보관 이라는 뜻.
	- 이 과정들을 Maven 이 해준ㄴ다. (아파치 메이븐)
	
	
	
	
	
	
	
	
	
	
*/	
}