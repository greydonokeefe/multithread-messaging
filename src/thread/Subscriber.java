package thread;

public class Subscriber extends Thread {
	
	private MessageQueue messageQueue;
	
	public Subscriber(MessageQueue messageQueue) {
		this.messageQueue = messageQueue;
	}
	
	public void run() {
		for (int i = 0; i < 20; i++) {
			String message = this.messageQueue.getMessage();
			
			if (message != "") {
				System.out.println("Subscriber - read: \"" + message + "\" at " + Util.getCurrentTime());
            } else {
    			System.out.println("Subscriber - tried to read but no message...");
            }
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				System.err.println("Thread was interrupted");
			}
		}
	}

}