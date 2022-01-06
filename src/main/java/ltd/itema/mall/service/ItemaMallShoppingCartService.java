
package ltd.itema.mall.service;

import ltd.itema.mall.controller.vo.ItemaMallShoppingCartItemVO;
import ltd.itema.mall.entity.ItemaMallShoppingCartItem;

import java.util.List;

public interface ItemaMallShoppingCartService {

    /**
     * 保存商品至购物车中
     *
     * @param itemaMallShoppingCartItem
     * @return
     */
    String saveItemaMallCartItem(ItemaMallShoppingCartItem itemaMallShoppingCartItem);

    /**
     * 修改购物车中的属性
     *
     * @param itemaMallShoppingCartItem
     * @return
     */
    String updateItemaMallCartItem(ItemaMallShoppingCartItem itemaMallShoppingCartItem);

    /**
     * 获取购物项详情
     *
     * @param itemaMallShoppingCartItemId
     * @return
     */
    ItemaMallShoppingCartItem getItemaMallCartItemById(Long itemaMallShoppingCartItemId);

    /**
     * 删除购物车中的商品
     *
     *
     * @param shoppingCartItemId
     * @param userId
     * @return
     */
    Boolean deleteById(Long shoppingCartItemId, Long userId);

    /**
     * 获取我的购物车中的列表数据
     *
     * @param itemaMallUserId
     * @return
     */
    List<ItemaMallShoppingCartItemVO> getMyShoppingCartItems(Long itemaMallUserId);
}
