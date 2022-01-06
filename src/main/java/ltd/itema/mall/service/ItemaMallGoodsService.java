
package ltd.itema.mall.service;

import ltd.itema.mall.entity.ItemaMallshopGoods;
import ltd.itema.mall.entity.ItemaMallGoods;
import ltd.itema.mall.util.PageQueryUtil;
import ltd.itema.mall.util.PageResult;

import java.util.List;

public interface ItemaMallGoodsService {
    /**
     * 后台分页
     *
     * @param pageUtil
     * @return
     */
    PageResult getItemaMallGoodsPage(PageQueryUtil pageUtil);

    /**
     * 添加商品
     *
     * @param goods
     * @return
     */
    String saveItemaMallGoods(ItemaMallGoods goods);
    /**
     * 添加商品
     *
     * @param goods
     * @return
     */
    String shopSaveItemaMallGoods(ItemaMallshopGoods goods);
    /**
     * 批量新增商品数据
     *
     * @param itemaMallGoodsList
     * @return
     */
    void batchSaveItemaMallGoods(List<ItemaMallGoods> itemaMallGoodsList);

    /**
     * 修改商品信息
     *
     * @param goods
     * @return
     */
    String updateItemaMallGoods(ItemaMallGoods goods);

    /**
     * 获取商品详情
     *
     * @param id
     * @return
     */
    ItemaMallGoods getItemaMallGoodsById(Long id);

    List<String> getItemaMallCommentById(Long id);

    /**
     * 商家获取商品详情
     *
     * @param id
     * @return
     */
    ItemaMallshopGoods getItemaMallShopGoodsById(Long id);
    /**
     * 批量修改销售状态(上架下架)
     *
     * @param ids
     * @return
     */
    Boolean batchUpdateSellStatus(Long[] ids,int sellStatus);

    /**
     * 商品搜索
     *
     * @param pageUtil
     * @return
     */
    PageResult searchItemaMallGoods(PageQueryUtil pageUtil);
}
