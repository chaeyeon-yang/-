package Problem26;

abstract class PairMap {
    protected String keyArray[];
    protected String valueArray[];
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract void delete(String key);
    abstract int length();

}
