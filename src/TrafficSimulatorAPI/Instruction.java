package TrafficSimulatorAPI;

import java.io.Serializable;


public class Instruction implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1242660695919179813L;
	/* 
	 * TODO: add all the details that are sent from the main algortihm.
	 */
	int x;
	int y;
	int newState;
	int oldx;
	int oldy;
	String user;
	
	/**
	 * Instruction specifying new position of object.
	 * 
	 * @param nx - new x coord
	 * @param ny - new y coord
	 * @param state - type of tile to place
	 * 
	 * THIS IS TEMPORARY. THIS CLASS IS REUSED FROM A OLD GAME,
	 * SO ALL THE FIELDS DO NOT RELATE TO THE ACTUAL TRAFFIC SIMULATOR YET.
	 * 
	 * 
	 */
	public Instruction(int nx, int ny, int state, int ox, int oy, String usr){
		x = nx;
		y = ny;
		newState = state;
		oldx = ox;
		oldy = oy;
		user = usr;
	}

}
