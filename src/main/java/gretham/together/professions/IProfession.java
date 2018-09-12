package gretham.together.professions;

import gretham.together.professions.bonus.IBonus;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.INBTSerializable;

import java.util.List;

public interface IProfession extends INBTSerializable<NBTTagCompound> {
    List<IBonus> getBonusesForLevel(Integer Level);

    String getName();

    String getId();

    Integer getLevel();
}
