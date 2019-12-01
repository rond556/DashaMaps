public interface HashMapX {

    public void set(String key, Integer value);
    public void delete(String key);
    public Integer get(String key);
    public Boolean isEmpty();
    public Integer size();
    public Integer bucketSize(String key);

}
