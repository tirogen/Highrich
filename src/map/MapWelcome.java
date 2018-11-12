package map;

import UI.Images;
import UI.Rectangle;
import character.Npc;
import character.Receptionist;
import javafx.scene.canvas.GraphicsContext;

public class MapWelcome extends Map{
	private static final int maxReceptionist = 4;
	private int numberOfReceptionist;
	
	public MapWelcome(){
		super();
		this.setWarpUp(new Rectangle(Images.warp, 190, 0));
		this.setBackground(Images.floor);
		this.addStruct(new Rectangle(Images.tree, 140, 442));
		this.addStruct(new Rectangle(Images.tree, 288, 442));
		this.addStruct(new Rectangle(Images.sofa, 431, 118));
		
		//test bot
		this.addNpc(new Npc(Images.playerD, this, 100, 0, 0, 1));
		this.addNpc(new Npc(Images.playerD, this, 100, 400, 0, -1));
	}
	
	public int addReceptionist(int n){
		if(this.numberOfReceptionist == this.maxReceptionist) {
			n = 0;
//			throw new Exception or may be pop up message ("Can't add more receptionist");
		}
		else if(this.numberOfReceptionist + n > this.maxReceptionist) n = this.maxReceptionist - this.numberOfReceptionist;
		for(int i = 0; i < n; i++) {
			double x = 10;
			double y = 100 + this.numberOfReceptionist * 20;
			this.numberOfReceptionist += 1;
			Npc receptionist = new Receptionist(Images.playerR, this, x, y);
			this.getNpcList().add(receptionist);
		}
		//this function return number of receptionists have been added
		return n;
	}
	
}
