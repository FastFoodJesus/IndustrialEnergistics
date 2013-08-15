package ffj.industrialenergistics;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.texture.IconRegister;

public class MatProcBasicQuad extends Item {

	public MatProcBasicQuad(int par1) {
		super(par1);
		
		//Constructor Configuration
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("matProcBasicQuad");
				
	}
	
}
