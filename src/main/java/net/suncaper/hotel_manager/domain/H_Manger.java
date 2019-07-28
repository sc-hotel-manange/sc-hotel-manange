package net.suncaper.hotel_manager.domain;

public class H_Manger {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_manager.m_id
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
    private Integer mId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_manager.m_account
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
    private String mAccount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_manager.m_passoword
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
    private String mPassoword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_manager.m_permission
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
    private String mPermission;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_manager.m_id
     *
     * @return the value of h_manager.m_id
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
    public Integer getmId() {
        return mId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_manager.m_id
     *
     * @param mId the value for h_manager.m_id
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
    public void setmId(Integer mId) {
        this.mId = mId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_manager.m_account
     *
     * @return the value of h_manager.m_account
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
    public String getmAccount() {
        return mAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_manager.m_account
     *
     * @param mAccount the value for h_manager.m_account
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
    public void setmAccount(String mAccount) {
        this.mAccount = mAccount == null ? null : mAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_manager.m_passoword
     *
     * @return the value of h_manager.m_passoword
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
    public String getmPassoword() {
        return mPassoword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_manager.m_passoword
     *
     * @param mPassoword the value for h_manager.m_passoword
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
    public void setmPassoword(String mPassoword) {
        this.mPassoword = mPassoword == null ? null : mPassoword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_manager.m_permission
     *
     * @return the value of h_manager.m_permission
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
    public String getmPermission() {
        return mPermission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_manager.m_permission
     *
     * @param mPermission the value for h_manager.m_permission
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
    public void setmPermission(String mPermission) {
        this.mPermission = mPermission == null ? null : mPermission.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_manager
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
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
        H_Manger other = (H_Manger) that;
        return (this.getmId() == null ? other.getmId() == null : this.getmId().equals(other.getmId()))
            && (this.getmAccount() == null ? other.getmAccount() == null : this.getmAccount().equals(other.getmAccount()))
            && (this.getmPassoword() == null ? other.getmPassoword() == null : this.getmPassoword().equals(other.getmPassoword()))
            && (this.getmPermission() == null ? other.getmPermission() == null : this.getmPermission().equals(other.getmPermission()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_manager
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getmId() == null) ? 0 : getmId().hashCode());
        result = prime * result + ((getmAccount() == null) ? 0 : getmAccount().hashCode());
        result = prime * result + ((getmPassoword() == null) ? 0 : getmPassoword().hashCode());
        result = prime * result + ((getmPermission() == null) ? 0 : getmPermission().hashCode());
        return result;
    }
}