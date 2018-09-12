package gretham.together.professions;

import gretham.together.professions.bonus.IBonus;
import net.minecraft.nbt.NBTTagCompound;

import java.util.List;

abstract public class Profession implements IProfession {

    protected String name;
    protected String id;
    protected Integer exp;

    protected Integer level;

    public Profession() {
        this.exp = 0;
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
    public NBTTagCompound serializeNBT() {
        NBTTagCompound nbt = new NBTTagCompound();

        nbt.setInteger("level", this.level);
        nbt.setInteger("exp", this.exp);
        nbt.setString("id", this.id);

        return nbt;
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt) {
        this.level = nbt.getInteger("level");
        this.exp = nbt.getInteger("exp");
    }
}
