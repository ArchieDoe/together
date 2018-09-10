package gretham.together.capabilities;

import gretham.together.professions.IProfession;
import gretham.together.professions.Profession;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.common.util.INBTSerializable;

import java.util.ArrayList;
import java.util.List;

public class ProfessionCapability implements IProfessionCapability, INBTSerializable<NBTTagCompound> {

    public static int MAX_PROFESSIONS = 2;

    private List<Profession> professions;
    private int professionsCount;

    /**
     * Initializes capability.
     */
    public ProfessionCapability() {
        this.professions = new ArrayList<Profession>();
        this.professionsCount = 0;
    }

    @Override
    public NBTTagCompound serializeNBT() {
        NBTTagCompound nbt = new NBTTagCompound();
        NBTTagList professionsList = new NBTTagList();

        List<Profession> professions = this.getProfessions();

        for (Profession profession : professions) {
            professionsList.appendTag(profession.serializeNBT());
        }

        nbt.setTag("professions", professionsList);

        return nbt;
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt) {

    }

    @Override
    public List<Profession> getProfessions() {
        return this.professions;
    }

    @Override
    public boolean addProfession(Profession profession) {
        if (this.professionsCount >= MAX_PROFESSIONS) {
            return false;
        }

        this.professions.add(profession);

        return true;
    }
}
