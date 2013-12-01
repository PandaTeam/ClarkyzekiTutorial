package tutorial;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTutorialBlock extends Block
{

	public BlockTutorialBlock(int id, Material material) 
	{
		super(id, material);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

}
