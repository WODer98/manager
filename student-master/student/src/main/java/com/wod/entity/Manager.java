package com.wod.entity;

public class Manager {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manager.id
     *
     * @mbg.generated Thu Jun 04 16:53:36 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manager.username
     *
     * @mbg.generated Thu Jun 04 16:53:36 CST 2020
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manager.password
     *
     * @mbg.generated Thu Jun 04 16:53:36 CST 2020
     */
    private String password;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manager.id
     *
     * @return the value of manager.id
     *
     * @mbg.generated Thu Jun 04 16:53:36 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manager.id
     *
     * @param id the value for manager.id
     *
     * @mbg.generated Thu Jun 04 16:53:36 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manager.username
     *
     * @return the value of manager.username
     *
     * @mbg.generated Thu Jun 04 16:53:36 CST 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manager.username
     *
     * @param username the value for manager.username
     *
     * @mbg.generated Thu Jun 04 16:53:36 CST 2020
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manager.password
     *
     * @return the value of manager.password
     *
     * @mbg.generated Thu Jun 04 16:53:36 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manager.password
     *
     * @param password the value for manager.password
     *
     * @mbg.generated Thu Jun 04 16:53:36 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Manager(String username, String password) {
        this.username = username;
        this.password = password;
    }
}