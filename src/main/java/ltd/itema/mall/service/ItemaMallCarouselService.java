
package ltd.itema.mall.service;

import ltd.itema.mall.controller.vo.ItemaMallIndexCarouselVO;
import ltd.itema.mall.entity.Carousel;
import ltd.itema.mall.util.PageQueryUtil;
import ltd.itema.mall.util.PageResult;

import java.util.List;

public interface ItemaMallCarouselService {
    /**
     * 后台分页
     *
     * @param pageUtil
     * @return
     */
    PageResult getCarouselPage(PageQueryUtil pageUtil);

    String saveCarousel(Carousel carousel);

    String updateCarousel(Carousel carousel);

    Carousel getCarouselById(Integer id);

    Boolean deleteBatch(Integer[] ids);

    /**
     * 返回固定数量的轮播图对象(首页调用)
     *
     * @param number
     * @return
     */
    List<ItemaMallIndexCarouselVO> getCarouselsForIndex(int number);
}
