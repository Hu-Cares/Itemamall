/**
 * 严肃声明：
 * 开源版本请务必保留此注释头信息，若删除我方将保留所有法律责任追究！
 * 本系统已申请软件著作权，受国家版权局知识产权以及国家计算机软件著作权保护！
 * 可正常分享和学习源码，不得用于违法犯罪活动，违者必究！
 * Copyright (c) 2019-2020 十三 all rights reserved.
 * 版权所有，侵权必究！
 */
package ltd.itema.mall.dao;

import ltd.itema.mall.entity.ItemaMallOrder;
import ltd.itema.mall.util.PageQueryUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ItemaMallOrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(ItemaMallOrder record);

    int insertSelective(ItemaMallOrder record);

    ItemaMallOrder selectByPrimaryKey(Long orderId);

    ItemaMallOrder selectByOrderNo(String orderNo);

    List<ItemaMallOrder>  selectByGoodsId(long goodsId);

    int updateByPrimaryKeySelective(ItemaMallOrder record);

    int updateByPrimaryKey(ItemaMallOrder record);

    List<ItemaMallOrder> findItemaMallOrderList(PageQueryUtil pageUtil);

    int getTotalItemaMallOrders(PageQueryUtil pageUtil);

    List<ItemaMallOrder> selectByPrimaryKeys(@Param("orderIds") List<Long> orderIds);

    int checkOut(@Param("orderIds") List<Long> orderIds);

    int closeOrder(@Param("orderIds") List<Long> orderIds, @Param("orderStatus") int orderStatus);

    int checkDone(@Param("orderIds") List<Long> asList);

    List<ItemaMallOrder> selectPrePayOrders();
}
