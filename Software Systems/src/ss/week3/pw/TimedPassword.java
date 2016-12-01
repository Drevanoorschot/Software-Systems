package ss.week3.pw;

import ss.week2.hotel.Password;

public class TimedPassword extends Password {
	private long validTime;
	private long startTime;
	private static long defaultExpTime = 200000;

	public TimedPassword(long expTime) {
		super();
		validTime = expTime * 1000;
		startTime = System.currentTimeMillis();
	}
	public TimedPassword() {
		new TimedPassword(defaultExpTime);
	}
	public boolean isExpired() {
		return validTime <= System.currentTimeMillis() - startTime;
	}
	@Override
	public boolean setWord(String oldpass, String newpass) {
		if (super.setWord(oldpass, newpass)) {
			startTime = System.currentTimeMillis();
			return true;
		} else {
			return false;
		}
		/*
		 * when you overwrite testWord to return false always, 
		 * you can't change you password so after expiration, you have to make a new password.
		 */
	}
}
