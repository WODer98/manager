package com.wod.entity;

public class Teacher {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_account
     *
     * @mbg.generated Thu Jun 04 16:53:36 CST 2020
     */
    private String teacherAccount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_password
     *
     * @mbg.generated Thu Jun 04 16:53:36 CST 2020
     */
    private String teacherPassword;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_account
     *
     * @return the value of teacher.teacher_account
     *
     * @mbg.generated Thu Jun 04 16:53:36 CST 2020
     */
    public String getTeacherAccount() {
        return teacherAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_account
     *
     * @param teacherAccount the value for teacher.teacher_account
     *
     * @mbg.generated Thu Jun 04 16:53:36 CST 2020
     */
    public void setTeacherAccount(String teacherAccount) {
        this.teacherAccount = teacherAccount == null ? null : teacherAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_password
     *
     * @return the value of teacher.teacher_password
     *
     * @mbg.generated Thu Jun 04 16:53:36 CST 2020
     */
    public String getTeacherPassword() {
        return teacherPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_password
     *
     * @param teacherPassword the value for teacher.teacher_password
     *
     * @mbg.generated Thu Jun 04 16:53:36 CST 2020
     */
    public void setTeacherPassword(String teacherPassword) {
        this.teacherPassword = teacherPassword == null ? null : teacherPassword.trim();
    }

    public Teacher(String teacherAccount, String teacherPassword) {
        this.teacherAccount = teacherAccount;
        this.teacherPassword = teacherPassword;
    }
}