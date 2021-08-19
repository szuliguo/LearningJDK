package test.kang.hashmap;

/**
 * @author Legal[guo.li@tuya.com]
 * @date 2021/8/19
 */
public class HashMapTest01 {


    static final int MAXIMUM_CAPACITY = 1 << 30;        // 哈希数组最大容量



    public static void main(String[] args) {
        System.out.println(tableSizeFor(17));
    }




    /**
     * Returns a power of two size for the given target capacity.
     */
    /*
     * 根据预期的容量cap计算出HashMap中的哈希数组实际需要分配的容量
     * 如果输入值是2的冪，则原样返回，如果不是2的冪，则向上取就近的冪
     * 比如输入13，返回16，输入17，返回32
     */
    static final int tableSizeFor(int cap) {
        int n = -1 >>> Integer.numberOfLeadingZeros(cap - 1);
        return (n<0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }
}
