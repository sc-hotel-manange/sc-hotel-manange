package net.suncaper.hotel_manager.domain;

import java.util.Date;

public class H_Order {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_order.o_id
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    private Integer oId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_order.u_id
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    private Integer uId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_order.hotel_id
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    private Integer hotelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_order.r_number
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    private String rNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_order.o_price
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    private Integer oPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_order.o_orderTime
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    private Date oOrdertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_order.o_checkin
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    private Date oCheckin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_order.o_checkout
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    private Date oCheckout;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_order.o_status
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    private String oStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_order.o_tel
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    private String oTel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_order.o_id
     *
     * @return the value of h_order.o_id
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    public Integer getoId() {
        return oId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_order.o_id
     *
     * @param oId the value for h_order.o_id
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    public void setoId(Integer oId) {
        this.oId = oId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_order.u_id
     *
     * @return the value of h_order.u_id
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    public Integer getuId() {
        return uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_order.u_id
     *
     * @param uId the value for h_order.u_id
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    public void setuId(Integer uId) {
        this.uId = uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_order.hotel_id
     *
     * @return the value of h_order.hotel_id
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    public Integer getHotelId() {
        return hotelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_order.hotel_id
     *
     * @param hotelId the value for h_order.hotel_id
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_order.r_number
     *
     * @return the value of h_order.r_number
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    public String getrNumber() {
        return rNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_order.r_number
     *
     * @param rNumber the value for h_order.r_number
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    public void setrNumber(String rNumber) {
        this.rNumber = rNumber == null ? null : rNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_order.o_price
     *
     * @return the value of h_order.o_price
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    public Integer getoPrice() {
        return oPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_order.o_price
     *
     * @param oPrice the value for h_order.o_price
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    public void setoPrice(Integer oPrice) {
        this.oPrice = oPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_order.o_orderTime
     *
     * @return the value of h_order.o_orderTime
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    public Date getoOrdertime() {
        return oOrdertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_order.o_orderTime
     *
     * @param oOrdertime the value for h_order.o_orderTime
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    public void setoOrdertime(Date oOrdertime) {
        this.oOrdertime = oOrdertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_order.o_checkin
     *
     * @return the value of h_order.o_checkin
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    public Date getoCheckin() {
        return oCheckin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_order.o_checkin
     *
     * @param oCheckin the value for h_order.o_checkin
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    public void setoCheckin(Date oCheckin) {
        this.oCheckin = oCheckin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_order.o_checkout
     *
     * @return the value of h_order.o_checkout
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    public Date getoCheckout() {
        return oCheckout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_order.o_checkout
     *
     * @param oCheckout the value for h_order.o_checkout
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    public void setoCheckout(Date oCheckout) {
        this.oCheckout = oCheckout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_order.o_status
     *
     * @return the value of h_order.o_status
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    public String getoStatus() {
        return oStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_order.o_status
     *
     * @param oStatus the value for h_order.o_status
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    public void setoStatus(String oStatus) {
        this.oStatus = oStatus == null ? null : oStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_order.o_tel
     *
     * @return the value of h_order.o_tel
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    public String getoTel() {
        return oTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_order.o_tel
     *
     * @param oTel the value for h_order.o_tel
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    public void setoTel(String oTel) {
        this.oTel = oTel == null ? null : oTel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_order
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        H_Order other = (H_Order) that;
        return (this.getoId() == null ? other.getoId() == null : this.getoId().equals(other.getoId()))
            && (this.getuId() == null ? other.getuId() == null : this.getuId().equals(other.getuId()))
            && (this.getHotelId() == null ? other.getHotelId() == null : this.getHotelId().equals(other.getHotelId()))
            && (this.getrNumber() == null ? other.getrNumber() == null : this.getrNumber().equals(other.getrNumber()))
            && (this.getoPrice() == null ? other.getoPrice() == null : this.getoPrice().equals(other.getoPrice()))
            && (this.getoOrdertime() == null ? other.getoOrdertime() == null : this.getoOrdertime().equals(other.getoOrdertime()))
            && (this.getoCheckin() == null ? other.getoCheckin() == null : this.getoCheckin().equals(other.getoCheckin()))
            && (this.getoCheckout() == null ? other.getoCheckout() == null : this.getoCheckout().equals(other.getoCheckout()))
            && (this.getoStatus() == null ? other.getoStatus() == null : this.getoStatus().equals(other.getoStatus()))
            && (this.getoTel() == null ? other.getoTel() == null : this.getoTel().equals(other.getoTel()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_order
     *
     * @mbg.generated Thu Aug 01 11:41:43 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getoId() == null) ? 0 : getoId().hashCode());
        result = prime * result + ((getuId() == null) ? 0 : getuId().hashCode());
        result = prime * result + ((getHotelId() == null) ? 0 : getHotelId().hashCode());
        result = prime * result + ((getrNumber() == null) ? 0 : getrNumber().hashCode());
        result = prime * result + ((getoPrice() == null) ? 0 : getoPrice().hashCode());
        result = prime * result + ((getoOrdertime() == null) ? 0 : getoOrdertime().hashCode());
        result = prime * result + ((getoCheckin() == null) ? 0 : getoCheckin().hashCode());
        result = prime * result + ((getoCheckout() == null) ? 0 : getoCheckout().hashCode());
        result = prime * result + ((getoStatus() == null) ? 0 : getoStatus().hashCode());
        result = prime * result + ((getoTel() == null) ? 0 : getoTel().hashCode());
        return result;
    }
}