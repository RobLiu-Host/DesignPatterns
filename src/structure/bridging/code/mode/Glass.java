package structure.bridging.code.mode;

/**
 * Created by Administrator on 2020/6/13 0013.
 */
public abstract class Glass {


    Seasoning seasoning;

    public Glass(Seasoning seasoning) {
        this.seasoning = seasoning;
    }

    public void drink() {
        seasoning.addTaste();
    }
}
