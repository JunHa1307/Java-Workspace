package com.kh.chap03_sync.run;

import com.kh.chap03_sync.sync.Buffer;
import com.kh.chap03_sync.sync.Consumer;
import com.kh.chap03_sync.sync.Producer;

public class Run {

	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		Thread producer = new Producer(buffer);

		Thread consumer = new Thread(new Consumer(buffer));

		producer.start();
		consumer.start();
	}

}
