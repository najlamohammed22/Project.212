
public class Event {

	private String title;
    private String date;
    private String time;
    private String location;
    private Contact UserEvent;
    
    public Event(String title, String date,String time, String location, Contact UserEvent) {
        this.title = title;
        this.date = date;
        this.time = time;
        this.location = location;
        this.UserEvent = UserEvent;
    }

    
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Contact getEventUser() {
		return UserEvent;
	}

	public void setEventUser(Contact UserEvent) {
		this.UserEvent = UserEvent;
	}
    
	 @Override
	    public String toString() {
	        return "Event title: " + title + "\n" +
	                "Contact name: " + UserEvent.getName() + "\n" +
	                "Event date and time (MM/DD/YYYY HH:MM): " + date + " " + time + "\n" +
	                "Event location: " + location + "\n" ;
	    }

}
