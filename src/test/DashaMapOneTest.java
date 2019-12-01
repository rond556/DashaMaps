import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class DashaMapOneTest {

    DashaMapOne hashMap = new DashaMapOne();
    @Before
    public void setUp(){
        hashMap.set("Terra", 1);
        hashMap.set("Locke", 2);
        hashMap.set("Edgar", 3);
        hashMap.set("Sabin", 4);
    }

    @Test
    public void setAndGetTest() {
        Integer actual = hashMap.get("Edgar");
        Integer expected = 3;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void deleteTest() {
        hashMap.delete("Sabin");
        Assert.assertNull(hashMap.get("Sabin"));
    }

    @Test
    public void isEmptyTest1() {
        hashMap.delete("Edgar");
        hashMap.delete("Sabin");
        Assert.assertFalse(hashMap.isEmpty());
    }

    @Test
    public void isEmptyTest2() {
        hashMap.delete("Edgar");
        hashMap.delete("Sabin");
        hashMap.delete("Terra");
        hashMap.delete("Locke");
        Assert.assertTrue(hashMap.isEmpty());
    }

    @Test
    public void size() {
        Integer expected = 4;
        Integer actual = hashMap.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void bucketTest(){
        hashMap.set("Tim", 5);
        hashMap.set("Tabatha", 6);
        hashMap.set("Tony", 7);
        hashMap.set("Tarantula", 8);
        hashMap.set("Bogard", 9);
        Integer expected = 5;

        Assert.assertEquals(expected,hashMap.bucketSize("T"));

    }
}