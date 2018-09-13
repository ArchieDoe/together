package gretham.together.capabilities;

import gretham.together.professions.IProfession;
import gretham.together.professions.Profession;
import gretham.together.professions.ProfessionFactory;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.common.util.INBTSerializable;

import java.util.ArrayList;
import java.util.List;

public class ProfessionCapability implements IProfessionCapability {

    public static int MAX_PROFESSIONS = 2;

    private List<IProfession> professions;
    private int professionsCount;

    /**
     * Initializes capability.
     */
    public ProfessionCapability() {
        this.professions = new ArrayList<>();
        this.professionsCount = 0;
    }

    @Override
    public NBTTagCompound serializeNBT() {
        NBTTagCompound nbt = new NBTTagCompound();
        NBTTagList professionsList = new NBTTagList();

        List<IProfession> professions = this.getProfessions();

        for (IProfession profession : professions) {
            professionsList.appendTag(profession.serializeNBT());
        }

        nbt.setTag("professions", professionsList);

        return nbt;
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt) {
        NBTTagList professionsList = nbt.getTagList("professions", 10);

        // Reading all saved professions.
        for (int i = 0; i < professionsList.tagCount(); ++i) {
            NBTTagCompound profTag = professionsList.getCompoundTagAt(i);

            IProfession prof;

            try {
                prof = ProfessionFactory.create(profTag.getString("id"));
            } catch (Exception e) {
                // We're not loading this profession.
                continue;
            }

            // Adding profession to capability.
            prof.deserializeNBT(profTag);
            this.addProfession(prof);
        }
    }

    @Override
    public List<IProfession> getProfessions() {
        return this.professions;
    }

    @Override
    public boolean addProfession(IProfession profession) {
        if (this.professionsCount >= MAX_PROFESSIONS) {
            return false;
        }

        this.professions.add(profession);
        professionsCount++;

        return true;
    }

    public void resetProfessions() {
        this.professions = new ArrayList<>();
        professionsCount = 0;
    }
}
