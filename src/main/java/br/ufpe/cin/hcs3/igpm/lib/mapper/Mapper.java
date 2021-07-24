package br.ufpe.cin.hcs3.igpm.lib.mapper;

public class Mapper{

    private Mapper() throws IllegalAccessException {
        throw new IllegalAccessException();
    }

    public static <T> T[] mapToList(String json, Class<T[]> type) {
        return GsonSingleton.getInstance().fromJson(json, type);
    }
}
