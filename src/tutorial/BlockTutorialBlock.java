package tutorial;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTutorialBlock extends Block
{

	public BlockTutorialBlock(int id, Material material) 
	{
		super(id, material);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@SideOnly(Side.CLIENT)
	public static Icon topIcon;
	@SideOnly(Side.CLIENT)
	public static Icon bottomIcon;
	@SideOnly(Side.CLIENT)
	public static Icon sideIcon;
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon)
	{
		topIcon = icon.registerIcon(Tutorial.modid + ":" + (this.getUnlocalizedName().substring(5)) + "_top");
		bottomIcon = icon.registerIcon(Tutorial.modid + ":" + (this.getUnlocalizedName().substring(5)) + "_bottom");
		sideIcon = icon.registerIcon(Tutorial.modid + ":" + (this.getUnlocalizedName().substring(5)) + "_side");
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int metadata) {
	if(side == 0) {
	return bottomIcon;
	} else if(side == 1) {
	return topIcon;
	} else {
	return sideIcon;
	}
	}
}
