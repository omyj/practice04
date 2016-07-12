package prob4;

public class SmartPhone extends MusicPhone {
//
//	@Override
//	public void execute(String function) {
//		if (function.equals("앱")) {
//			excuteApp();
//			return;
//		}
//		
//		super.execute(function);
//	}

	 @Override
	public void execute(String function) {
			if (function.equals("앱")) {
			excuteApp();
			return;
		}
		 super.execute(function);
	}



	private void excuteApp() {
	 System.out.println("앱실행");
	 }

}
