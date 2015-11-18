package com.spring9.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *@author: baijiangtao
 *@createtime: 2015年11月18日下午4:35:56
 *@version: V1.0
 *@Description:
 */
public class SequenceNumber {
	
	private static ThreadLocal<Integer> seqNum=new ThreadLocal<Integer>(){
		public Integer initialValue(){
			return 0;
		}
	};
	
	public int getNextNum(){
		seqNum.set(seqNum.get()+1);
		return seqNum.get();
	}
	
	public static void main(String[] args) {
		ExecutorService exec=Executors.newCachedThreadPool();
		for(int i=0;i<3;i++){
			TestClient t=new TestClient(new SequenceNumber());
			exec.execute(t);
		}
		exec.shutdown();
		
	}
	
	private static class TestClient implements Runnable{
		
		private SequenceNumber sn;
		
		public TestClient(SequenceNumber sn){
			this.sn=sn;
		}

		@Override
		public void run() {
			for(int i=0;i<3;i++){
				System.out.println("thread["+Thread.currentThread().getName()+"]sn["+sn.getNextNum());
			}
		}
		
	}
	

}
