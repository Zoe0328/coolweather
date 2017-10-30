package app.coolwheather.com.coolweather.model;

/**
 * Created by zoe on 2017/10/29.
 */

public class Province {
    private int id;
    private String provinceName;
    private String provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = this.id;
    }

    public String getProvinceName() {
        return provinceName;

    }


    public String getProvinceCode() {
        return provinceCode;
    }



    public void setProvinceName(String province_name) {
        this.provinceName=province_name;
    }

    public void setProvinceCode(String province_code) {
        this.provinceCode=provinceCode;
    }
}
