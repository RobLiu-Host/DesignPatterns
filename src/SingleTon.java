/**
 * Created by liuba on 2020/3/14 0014.
 *
 * DCL模式 单例模式 Double Check
 *
 * 通过同步synchroniozed关键字锁住实例 在多线程下 返回同一个实例 cpu消耗问题
 */
public class SingleTon {

    private SingleTon() {
    }

    private volatile static SingleTon singleTon;

    /**
     *
     * @return 对象实例
     */
    public synchronized SingleTon getInstance() {
        if (singleTon == null) {
            synchronized (SingleTon.class){
                singleTon = new SingleTon();
            }
        }
        return singleTon;
    }

}
