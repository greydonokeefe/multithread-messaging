package thread;

public class Messenger extends Thread {
	
	private MessageQueue messageQueue;
	
	public Messenger(MessageQueue messageQueue) {
		this.messageQueue = messageQueue;
	}
	
	public void run() {
		for (int i = 0; i < 20; i++) {
			String message = "message " + i;
			this.messageQueue.addMessage(message);
			System.out.println("Messenger - insert: \"" + message + "\" at " + Util.getCurrentTime());
			
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				System.err.println("Thread was interrupted");
			}
		}
	}

}