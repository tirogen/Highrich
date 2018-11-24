package UI;

import javafx.scene.image.Image;

public class Images {

		public static final Image STARTBACKGROUND = new Image(ClassLoader.getSystemResource("StartScene.png").toString());
		public static final Image STARTBUTTON = new Image(ClassLoader.getSystemResource("StartButton.png").toString());
		public static final Image STARTBUTTONHOVER = new Image(ClassLoader.getSystemResource("StartButtonHover.png").toString());
		public static final Image FLOOR = new Image(ClassLoader.getSystemResource("floor.png").toString());
		
		public static final Image[] PLAYERL = {new Image(ClassLoader.getSystemResource("PlayerL.png").toString())};
		public static final Image[] PLAYERR = {new Image(ClassLoader.getSystemResource("PlayerR.png").toString())};
		public static final Image[] PLAYERU = {new Image(ClassLoader.getSystemResource("PlayerU.png").toString())};
		public static final Image[] PLAYERD = {new Image(ClassLoader.getSystemResource("PlayerD.png").toString())};
		
		public static final Image[] TEENAGERL = new Image[3];
		public static final Image[] TEENAGERR = new Image[3];
		public static final Image[] TEENAGERU = new Image[3];
		public static final Image[] TEENAGERD = new Image[3];
		
		public static final Image[] OLDMANL = new Image[3];
		public static final Image[] OLDMANR = new Image[3];
		public static final Image[] OLDMANU = new Image[3];
		public static final Image[] OLDMAND = new Image[3];
		
		public static final Image[] ADULTL = new Image[3];
		public static final Image[] ADULTR = new Image[3];
		public static final Image[] ADULTU = new Image[3];
		public static final Image[] ADULTD = new Image[3];
		
		public static final Image[] Receptionist = {new Image(ClassLoader.getSystemResource("Receptionist.png").toString())};
		
		public static final Image TREE = new Image(ClassLoader.getSystemResource("Tree.png").toString());
		public static final Image SOFA = new Image(ClassLoader.getSystemResource("Sofa.png").toString());
		public static final Image RECEPTIONTABLE = new Image(ClassLoader.getSystemResource("ReceptionTable.png").toString()); 
		public static final Image WARP = new Image(ClassLoader.getSystemResource("Warp.png").toString());
		
		public static final Image TRACTOR = new Image(ClassLoader.getSystemResource("Tractor.png").toString());
		public static final Image DustConstruction = new Image(ClassLoader.getSystemResource("DustConstruction.png").toString());
		
		public static final Image CONSTRUCTIONROOM = new Image(ClassLoader.getSystemResource("ConstructionRoom.png").toString());
		public static final Image STANDARDROOM = new Image(ClassLoader.getSystemResource("StandardRoom.png").toString());
		public static final Image EXECUTIVEROOM = new Image(ClassLoader.getSystemResource("ExecutiveRoom.png").toString());
		public static final Image PRESIDENTIALROOM = new Image(ClassLoader.getSystemResource("PresidentialRoom.png").toString());
		
		public static final Image HORIZONTALWALL = new Image(ClassLoader.getSystemResource("HorizontalWall.png").toString());
		public static final Image VERTICALWALL = new Image(ClassLoader.getSystemResource("VerticalWall.png").toString());
		public static final Image VERTICALWALLONDOOR = new Image(ClassLoader.getSystemResource("VerticalWallOnDoor.png").toString());

		public static final Image TOILETLEFT = new Image(ClassLoader.getSystemResource("ToiletLeft.png").toString());
		public static final Image TOILETRIGHT = new Image(ClassLoader.getSystemResource("ToiletRight.png").toString());
		public static final Image BEDLEFT = new Image(ClassLoader.getSystemResource("BedLeft.png").toString());
		public static final Image BEDRIGHT = new Image(ClassLoader.getSystemResource("BedRight.png").toString());
		public static final Image TVLEFT = new Image(ClassLoader.getSystemResource("TVLeft.png").toString());
		public static final Image TVRIGHT = new Image(ClassLoader.getSystemResource("TVRight.png").toString());
		public static final Image BIGTABLE = new Image(ClassLoader.getSystemResource("BigTable.png").toString());
		
		static {
			for(int i = 0; i < 3; i++) {
				TEENAGERL[i] = new Image(ClassLoader.getSystemResource("TeenagerL" + i + ".png").toString());
				TEENAGERR[i] = new Image(ClassLoader.getSystemResource("TeenagerR" + i + ".png").toString());
				TEENAGERU[i] = new Image(ClassLoader.getSystemResource("TeenagerU" + i + ".png").toString());
				TEENAGERD[i] = new Image(ClassLoader.getSystemResource("TeenagerD" + i + ".png").toString());		
				
				OLDMANL[i] = new Image(ClassLoader.getSystemResource("OLDMANL" + i + ".png").toString());
				OLDMANR[i] = new Image(ClassLoader.getSystemResource("OLDMANR" + i + ".png").toString());
				OLDMANU[i] = new Image(ClassLoader.getSystemResource("OLDMANU" + i + ".png").toString());
				OLDMAND[i] = new Image(ClassLoader.getSystemResource("OLDMAND" + i + ".png").toString());
				
				ADULTL[i] = new Image(ClassLoader.getSystemResource("ADULTL" + i + ".png").toString());
				ADULTR[i] = new Image(ClassLoader.getSystemResource("ADULTR" + i + ".png").toString());
				ADULTU[i] = new Image(ClassLoader.getSystemResource("ADULTU" + i + ".png").toString());
				ADULTD[i] = new Image(ClassLoader.getSystemResource("ADULTD" + i + ".png").toString());
			}
		}

}
