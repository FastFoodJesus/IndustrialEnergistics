package ffj.industrialenergistics;

import cpw.mods.fml.common.Mod;
//import cpw.mods.fml.common.Mod.EventHandler; // used in 1.6.2
import cpw.mods.fml.common.Mod.PreInit;    // used in 1.5.2
import cpw.mods.fml.common.Mod.Init;       // used in 1.5.2
import cpw.mods.fml.common.Mod.PostInit;   // used in 1.5.2
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.MinecraftForge;

import ic2.api.item.Items;

import appeng.api.Materials;

@Mod(modid="industrialenergistics", name="Industrial Energistics", version="0.1.1", dependencies="required-after:IC2;required-after:AppliedEnergistics")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class industrialenergistics {

        // The instance of your mod that Forge uses.
        @Instance("industrialenergistics")
        public static industrialenergistics instance;
        
        //TODO: Cleanup and move
        private final static Item matProcBasicQuad = new MatProcBasicQuad(5000);
        private static final Item matProcAdvQuad = new MatProcBasicQuad(5001).setMaxStackSize(64).setUnlocalizedName("matProcAdvQuad");
        
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="ffj.industrialenergistics.client.ClientProxy", serverSide="ffj.industrialenergistics.CommonProxy")
        public static CommonProxy proxy;
        
        //@EventHandler // used in 1.6.2
        @PreInit    // used in 1.5.2
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        }
        
        //@EventHandler // used in 1.6.2
        @Init       // used in 1.5.2
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
                
                //TODO: Clean this up, maybe move to proxy class
                ItemStack flint = new ItemStack(Item.flint);
                ItemStack nQuartz = new ItemStack(Item.netherQuartz);
                
                GameRegistry.addRecipe(new ItemStack(Item.netherQuartz, 16), " x ", "xyx", " x ",
                        'x', Items.getItem("matter"), 'y', flint);
                
                GameRegistry.addRecipe(Materials.matQuartz, " x ", "xyx", " x ",
                        'x', ic2.api.item.Items.getItem("matter"), 'y', nQuartz);
                
                LanguageRegistry.addName(matProcBasicQuad, "Basic Quad-core Processor");
                LanguageRegistry.addName(matProcAdvQuad, "Advanced Quad-core Processor");
        }
        
        //@EventHandler // used in 1.6.2
        @PostInit   // used in 1.5.2
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
}