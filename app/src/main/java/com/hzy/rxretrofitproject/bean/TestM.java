package com.hzy.rxretrofitproject.bean;

import java.util.List;

/**
 * Created by hzy on 2019/1/11
 **/
public class TestM {
    @Override
    public String toString() {
        return "TestM{" +
                "status='" + status + '\'' +
                ", errorCode=" + errorCode +
                ", messages=" + messages +
                ", data=" + data +
                '}';
    }

    /**
     * status : success
     * messages : []
     * errorCode : 0
     * data : [{"guestId":228701946238730240,"name":"andy","recentVisitImgUrl":"http://qiniuimg1.meirenji.cn/229127790530658304.jpg",
     * "phone":"159723223544"},{"guestId":228708627328794624,"name":"hello","recentVisitImgUrl":"http://qiniuimg1.meirenji
     * .cn/228732671809814528.jpg","phone":"15988999023"},{"guestId":229128844441812992,"name":"tom","recentVisitImgUrl":"http://qiniuimg1.meirenji
     * .cn/229128840272674816.jpg","phone":""},{"guestId":228733441858863104,"name":"小刘","recentVisitImgUrl":"http://qiniuimg1.meirenji
     * .cn/228733426339938304.jpg","phone":"15809871234"},{"guestId":229433955063955456,"name":"小张","recentVisitImgUrl":"http://qiniuimg1.meirenji
     * .cn/229433950597021696.jpg","phone":""},{"guestId":229436250904330240,"name":"小明","recentVisitImgUrl":"http://qiniuimg1.meirenji
     * .cn/229436219124088832.jpg","phone":""},{"guestId":230099018636591104,"name":"小陶","recentVisitImgUrl":"http://qiniuimg1.meirenji
     * .cn/230099013548900352.jpg","phone":""},{"guestId":229433185715355648,"name":"李哥","recentVisitImgUrl":"http://qiniuimg1.meirenji
     * .cn/229433181885956096.jpg","phone":""},{"guestId":229430585104269312,"name":"老李","recentVisitImgUrl":"http://qiniuimg1.meirenji
     * .cn/229430566213124096.jpg","phone":""},{"guestId":229424092963405824,"name":"老王","recentVisitImgUrl":"http://qiniuimg1.meirenji
     * .cn/229424088416780288.jpg","phone":""}]
     */

    private String status;
    private int errorCode;
    private List<?> messages;
    private List<DataBean> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public List<?> getMessages() {
        return messages;
    }

    public void setMessages(List<?> messages) {
        this.messages = messages;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        @Override
        public String toString() {
            return "DataBean{" +
                    "guestId=" + guestId +
                    ", name='" + name + '\'' +
                    ", recentVisitImgUrl='" + recentVisitImgUrl + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }

        /**
         * guestId : 228701946238730240
         * name : andy
         * recentVisitImgUrl : http://qiniuimg1.meirenji.cn/229127790530658304.jpg
         * phone : 159723223544
         */

        private long guestId;
        private String name;
        private String recentVisitImgUrl;
        private String phone;

        public long getGuestId() {
            return guestId;
        }

        public void setGuestId(long guestId) {
            this.guestId = guestId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRecentVisitImgUrl() {
            return recentVisitImgUrl;
        }

        public void setRecentVisitImgUrl(String recentVisitImgUrl) {
            this.recentVisitImgUrl = recentVisitImgUrl;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }
}
