package gretham.together.capabilities;

import gretham.together.professions.IProfession;

import java.util.List;

public interface IProfessionCapability {

    /**
     * Returns all professions attached to capability.
     *
     * @return list of profesions.
     */
    public List<IProfession> getProfessions();

    /**
     * Adds profession to capability.
     *
     * @param Profession profession to add.
     *
     * @return result of adding professions to capability.
     */
    public boolean addProfession(IProfession Profession);

}
