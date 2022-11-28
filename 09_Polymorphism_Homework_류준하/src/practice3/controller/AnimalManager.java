package practice3.controller;

import practice3.model.vo.*;

public class AnimalManager {

	public static void main(String[] args) {

		Animal[] ani = new Animal[5];
		ani[0] = new Cat("솜솜코", "벵갈", "스트릿", "하양");
		ani[1] = new Dog("흰둥이", "포메라니안", 5);
		ani[2] = new Dog("뽀삐", "푸들", 10);
		ani[3] = new Cat("나옹", "아메리칸 밥테일", "친구집", "치즈");
		ani[4] = new Dog("나르", "시츄", 2);

		for (Animal a : ani) {
			a.speak();
		}
	}
}
