package bysj.crm.domain;


public class Employee {
    private int id;
    private String name;
    private Long jobNumber;
    private Long idCardNumber;
    private int qualification; //学历
    private String phone;
    private String address;
    private String linkedName;
    private String linkedPhone;
    private String linkedAddress;
    private String deptName;
    private String role;
    private int level;
    private double wages;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(Long jobNumber) {
        this.jobNumber = jobNumber;
    }

    public Long getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(Long idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public int getQualification() {
        return qualification;
    }

    public void setQualification(int qualification) {
        this.qualification = qualification;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLinkedName() {
        return linkedName;
    }

    public void setLinkedName(String linkedName) {
        this.linkedName = linkedName;
    }

    public String getLinkedPhone() {
        return linkedPhone;
    }

    public void setLinkedPhone(String linkedPhone) {
        this.linkedPhone = linkedPhone;
    }

    public String getLinkedAddress() {
        return linkedAddress;
    }

    public void setLinkedAddress(String linkedAddress) {
        this.linkedAddress = linkedAddress;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }
}
