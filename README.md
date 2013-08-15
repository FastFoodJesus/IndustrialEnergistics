IndustrialEnergistics
=====================
Welcome to the Industrial Energistics GitHub repo.
Considering that I haven't told anyone but my wife about this project, I'm surprised you've found it. But anyway...

Industrial Energistics is a WIP mod for Minecraft that looks to build upon IndustrialCraft 2 and Applied Energistics
by adding new options for automation, cabling, and cross-integration. As soon as I get a chance I'll add some of my actual code here.

Currently being built upon Minecraft 1.5.2, Forge 7.8.1.738, IC2 1.117.921, and AE rv12-b. Yes, I'm a Minecraft version behind, but my wife and I play on this version, and will continue to do so until certain other mods update.

What's done:
  - Added UU Matter recipies for Nether Quartz and Certus Quartz.
  - Added Basic and Advanced Quad-Core Processors, to be used later. (currently not craftable)
 
  
What's definitely planned:
  - Hybrid Fiber Cable: A combination of AE's ME cable and IC2's Glass Fiber Cable, able to transmit both EU and ME
      network activity simultaneously.
  - Hybrid Buses: Functions as both Glass Fiber Cable and any of AE's ME buses. Allows fewer sides on a block to be
      used, as it will transmit EU to IC2-compatible machines.
  - Nuclear Maintenance Bus: A big one, this is. Allows precise nuclear reactor automation. Not all details are worked
      out yet, but I'm planning a GUI that will allow specific slots in the reactor to be stocked into/drawn from. Fuzzy
      functionality will enable component manipulation within certain heat percentages (removing condensators at 75% of
      heat capacity, e.g.) Due to concerns about power blowing up your machines, this will NOT be available as a hybrid         version

What's being considered (but not yet confirmed):
  - ME Fabricator Engine: Like IC2's Mass Fabricator, but integrated into AE's MAC as an optional block to be placed with
    the Crafting CPUs and Pattern Providers. Will produce UU matter on demand for missing resources that can be crafted       from UU matter (provided it gets enough EU), then automatically craft said resource.
  - Mass Accelerator Cannon: An upgraded version of AE's Matter Cannon.
