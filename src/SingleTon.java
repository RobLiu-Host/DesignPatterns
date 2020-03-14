/**
 * Created by Administrator on 2020/3/14 0014.
 */
public class SingleTon {

    private SingleTon() {

    }

    static SingleTon singleTon;

    public SingleTon getInstace() {
        if (singleTon == null) {
            singleTon = new SingleTon();
        }
        return singleTon;
    }

}
