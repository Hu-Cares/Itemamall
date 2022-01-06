
package ltd.itema.mall.dao;

import ltd.itema.mall.entity.ItemaMallShoppingCartItem;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ItemaMallShoppingCartItemMapper {
    int deleteByPrimaryKey(Long cartItemId);

    int insert(ItemaMallShoppingCartItem record);

    int insertSelective(ItemaMallShoppingCartItem record);

    ItemaMallShoppingCartItem selectByPrimaryKey(Long cartItemId);

    ItemaMallShoppingCartItem selectByUserIdAndGoodsId(@Param("itemaMallUserId") Long itemaMallUserId, @Param("goodsId") Long goodsId);

    List<ItemaMallShoppingCartItem> selectByUserId(@Param("itemaMallUserId") Long itemaMallUserId, @Param("number") int number);

    int selectCountByUserId(Long itemaMallUserId);

    int updateByPrimaryKeySelective(ItemaMallShoppingCartItem record);

    int updateByPrimaryKey(ItemaMallShoppingCartItem record);

    int deleteBatch(List<Long> ids);
}