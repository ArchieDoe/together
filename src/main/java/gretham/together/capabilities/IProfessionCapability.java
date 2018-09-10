package gretham.together.capabilities;

import gretham.together.professions.Profession;

import java.util.List;

public interface IProfessionCapability {

    /**
     * Returns all professions attached to capability.
     *
     * @return list of profesions.
     */
    List<Profession> getProfessions();

    /**
     * Adds profession to capability.
     *
     * @param Profession profession to add.
     *
     * @return result of adding professions to capability.
     */
    boolean addProfession(Profession Profession);

}
