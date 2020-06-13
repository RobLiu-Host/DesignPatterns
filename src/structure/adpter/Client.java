package structure.adpter;

import structure.adpter.code.AdapterTarget;
import structure.adpter.code.ClassAdapter;
import structure.adpter.code.Target;
import structure.bridging.code.mode.Glass;
import structure.bridging.code.mode.LagreGlass;
import structure.bridging.code.mode.Milk;
import structure.bridging.code.mode.Seasoning;

/**
 * Created by Administrator on 2020/6/13 0013.
 *
 */
public class Client {

    public static void main(String[]args){

        Target target=new ClassAdapter(new AdapterTarget());
        target.requestData();
    }

}
