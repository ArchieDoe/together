package gretham.together.professions;

import gretham.together.professions.bonus.IBonus;

import java.util.List;

public interface IProfession {
    List<IBonus> getBonusesForLevel(Integer Level);

    String getName();

    String getId();

    Integer getLevel();
}
