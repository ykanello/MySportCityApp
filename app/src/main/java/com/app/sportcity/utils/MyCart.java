package com.app.MysportcityApp.utils;

import com.app.MysportcityApp.objects.ItemDetail;
import com.app.MysportcityApp.statics.StaticVariables;

/**
 * Created by bugatti on 22/01/17.
 */

public class MyCart {

//    Context context;
    private static MyCart myCartInstance;

    private MyCart(){}

    public static MyCart getInstance () {
        if(myCartInstance==null){
            myCartInstance = new MyCart();
        }
        return myCartInstance;
    }

    public boolean addItemToCart(ItemDetail item) {
        return StaticVariables.Cart.addItem(item);
    }

    private int getItemCount() {
        return StaticVariables.cartDetails.getTotalCount();
    }

}
