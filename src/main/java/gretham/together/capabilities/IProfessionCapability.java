package gretham.together.capabilities;

import gretham.together.professions.IProfession;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.INBTSerializable;

import java.util.List;

public interface IProfessionCapability extends INBTSerializable<NBTTagCompound> {

    /**
     * Returns all professions attached to capability.
     *
     * @return list of profesions.
     */
    List<IProfession> getProfessions();

    /**
     * Adds profession to capability.
     *
     * @param Profession profession to add.
     *
     * @return result of adding professions to capability.
     */
    boolean addProfession(IProfession Profession);

    void resetProfessions();

}
