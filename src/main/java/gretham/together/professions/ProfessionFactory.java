package gretham.together.professions;

public class ProfessionFactory {
    public static IProfession create(String id) throws RuntimeException {
        switch (id) {
            case "profession_miner":
                return new Miner();

            case "profession_smith":
                return new Miner();

            default:
                throw new RuntimeException("Unable to recognise profession by given ID.");
        }
    }
}
