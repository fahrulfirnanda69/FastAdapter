package com.mikepenz.fastadapter.app.model

import com.mikepenz.fastadapter.app.R

/**
 * Created by mikepenz on 28.12.15.
 */
class RightModelIconItem(icon: IconModel) : ModelIconItem(icon) {

    /**
     * defines the type defining this item. must be unique. preferably an id
     *
     * @return the type
     */
    override val type: Int
        get() = R.id.fastadapter_right_Model_icon_item_id

    /**
     * defines the layout which will be used for this item in the list
     *
     * @return the layout for this item
     */
    override val layoutRes: Int
        get() = R.layout.right_icon_item
}
