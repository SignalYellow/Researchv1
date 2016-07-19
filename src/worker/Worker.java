package worker;

public class Worker {
	
	private int turn = 0;
	
	public Worker(){
		
	}
	
	public boolean goNextTurnAndWantsToQuit(){
		if(this.wantsToQuit()){
			return false;
		}
		
		return false;
	}
	
	private boolean wantsToQuit(){
		return true;
	}
	
}
