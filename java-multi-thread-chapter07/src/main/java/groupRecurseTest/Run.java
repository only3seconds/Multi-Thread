package groupRecurseTest;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		ThreadGroup groupA = new ThreadGroup(mainGroup, "A");
		ThreadGroup groupB = new ThreadGroup(groupA, "B");
		
		ThreadGroup[] listGroup1 = new ThreadGroup[mainGroup.activeGroupCount()];
		mainGroup.enumerate(listGroup1, true);
		for (int i = 0; i < listGroup1.length; i++) {
			if (listGroup1[i] != null) {
				System.out.println("递归" + listGroup1[i].getName());
			}
		}

		ThreadGroup[] listGroup2 = new ThreadGroup[mainGroup.activeGroupCount()];
		mainGroup.enumerate(listGroup2, false);
		for (int i = 0; i < listGroup2.length; i++) {
			if (listGroup2[i] != null) {
				System.out.println("非递归" + listGroup2[i].getName());
			}
		}
	}

}
