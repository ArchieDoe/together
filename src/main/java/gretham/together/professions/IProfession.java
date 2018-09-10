package gretham.together.professions;

import gretham.together.professions.bonus.IBonus;

import java.util.List;

public interface IProfession {
    public List<IBonus> getBonusesForLevel(Integer Level);

    public String getName();

    public String getId();

    public Integer getLevel();
}
