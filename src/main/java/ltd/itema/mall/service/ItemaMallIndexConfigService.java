
package ltd.itema.mall.service;

import ltd.itema.mall.controller.vo.ItemaMallIndexConfigGoodsVO;
import ltd.itema.mall.entity.IndexConfig;
import ltd.itema.mall.util.PageQueryUtil;
import ltd.itema.mall.util.PageResult;

import java.util.List;

public interface ItemaMallIndexConfigService {
    /**
     * 后台分页
     *
     * @param pageUtil
     * @return
     */
    PageResult getConfigsPage(PageQueryUtil pageUtil);

    String saveIndexConfig(IndexConfig indexConfig);

    String updateIndexConfig(IndexConfig indexConfig);

    IndexConfig getIndexConfigById(Long id);

    /**
     * 返回固定数量的首页配置商品对象(首页调用)
     *
     * @param number
     * @return
     */
    List<ItemaMallIndexConfigGoodsVO> getConfigGoodsesForIndex(int configType, int number);

    Boolean deleteBatch(Long[] ids);
}
