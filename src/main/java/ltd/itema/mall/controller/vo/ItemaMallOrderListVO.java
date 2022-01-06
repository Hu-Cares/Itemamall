
package ltd.itema.mall.controller.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 订单列表页面VO
 */
public class ItemaMallOrderListVO implements Serializable {

    private Long orderId;

    private String orderNo;

    private Integer totalPrice;

    private Byte payType;

    private Byte orderStatus;

    private String orderStatusString;

    private String userAddress;

    private Date createTime;

    private List<ItemaMallOrderItemVO> itemaMallOrderItemVOS;

    private String comment;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Byte getPayType() {
        return payType;
    }

    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    public Byte getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatusString() {
        return orderStatusString;
    }

    public void setOrderStatusString(String orderStatusString) {
        this.orderStatusString = orderStatusString;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<ItemaMallOrderItemVO> getItemaMallOrderItemVOS() {
        return itemaMallOrderItemVOS;
    }

    public void setItemaMallOrderItemVOS(List<ItemaMallOrderItemVO> itemaMallOrderItemVOS) {
        this.itemaMallOrderItemVOS = itemaMallOrderItemVOS;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "ItemaMallOrderListVO{" +
                "orderId=" + orderId +
                ", orderNo='" + orderNo + '\'' +
                ", totalPrice=" + totalPrice +
                ", payType=" + payType +
                ", orderStatus=" + orderStatus +
                ", orderStatusString='" + orderStatusString + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", createTime=" + createTime +
                ", itemaMallOrderItemVOS=" + itemaMallOrderItemVOS +
                ", comment='" + comment + '\'' +
                '}';
    }
}
