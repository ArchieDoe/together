package gretham.together.capabilities;

import gretham.together.professions.IProfession;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.INBTSerializable;

import java.util.ArrayList;
import java.util.List;

public class ProfessionCapability implements IProfessionCapability, INBTSerializable<NBTTagCompound> {

    public static int MAX_PROFESSIONS = 2;

    private List<IProfession> professions;
    private int professionsCount;

    /**
     * Initializes capability.
     */
    public ProfessionCapability() {
        professions = new ArrayList<IProfession>();
        professionsCount = 0;
    }

    @Override
    public NBTTagCompound serializeNBT() {
        return null;
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt) {

    }

    @Override
    public List<IProfession> getProfessions() {
        return professions;
    }

    @Override
    public boolean addProfession(IProfession profession) {
        if (professionsCount >= MAX_PROFESSIONS) {
            return false;
        }

        professions.add(profession);

        return true;
    }
}
