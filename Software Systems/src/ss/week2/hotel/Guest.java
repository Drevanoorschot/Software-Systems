package ss.week2.hotel;
/**
 * Hotel guest with name and possibly a room.
 * @author Dré van Oorschot
 * @version $Revision: 1.0 $
 */
public class Guest {
	public String name;
	public Room room;
    /**
     * Creates a <code>Guest</code> with the given name, without a room.
     * @param name of the new <code>Guest</code>
     */
	public Guest(String n) {
		name = n;
	}
	 /**
     * Returns the name of this <code>guest</code>.
     */
	public String getName() {
		return name;
	}
    /**
     * Returns the current room assigned to this <code>Guest</code>.
     * @return the room of this <code>Guest</code>;
     *         <code>null</code> if this <code>Guest</code> 
     *         is not currently renting a room.
     */
	public Room getRoom() {
		return room;
	}
    /**
     * Rents a <code>Room</code> to this <code>Guest</code>.
     * @param r whether the <code>Guest</code> rents a <code>room</code>;
     *        if <code>false</code> is passed, this <code>Guest</code>
     *        has no room
     */
	public boolean checkin(Room r) {
		if (r.getGuest() == null && this.room == null) {
			r.setGuest(this);
			room = r;
			return true;
		} else {
			return false;	
		}
		
	}
    /**
     * Sets a <code>Room</code> of this <code>Guest</code> to <code>null</code>.
     */
	public boolean checkout() {
		if (this.room == null) {
			return false;
		} else {
			this.room.setGuest(null);
			this.room = null;
			return true;
		}
	}
	public String toString() {
		return "Name:" + name + "Room" + room;
	}

}
