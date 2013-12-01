package tutorial;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Tutorial.modid, name = "Tutorial Mod", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Tutorial 
{
	public static final String modid = "clarkyzeki_tutorial";
	
	public static Block tutorialBlock;
	
	public static Item tutorialItem;
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		tutorialBlock = new BlockTutorialBlock(500, Material.rock).setUnlocalizedName("tutorialBlock");
		
		GameRegistry.registerBlock(tutorialBlock, modid + tutorialBlock.getUnlocalizedName().substring(5));
		
		LanguageRegistry.addName(tutorialBlock, "Tutorial Block");
		
		tutorialItem = new ItemTutorial(5000).setUnlocalizedName("tutorialItem");
		
		LanguageRegistry.addName(tutorialItem, "Tutoiral Item");
	}
}
