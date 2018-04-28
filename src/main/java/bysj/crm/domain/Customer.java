package bysj.crm.domain;

public class Customer {

    private int id;
    private String name;
    private String phone;
    private String address;
    private String companyName;
    private String companyTel;
    private String companyAddress;
    private String linkedName;
    private String linkedPhone;
    private String linkedAddress;
    private int level;

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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyTel() {
        return companyTel;
    }

    public void setCompanyTel(String companyTel) {
        this.companyTel = companyTel;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
