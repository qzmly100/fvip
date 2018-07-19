package com.fvip.cd.fvipplayer.bean;

import java.util.List;

/***************************************************************************************************
 *                                  Copyright (C), Nexgo Inc.                                      *
 *                                    http://www.nexgo.cn                                          *
 ***************************************************************************************************
 * usage           : ${filename}
 * Version         : 1
 * Author          : ruandong
 * Date            : 7/18/2018
 * Modify          : create file
 **************************************************************************************************/
public class PlaylistBean {

    private List<PlatformlistBean> platformlist;
    private List<ListBean> list;

    public List<PlatformlistBean> getPlatformlist() {
        return platformlist;
    }

    public void setPlatformlist(List<PlatformlistBean> platformlist) {
        this.platformlist = platformlist;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class PlatformlistBean {
        /**
         * name : 腾讯视频
         * url : https://v.qq.com/
         */

        private String name;
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public static class ListBean {
        /**
         * name : 原地址
         * url :
         */

        private String name;
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}

