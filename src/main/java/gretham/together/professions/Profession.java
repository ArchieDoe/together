package gretham.together.professions;

import gretham.together.professions.bonus.IBonus;
import net.minecraft.nbt.NBTBase;
import net.minecraftforge.common.util.INBTSerializable;

import java.util.List;

abstract public class Profession implements IProfession, INBTSerializable {

    protected String name;
    protected String id;

    protected Integer level;

    public Profession() {
        this.level = 0;
    }

    @Override
    public List<IBonus> getBonusesForLevel(Integer Level) {
        return null;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public Integer getLevel() {
        return this.level;
    }

    @Override
    public NBTBase serializeNBT() {
        return null;
    }

    @Override
    public void deserializeNBT(NBTBase nbt) {

    }
}
