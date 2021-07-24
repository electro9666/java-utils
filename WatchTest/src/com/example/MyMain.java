package com.example;

import java.io.IOException;

public class MyMain {
	public static void main(String[] args) {
		// 하위 디렉토리의 파일 내용 변경은 감지 못한다.
		String projPath = "F:\\workspace2020\\java-utils\\WatchTest\\sample";
		try {
			new MyWatch(projPath).start(a -> {
				System.out.println("!!" + a);
			});
		} catch (IOException e) {
			e.printStackTrace();
		};
	}
}
