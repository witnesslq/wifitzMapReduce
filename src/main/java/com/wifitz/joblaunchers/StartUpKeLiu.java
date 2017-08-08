package com.wifitz.joblaunchers;

public class StartUpKeLiu {
	// 输入的参数应该是 第一个用户的名字 第二个时间 第三个为时间阈（年月日时）（2017 2017_5 2017_5_21 2017_5_21.11）
	// 第四个参数为设备的id
	public static void main(String[] args) {


		KeLiuLiangJobLauncher keliulianglauncher= new KeLiuLiangJobLauncher();
		
//		
//		String username = "chen";
//		String time = "2017_5_2.";
//		String type = "hour";
//		String id = "chen";
		Long starttimer  = System.currentTimeMillis();
		try {
			System.out.println("start keliuliang");
			keliulianglauncher.start(args);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		Long endtime = System.currentTimeMillis();
		System.out.println("start-"+starttimer);
		System.out.println("end-"+endtime);
	}
}
