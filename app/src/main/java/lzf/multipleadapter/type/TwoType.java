package lzf.multipleadapter.type;

import android.view.View;

import lzf.multipleadapter.R;
import lzf.multipleadapter.holder.BaseViewHolder;
import lzf.multipleadapter.holder.TwoViewHolder;


/**
 * Created by Administrator on 2017/4/7 0007.
 */
public class TwoType implements TypeInterface {
    private String text;

    public TwoType(String text) {
        this.text = text;
    }
    public String getContent(){
     return text;
    }
    @Override
    public int getLayout() {
        return R.layout.item_two;
    }

    @Override
    public BaseViewHolder createViewHolder(View itemView) {
        return new TwoViewHolder(itemView);
    }
}
