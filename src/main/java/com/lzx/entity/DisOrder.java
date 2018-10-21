package com.lzx.entity;

import java.math.BigDecimal;

public class DisOrder {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_order.order_id
     *
     * @mbg.generated
     */
    private String orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_order.car_id
     *
     * @mbg.generated
     */
    private String carId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_order.customer_id
     *
     * @mbg.generated
     */
    private String customerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_order.post_pname
     *
     * @mbg.generated
     */
    private String postPname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_order.post_ptel
     *
     * @mbg.generated
     */
    private String postPtel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_order.post_paddr
     *
     * @mbg.generated
     */
    private String postPaddr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_order.get_pname
     *
     * @mbg.generated
     */
    private String getPname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_order.get_ptel
     *
     * @mbg.generated
     */
    private String getPtel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_order.get_paddr
     *
     * @mbg.generated
     */
    private String getPaddr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_order.goods_name
     *
     * @mbg.generated
     */
    private String goodsName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_order.goods_weight
     *
     * @mbg.generated
     */
    private Integer goodsWeight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_order.order_type
     *
     * @mbg.generated
     */
    private String orderType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_order.order_state
     *
     * @mbg.generated
     */
    private String orderState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_order.transport_price
     *
     * @mbg.generated
     */
    private BigDecimal transportPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_order.delivery_price
     *
     * @mbg.generated
     */
    private BigDecimal deliveryPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_order.total_price
     *
     * @mbg.generated
     */
    private String totalPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_order.comment
     *
     * @mbg.generated
     */
    private String comment;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_order.order_id
     *
     * @return the value of dis_order.order_id
     *
     * @mbg.generated
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_order.order_id
     *
     * @param orderId the value for dis_order.order_id
     *
     * @mbg.generated
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_order.car_id
     *
     * @return the value of dis_order.car_id
     *
     * @mbg.generated
     */
    public String getCarId() {
        return carId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_order.car_id
     *
     * @param carId the value for dis_order.car_id
     *
     * @mbg.generated
     */
    public void setCarId(String carId) {
        this.carId = carId == null ? null : carId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_order.customer_id
     *
     * @return the value of dis_order.customer_id
     *
     * @mbg.generated
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_order.customer_id
     *
     * @param customerId the value for dis_order.customer_id
     *
     * @mbg.generated
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_order.post_pname
     *
     * @return the value of dis_order.post_pname
     *
     * @mbg.generated
     */
    public String getPostPname() {
        return postPname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_order.post_pname
     *
     * @param postPname the value for dis_order.post_pname
     *
     * @mbg.generated
     */
    public void setPostPname(String postPname) {
        this.postPname = postPname == null ? null : postPname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_order.post_ptel
     *
     * @return the value of dis_order.post_ptel
     *
     * @mbg.generated
     */
    public String getPostPtel() {
        return postPtel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_order.post_ptel
     *
     * @param postPtel the value for dis_order.post_ptel
     *
     * @mbg.generated
     */
    public void setPostPtel(String postPtel) {
        this.postPtel = postPtel == null ? null : postPtel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_order.post_paddr
     *
     * @return the value of dis_order.post_paddr
     *
     * @mbg.generated
     */
    public String getPostPaddr() {
        return postPaddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_order.post_paddr
     *
     * @param postPaddr the value for dis_order.post_paddr
     *
     * @mbg.generated
     */
    public void setPostPaddr(String postPaddr) {
        this.postPaddr = postPaddr == null ? null : postPaddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_order.get_pname
     *
     * @return the value of dis_order.get_pname
     *
     * @mbg.generated
     */
    public String getGetPname() {
        return getPname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_order.get_pname
     *
     * @param getPname the value for dis_order.get_pname
     *
     * @mbg.generated
     */
    public void setGetPname(String getPname) {
        this.getPname = getPname == null ? null : getPname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_order.get_ptel
     *
     * @return the value of dis_order.get_ptel
     *
     * @mbg.generated
     */
    public String getGetPtel() {
        return getPtel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_order.get_ptel
     *
     * @param getPtel the value for dis_order.get_ptel
     *
     * @mbg.generated
     */
    public void setGetPtel(String getPtel) {
        this.getPtel = getPtel == null ? null : getPtel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_order.get_paddr
     *
     * @return the value of dis_order.get_paddr
     *
     * @mbg.generated
     */
    public String getGetPaddr() {
        return getPaddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_order.get_paddr
     *
     * @param getPaddr the value for dis_order.get_paddr
     *
     * @mbg.generated
     */
    public void setGetPaddr(String getPaddr) {
        this.getPaddr = getPaddr == null ? null : getPaddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_order.goods_name
     *
     * @return the value of dis_order.goods_name
     *
     * @mbg.generated
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_order.goods_name
     *
     * @param goodsName the value for dis_order.goods_name
     *
     * @mbg.generated
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_order.goods_weight
     *
     * @return the value of dis_order.goods_weight
     *
     * @mbg.generated
     */
    public Integer getGoodsWeight() {
        return goodsWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_order.goods_weight
     *
     * @param goodsWeight the value for dis_order.goods_weight
     *
     * @mbg.generated
     */
    public void setGoodsWeight(Integer goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_order.order_type
     *
     * @return the value of dis_order.order_type
     *
     * @mbg.generated
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_order.order_type
     *
     * @param orderType the value for dis_order.order_type
     *
     * @mbg.generated
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_order.order_state
     *
     * @return the value of dis_order.order_state
     *
     * @mbg.generated
     */
    public String getOrderState() {
        return orderState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_order.order_state
     *
     * @param orderState the value for dis_order.order_state
     *
     * @mbg.generated
     */
    public void setOrderState(String orderState) {
        this.orderState = orderState == null ? null : orderState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_order.transport_price
     *
     * @return the value of dis_order.transport_price
     *
     * @mbg.generated
     */
    public BigDecimal getTransportPrice() {
        return transportPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_order.transport_price
     *
     * @param transportPrice the value for dis_order.transport_price
     *
     * @mbg.generated
     */
    public void setTransportPrice(BigDecimal transportPrice) {
        this.transportPrice = transportPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_order.delivery_price
     *
     * @return the value of dis_order.delivery_price
     *
     * @mbg.generated
     */
    public BigDecimal getDeliveryPrice() {
        return deliveryPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_order.delivery_price
     *
     * @param deliveryPrice the value for dis_order.delivery_price
     *
     * @mbg.generated
     */
    public void setDeliveryPrice(BigDecimal deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_order.total_price
     *
     * @return the value of dis_order.total_price
     *
     * @mbg.generated
     */
    public String getTotalPrice() {
        return totalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_order.total_price
     *
     * @param totalPrice the value for dis_order.total_price
     *
     * @mbg.generated
     */
    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice == null ? null : totalPrice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_order.comment
     *
     * @return the value of dis_order.comment
     *
     * @mbg.generated
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_order.comment
     *
     * @param comment the value for dis_order.comment
     *
     * @mbg.generated
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}