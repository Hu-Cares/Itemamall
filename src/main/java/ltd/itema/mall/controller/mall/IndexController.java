package ltd.itema.mall.controller.mall;

import ltd.itema.mall.controller.vo.ItemaMallIndexCarouselVO;
import ltd.itema.mall.common.Constants;
import ltd.itema.mall.common.IndexConfigTypeEnum;
import ltd.itema.mall.controller.vo.ItemaMallIndexCategoryVO;
import ltd.itema.mall.controller.vo.ItemaMallIndexConfigGoodsVO;
import ltd.itema.mall.service.ItemaMallCarouselService;
import ltd.itema.mall.service.ItemaMallCategoryService;
import ltd.itema.mall.service.ItemaMallIndexConfigService;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class IndexController {

    @Resource
    private ItemaMallCarouselService itemaMallCarouselService;

    @Resource
    private ItemaMallIndexConfigService itemaMallIndexConfigService;

    @Resource
    private ItemaMallCategoryService itemaMallCategoryService;

    @GetMapping({"/index", "/", "/index.html"})
    public String indexPage(HttpServletRequest request) {
        List<ItemaMallIndexCategoryVO> categories = itemaMallCategoryService.getCategoriesForIndex();
        if (CollectionUtils.isEmpty(categories)) {
            return "error/error_5xx";
        }
        List<ItemaMallIndexCarouselVO> carousels = itemaMallCarouselService.getCarouselsForIndex(Constants.INDEX_CAROUSEL_NUMBER);
        List<ItemaMallIndexConfigGoodsVO> hotGoodses = itemaMallIndexConfigService.getConfigGoodsesForIndex(IndexConfigTypeEnum.INDEX_GOODS_HOT.getType(), Constants.INDEX_GOODS_HOT_NUMBER);
        List<ItemaMallIndexConfigGoodsVO> newGoodses = itemaMallIndexConfigService.getConfigGoodsesForIndex(IndexConfigTypeEnum.INDEX_GOODS_NEW.getType(), Constants.INDEX_GOODS_NEW_NUMBER);
        List<ItemaMallIndexConfigGoodsVO> recommendGoodses = itemaMallIndexConfigService.getConfigGoodsesForIndex(IndexConfigTypeEnum.INDEX_GOODS_RECOMMOND.getType(), Constants.INDEX_GOODS_RECOMMOND_NUMBER);
        request.setAttribute("categories", categories);//????????????
        request.setAttribute("carousels", carousels);//?????????
        request.setAttribute("hotGoodses", hotGoodses);//????????????
        request.setAttribute("newGoodses", newGoodses);//??????
        request.setAttribute("recommendGoodses", recommendGoodses);//????????????
        return "mall/index";
    }
}
