package me.lukas.SkyblockMultiplayer;

import java.io.IOException;
import java.util.ArrayList;
import org.bukkit.inventory.ItemStack;

public class Data {
	
	public static ItemStack[] itemsChest;
	public static ArrayList<PlayerInfo> players = new ArrayList<PlayerInfo>();
	public static String[] mods = new String[0];
	public static int AnzahlPlayers;
	
	public static void addMod(String pname){
		String mods = SkyblockMultiplayer.sconf.getString("mods");
		mods+=" "+pname;
		Data.mods = mods.split(" ");
		
		//Speichere in Datei
		
		SkyblockMultiplayer.sconf.set("mods", mods);
		try {
			SkyblockMultiplayer.sconf.save(SkyblockMultiplayer.sconfFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
