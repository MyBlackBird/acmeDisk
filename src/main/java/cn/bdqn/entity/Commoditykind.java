package cn.bdqn.entity;

/**
 * Created by samsung on 2018/3/17.
 */
public class Commoditykind {
    /*
    *
    *

            FieldTypeComment
            typeIdint(11) NOT NULL商品类型
            commodityIDint(11) NULL商品ID
            typeNamevarchar(50) NULL类型名称
            parentidint(11) NULL父id
            urlvarchar(50) NULL跳转地址
    *
    * */
    private int typeId , commodityID ,parentId;
    private String typeName,url;

    public Commoditykind() {
    }

    public Commoditykind(int typeId, int commodityID, int parentId, String typeName, String url) {
        this.typeId = typeId;
        this.commodityID = commodityID;
        this.parentId = parentId;
        this.typeName = typeName;
        this.url = url;
    }

    @Override
    public String toString() {
        return "Commoditykind{" +
                "typeId=" + typeId +
                ", commodityID=" + commodityID +
                ", parentId=" + parentId +
                ", typeName='" + typeName + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getCommodityID() {
        return commodityID;
    }

    public void setCommodityID(int commodityID) {
        this.commodityID = commodityID;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
