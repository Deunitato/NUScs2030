package cs2030.simulator;
/**
 * Parent class of all Events
 */
abstract class Event implements TryEvent{
  /** The customer associated with the event */
    private Customer c;
  /** Time of event occurance */
    private double time;
  /** Event state ID, used for PQ*/
    private int state;
  /** Server associated with event if exist*/
	private int serverID;
  /**
   * A Default constructor for the Event class.
   */
    protected Event(){}
  /**
   * A Overloaded constructor for the Event class.
   * @param  time, set the time of event occurance
   * @param  s, set the state ID of event
   */
    protected Event(double time,int s){
		this.time = time;
		this.state =s;
    }
  /**
   * A Overloaded constructor for the Event class.
   * @param  time, set the time of occurance
   * @param  c, set the Customer 
   * @param  s, set the state ID of event
   */
	protected Event(double time, Customer c,int s){
        this.time = time;
        this.c = c;
        this.state =s;
    }
  /**
   * A Overloaded constructor for the Event class.
   * @param  time, set the time of occurance
   * @param  c, set the Customer 
   * @param  s, set the state ID of event
   * @param server, set the server id
   */
    protected Event(double time, Customer c,int s,int server){
        this.time = time;
        this.c = c;
        this.state =s;
		this.serverID = server;
    }
  /**
   * gets the server ID
   * @return server ID
   */
	protected int getServer(){
		return this.serverID;
	}
  /**
   * sets the server ID
   * @param id,server ID
   */
    protected void setServerID(int id){
		 this.serverID = id;
	 }
  /**
   * gets the event time
   * @return time of server
   */
    protected double getTime(){
        return this.time;
    }
  /**
   * gets the Customer
   * @return customer
   */
    protected Customer getCustomer(){
		return this.c;
    }
  /**
   * gets the event state
   * @return state ID
   */
    protected int getState(){
		return this.state;
    }
  /**
   * Return a string representation of event
   * with the time in 3sf
   * @return The string representation of this event
   */
    public String toString(){
        return String.format("%.3f",this.time);
    }
  /**
   * Checks if server associated is human
   * @return true if is human, false if not
   */
	protected boolean isHuman(){
		if(this.serverID > EventSimulator.serverNum()){
			return false;
		}
		else{
			return true;
		}
	}
   /** 
  * try events that are not done nor served events
  */
    @Override
	public void tryEvent(){
		EventSimulator.tryServe(this);
	}
}
