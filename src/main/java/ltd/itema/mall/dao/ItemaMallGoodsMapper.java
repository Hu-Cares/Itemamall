
package ltd.itema.mall.dao;

import ltd.itema.mall.entity.ItemaMallGoods;
import ltd.itema.mall.entity.ItemaMallshopGoods;
import ltd.itema.mall.entity.StockNumDTO;
import ltd.itema.mall.util.PageQueryUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ItemaMallGoodsMapper {
    int deleteByPrimaryKey(Long goodsId);

    int insert(ItemaMallGoods record);

    int insertSelective(ItemaMallGoods record);

    int shopInsertSelective(ItemaMallshopGoods record);

    ItemaMallGoods selectByPrimaryKey(Long goodsId);

    ItemaMallshopGoods shopSelectByPrimaryKey(Long goodsId); //商家找寻

    ItemaMallGoods selectByCategoryIdAndName(@Param("goodsName") String goodsName, @Param("goodsCategoryId") Long goodsCategoryId);

    int updateByPrimaryKeySelective(ItemaMallGoods record);

    int updateByPrimaryKeyWithBLOBs(ItemaMallGoods record);

    int updateByPrimaryKey(ItemaMallGoods record);

    List<ItemaMallGoods> findItemaMallGoodsList(PageQueryUtil pageUtil);

    int getTotalItemaMallGoods(PageQueryUtil pageUtil);

    List<ItemaMallGoods> selectByPrimaryKeys(List<Long> goodsIds);

    List<ItemaMallGoods> findItemaMallGoodsListBySearch(PageQueryUtil pageUtil);

    int getTotalItemaMallGoodsBySearch(PageQueryUtil pageUtil);

    int batchInsert(@Param("itemaMallGoodsList") List<ItemaMallGoods> itemaMallGoodsList);

    int updateStockNum(@Param("stockNumDTOS") List<StockNumDTO> stockNumDTOS);

    int batchUpdateSellStatus(@Param("orderIds")Long[] orderIds,@Param("sellStatus") int sellStatus);

    boolean addStock(Long goodsId, Integer goodsCount);
}
