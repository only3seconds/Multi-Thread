package synLockIn_2;

public class Sub extends Main{
	
	synchronized public void operateISubMethod(){
		try{
			while(i > 0){
			i--;
			System.out.println("sub print i=" + i);
			Thread.sleep(100);
			this.operateIMainMethod();//子类可以通过“可重入锁”调用父类的同步方法
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
