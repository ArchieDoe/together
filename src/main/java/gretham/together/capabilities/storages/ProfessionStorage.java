package gretham.together.capabilities.storages;

import gretham.together.capabilities.IProfessionCapability;
import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;

public class ProfessionStorage
        implements Capability.IStorage<IProfessionCapability> {

    @Override
    public NBTBase writeNBT(Capability<IProfessionCapability> capability, IProfessionCapability instance, EnumFacing side) {
        // return an NBT tag
        return null;
    }

    @Override
    public void readNBT(Capability<IProfessionCapability> capability, IProfessionCapability instance, EnumFacing side, NBTBase nbt) {
        // load from the NBT tag
    }
}