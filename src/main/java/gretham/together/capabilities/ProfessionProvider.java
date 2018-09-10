package gretham.together.capabilities;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ProfessionProvider implements  ICapabilitySerializable<NBTBase> {

    @CapabilityInject(IProfessionCapability.class)
    public static Capability<IProfessionCapability> CAPABILITY_PROFESSION = null;

    private IProfessionCapability instance = CAPABILITY_PROFESSION.getDefaultInstance();

    @Override
    public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing facing) {
        return capability == CAPABILITY_PROFESSION;
    }

    @Nullable
    @Override
    public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing) {
        return capability == CAPABILITY_PROFESSION ? CAPABILITY_PROFESSION.<T> cast(this.instance) : null;
    }

    @Override
    public NBTBase serializeNBT() {
        return null;
    }

    @Override
    public void deserializeNBT(NBTBase nbt) {

    }
}
