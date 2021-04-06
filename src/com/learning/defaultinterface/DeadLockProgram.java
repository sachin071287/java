package com.learning.defaultinterface;

public class DeadLockProgram {
	static Object obj1 = new Object();
	static Object obj2 = new Object();

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();

	}

	private static class Thread1 extends Thread {
		@Override
		public void run() {
			synchronized (obj1) {
				System.out.println("In run of Thread1 run()::: have Obj1 lock");
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					System.out.println("In catch of Thread 1");
				}
			//}
			System.out.println("In Thread1 and waiting for obj2 lock");
			synchronized (obj2) {
				System.out.println("In run of Thread1 run():::: haveObj2 lock");
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					System.out.println("In catch of Thread 1");
				}
			}
			}
		}
	}

	private static class Thread2 extends Thread {
		@Override
		public void run() {
			synchronized (obj2) {
				System.out.println("In run of Thread 2 :::  have obj2 lock");
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					System.out.println("In catch of Thread 2");
				}
			//}
			
			System.out.println("In run of Thread 2 :::waiting for obj1 lock");
			
			synchronized (obj1) {
				System.out.println("In run of Thread 2 ::: have obj1 lock");
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					System.out.println("In catch of Thread 2");
				}
			}
			}

		}
	}

}
