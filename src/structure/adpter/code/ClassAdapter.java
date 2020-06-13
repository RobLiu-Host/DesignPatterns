package structure.adpter.code;

/**
 * Created by Administrator on 2020/6/13 0013.
 * 类适配器
 */
public class ClassAdapter implements Target {

    AdapterTarget adapterTarget;

    public ClassAdapter(AdapterTarget adapterTarget) {
        this.adapterTarget = adapterTarget;
    }

    @Override
    public void requestData() {
        adapterTarget.requestNewData();
    }

}
