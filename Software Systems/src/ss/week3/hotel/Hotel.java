package ss.week3.hotel;


public class Hotel {
	public Room room1;
	public Room room2;
	public Password hotelPassword;
	public Guest guest;
	public Guest guest2;
	public Safe safe1;
	public Safe safe2;
	public String hotelName;
	
	public Hotel(String name) {
		hotelName = name;
		hotelPassword = new Password();
		room1 = new Room(101);
		room2 = new Room(102);
		
	}
	//@ requires password == getPassword().password;
	//@ ensures getRoom(name) == (room1) || getRoom(name) == (room2) || getRoom(name) == null;
	public Room checkIn(String password, String name) {
		if (getPassword().testWord(password)) {
			guest = new Guest(name);
			Room room = getFreeRoom();
			if (room != null) {
				guest.checkin(room);
				return room;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	//@ requires getRoom(name) != null;
	//@ ensures !\old(getRoom(name).getSafe().isActive());
	//@ ensures getRoom(name) == null;
	public void checkOut(String name) {
		if (getRoom(name) == null) {
			return;
		} else {
			guest = getRoom(name).getGuest();
			guest.getRoom().getSafe().deactivate();
			guest.checkout();
		}
	}
	//@pure
	public Room getFreeRoom() {
		if (room1.getGuest() == null) {
			return room1;
		}
		if (room2.getGuest() == null) {
			return room2;
		} else {
			return null;
		}
	}
	//@pure
	public Room getRoom(String name) {
		if (room1.getGuest() != null) {
			if (room1.getGuest().getName().equals(name)) {
				return room1;
			} else {
				return null;
			}
		}
		if (room2.getGuest() != null) {
			if (room2.getGuest().getName().equals(name)) {
				return room2;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}
	
	//@pure
	public Password getPassword() {
		return hotelPassword;
	}
	//@pure
	public String toString() {
		return "room1:Guest1:" + room1.getGuest() + "SafeActive1:" + room1.getSafe().isActive() +
			   "room2:Guest2:" + room2.getGuest() + "SafeActive2:" + room2.getSafe().isActive();
	}

}
